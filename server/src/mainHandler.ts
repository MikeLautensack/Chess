export const mainHandler = (socket: any) => {
  console.log(`${socket.data.username} has connected to the main namespace`);
  console.log(`${socket.data.username} has this data ${socket.data}`);
};
