export const lobbyHandler = (socket: any) => {
  console.log(`${socket.data.username} has connected to the lobby namespace`);
  console.log(`${socket.data.username} has this data ${socket.data}`);
};
