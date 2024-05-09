import React from "react";
import { Client } from "./Lobbys";
import type { LobbyType } from "./Lobbys";

const Lobby = ({ lobbyID, clients }: LobbyType) => {
  return (
    <div>
      <p>{`Lobby: ${lobbyID}`}</p>
      <div>
        <p>Clients</p>
        <ul>
          {clients.map((client: Client) => (
            <li key={parseInt(client.clientID)}>
              <p>{`Client: ${client.clientID}`}</p>
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default Lobby;
