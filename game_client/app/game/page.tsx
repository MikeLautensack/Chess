import GameData from '../components/GameData'
import Chat from '../components/Chat'
import Board from '../components/Board'
import GameNotation from '../components/GameNotation'

export default function Game() {
    return (
      <main className="flex w-full min-h-screen bg-gradient-to-br from-gray-500 via-blue-600 to-indigo-900">
        <div id='sidebar' className='flex flex-col p-4 gap-4 bg-[#64748B] w-80'>
          <GameData />
          <Chat />
        </div>
        <div id='content' className='flex flex-col w-full'>
          <div className='flex justify-end'>
            <h1 className='text-blue-400 m-4'>Exit Game</h1>
          </div>
          <div className='flex flex-col justify-center items-start h-full mx-12' id='board and game notation'>
            <div className='flex w-1/2 h-10 my-2' id='opponent info'>
              <h2 className='w-full'>Playing White</h2>
              <div className='w-full' id='captured pieces'>

              </div>
            </div>
            <div className='flex gap-4 w-full'>
              <Board />
              <GameNotation />
            </div>
            <div className='flex w-1/2 h-10 my-2' id='player info'>
              <h2 className='w-full'>Playing White</h2>
              <div className='w-full' id='captured pieces'>

              </div>
            </div>
          </div>
        </div>
      </main>
    )
  }