"use client";

import React, { createContext, useContext } from "react";
import { io } from "socket.io-client";

type SocketContextProviderProps = {
  children: React.ReactNode;
};

type SocketContextState = {
  mainSocket: any;
  lobbySocket: any;
  gameroomSocket: any;
  chatroomSocket: any;
};

export const SocketContext = createContext<SocketContextState | null>(null);

const SocketContextProvider = ({ children }: SocketContextProviderProps) => {
  const mainSocket = io("/", {
    autoConnect: false,
  });
  const lobbySocket = io("http://localhost:5000/lobby", {
    autoConnect: false,
  });
  const gameroomSocket = io("http://localhost:5000/gameroom", {
    autoConnect: false,
  });
  const chatroomSocket = io("http://localhost:5000/chat", {
    autoConnect: false,
  });
  return (
    <SocketContext.Provider
      value={{
        mainSocket,
        lobbySocket,
        gameroomSocket,
        chatroomSocket,
      }}
    >
      {children}
    </SocketContext.Provider>
  );
};

export default SocketContextProvider;

export const useSocketContext = () => {
  const context = useContext(SocketContext);
  if (!context) {
    throw new Error(
      "useSocketContext must be used within a SocketContextProvider"
    );
  }
  return context;
};
