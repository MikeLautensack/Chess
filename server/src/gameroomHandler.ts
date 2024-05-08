export const gameroomHandler = (socket: any) => {
  console.log(
    `${socket.data.username} has connected to the gameroom namespace`
  );
  console.log(`${socket.data.username} has this data ${socket.data}`);
};
