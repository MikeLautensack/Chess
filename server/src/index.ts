import express, { Request, Response } from "express";
import { createServer } from "node:http";
import { Server } from "socket.io";
import { mainHandler } from "./mainHandler";
import { lobbyHandler } from "./lobbyHandler";
import { gameroomHandler } from "./gameroomHandler";
import { chatHandler } from "./chatHandler";
import type {
  ClientToServerEvents,
  InterServerEvents,
  ServerToClientEvents,
  SocketData,
} from "./types";

const app = express();
const server = createServer(app);
const io = new Server<
  ClientToServerEvents,
  ServerToClientEvents,
  InterServerEvents,
  SocketData
>(server);
const port = process.env.PORT || 3000;

app.get("/", (req: Request, res: Response) => {
  res.send("Hello World!");
});

server.listen(port, () => {
  console.log(`Chess multiplayer server listening on port ${port}`);
});

io.on("connection", mainHandler);

io.of("/lobby").on("connection", lobbyHandler);

io.of("/gameroom").on("connection", gameroomHandler);

io.of("/chat").on("connection", chatHandler);
