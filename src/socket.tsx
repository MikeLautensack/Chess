"use client";

import { io } from "socket.io-client";

export const mainSocket = io("/", {
  autoConnect: false,
});
export const lobbySocket = io("http://localhost:5000/lobby", {
  autoConnect: false,
});
export const gameroomSocket = io("http://localhost:5000/gameroom", {
  autoConnect: false,
});
export const chatroomSocket = io("http://localhost:5000/chat", {
  autoConnect: false,
});
