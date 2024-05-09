import { io } from ".";

export const lobbyHandler = (socket: any) => {
  console.log(`Socket: ${socket.id}, has connected to the lobby namespace`);
  socket.on("createLobby", (lobby: string) => {
    try {
      socket.join(lobby);
      console.log(`Socket: ${socket.id}, created lobby: ${lobby}`);
      socket.emit("lobbyCreated", lobby);
    } catch (error) {
      console.log("Error creating lobby", error);
    }
  });
  socket.on("joinLobby", (lobby: string) => {
    try {
      socket.join(lobby);
      console.log(`Socket: ${socket.id}, joined lobby: ${lobby}`);
    } catch (error) {
      console.log("Error joining lobby", error);
    }
  });
  socket.on("leaveLobby", (lobby: string) => {
    try {
      socket.leave(lobby);
      console.log(`Socket: ${socket.id}, left lobby: ${lobby}`);
    } catch (error) {
      console.log("Error leaving lobby", error);
    }
  });
};
