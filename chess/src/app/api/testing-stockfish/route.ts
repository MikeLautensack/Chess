var stockfish = require("stockfish");

export async function GET() {
  console.log(stockfish)
  return Response.json({ stockfish })
}