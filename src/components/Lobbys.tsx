"use client";

import React, { useEffect, useState } from "react";
import Lobby from "./Lobby";
import { Button, TextField } from "@mui/material";
import { Controller, useForm } from "react-hook-form";
import { zodResolver } from "@hookform/resolvers/zod";
import { z } from "zod";
import { useSocketContext } from "./context/SocketContext";

type Lobbys = {
  lobbys: LobbyType[];
};

export type LobbyType = {
  lobbyID: string;
  clients: Client[];
};

export type Client = {
  clientID: string;
};

const LobbysFormSchema = z.object({
  lobbyName: z.string(),
});

type LobbysFormValues = z.infer<typeof LobbysFormSchema>;

const Lobbys = ({ username }: { username: string }) => {
  const [lobbys, setLobbys] = useState<LobbyType[]>([]);

  const { lobbySocket } = useSocketContext();

  const {
    handleSubmit,
    control,
    formState: { errors },
  } = useForm<LobbysFormValues>({
    resolver: zodResolver(LobbysFormSchema),
    defaultValues: { lobbyName: "" },
  });

  useEffect(() => {
    lobbySocket.connect();

    const handleLobbyCreated = (lobby: {
      lobbyName: string;
      username: string;
    }) => {
      console.log(`this is the lobby obj in the res ${lobby}`);
      setLobbys((prev) => [
        ...prev,
        { lobbyID: lobby.lobbyName, clients: [{ clientID: lobby.username }] },
      ]);
      console.log(`Lobby created: ${lobby.lobbyName}`);
    };

    lobbySocket.on("lobbyCreated", handleLobbyCreated);

    return () => {
      lobbySocket.off("lobbyCreated", handleLobbyCreated);
      lobbySocket.disconnect();
    };
  }, []);

  const onSubmit = (data: LobbysFormValues) => {
    console.log("form data", data.lobbyName);
    console.log("create lobby, lobbyName: ", data.lobbyName);
    lobbySocket.emit("createLobby", {
      lobbyName: data.lobbyName,
      username: username,
    });
  };

  return (
    <div className="flex flex-col gap-2">
      <ul>
        {lobbys.map((lobby: LobbyType) => (
          <li key={lobby.lobbyID}>
            <Lobby lobbyID={lobby.lobbyID} clients={lobby.clients} />
          </li>
        ))}
      </ul>
      <form className="flex flex-col gap-2" onSubmit={handleSubmit(onSubmit)}>
        <Controller
          name="lobbyName"
          control={control}
          render={({ field }) => (
            <TextField
              {...field}
              label="lobbyName"
              error={!!errors.lobbyName}
              helperText={errors.lobbyName?.message as React.ReactNode}
            />
          )}
        />
        <Button type="submit">Create Lobby</Button>
      </form>
    </div>
  );
};

export default Lobbys;
