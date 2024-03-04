import express, { Request, Response } from "express";
import { createServer } from "node:http";
import { Server } from "socket.io";

const app = express();
const server = createServer(app);
const io = new Server(server);
const port = process.env.PORT || 3000;

app.get("/", (req: Request, res: Response) => {
  res.send("Hello World!");
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
})

export {
  io
}