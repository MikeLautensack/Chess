const stockfish = new Worker("./stockfish.js");

export async function GET() {
  console.log(stockfish)
  return Response.json({ stockfish })
}