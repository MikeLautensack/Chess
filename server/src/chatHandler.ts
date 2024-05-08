export const chatHandler = (socket: any) => {
  console.log(`${socket.data.username} has connected to the chat namespace`);
  console.log(`${socket.data.username} has this data ${socket.data}`);
};
