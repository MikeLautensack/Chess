import React from "react";
import { Client } from "./Lobbys";
import type { LobbyType } from "./Lobbys";

const Lobby = ({ lobbyID, clients }: LobbyType) => {
  return (
    <div className="flex flex-col gap-2">
      <p className="font-bold text-2xl">{`Lobby: ${lobbyID}`}</p>
      <div className="flex flex-col gap-2">
        <p className="font-medium text-blue-800 ml-4">Clients</p>
        <ul className="flex flex-col gap-2">
          {clients.map((client: Client) => (
            <li key={parseInt(client.clientID)}>
              <p className="ml-8">{`Client: ${client.clientID}`}</p>
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default Lobby;
