import { io } from "../index";

io.of("/lobbys").on("connection", (socket) => {
  socket.on("order:list", () => {});
  socket.on("order:create", () => {});
});