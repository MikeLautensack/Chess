import { Engine } from 'node-uci'
var stockfish = new Worker('stockfish.js');

export async function GET() {
  try {
    // const engine = new Engine('engine/executable/path')
    // await engine.init()
    // await engine.setoption('MultiPV', '4')
    // await engine.isready()
    // console.log('engine ready', engine)
    // const result = await engine.go({ nodes: 2500000 })
    // console.log('result', result)
    // await engine.quit()
    // return Response.json({ engine })
  } catch (error) {
    console.log(error)
    return Response.json({ stockfish })
  }
}