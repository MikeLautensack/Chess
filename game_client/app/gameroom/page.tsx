import Button from '../components/Button'
import SideNav from '../components/SideNav'

export default function GameRoom() {
    return (
      <main className="flex min-h-screen bg-gradient-to-br from-gray-500 via-blue-600 to-indigo-900">
        <SideNav />
        <div id='content' className='w-full h-screen'>
            <h1 className='text-3xl text-gray-50 m-5'>Game Room</h1>
        </div>
      </main>
    )
  }