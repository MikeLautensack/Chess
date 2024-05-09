"use client";

import React, { useState } from "react";
import Lobby from "./Lobby";
import { Button } from "@mui/material";
import { io } from "socket.io-client";

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

const Lobbys = () => {
  const [lobbys, setLobbys] = useState<LobbyType[]>([]);
  const lobbySocket = io("http://localhost:5000/lobby");

  lobbySocket.on("lobbyCreated", (lobby) => {
    console.log(`Lobby created: ${lobby}`);
    console.log(typeof lobby);
  });

  const createLobby = () => {
    const num = Math.random();
    lobbySocket.emit("createLobby", `test lobby ${num}`);
  };

  return (
    <div>
      <ul>
        {lobbys.map((lobby: LobbyType) => (
          <Lobby
            key={lobby.lobbyID}
            lobbyID={lobby.lobbyID}
            clients={lobby.clients}
          />
        ))}
      </ul>
      <Button onClick={createLobby}>Create Lobby</Button>
    </div>
  );
};

export default Lobbys;
