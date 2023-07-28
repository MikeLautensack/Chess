import Button from '../components/Button'
import GameData from '../components/GameData'
import Chat from '../components/Chat'
import SideNav from '../components/SideNav'

export default function Game() {
    return (
      <main className="flex min-h-screen bg-gradient-to-br from-gray-500 via-blue-600 to-indigo-900">
        <div id='sidebar' className='bg-[#64748B] w-80'>
          <GameData />
          <Chat />
        </div>
        <div id='content'>
          <div>
            <h1>Exit Game</h1>
          </div>
          <div className='' id='opponent info'>
            <h2></h2>
            <div id='captured pieces'>

            </div>
          </div>
          <div className='' id='board and game notation'>

          </div>
          <div className='' id='player info'>
              <h2></h2>
            <div id='captured pieces'>

            </div>
          </div>
        </div>
      </main>
    )
  }