import { io } from "../index";

io.of("/game-rooms").on("connection", (socket) => {
  socket.on("order:list", () => {});
  socket.on("order:create", () => {});
});