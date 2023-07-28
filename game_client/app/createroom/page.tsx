import Button from '../components/Button'
import SideNav from '../components/SideNav'

export default function CreateRoom() {
    return (
      <main className="flex min-h-screen bg-gradient-to-br from-gray-500 via-blue-600 to-indigo-900">
        <SideNav />
        <div id='content' className='flex flex-col justify-center items-center relative w-full h-screen'>
            <h1 className='text-3xl text-gray-50 m-5 absolute top-0 left-0'>Create Room</h1>
            <form className='w-1/3'>
              <div className='flex justify-center flex-col w-full'>
                  <label>Room Name</label>
                  <input></input>
              </div>
              <div className='flex justify-center flex-col w-full'>
                  <label className=''>Room Password</label>
                  <input className=''></input>
              </div>
              <div className='flex justify-center'>
                <div className='flex'>
                  <label className=''>Public</label>
                  <input className='' type="checkbox"></input>
                </div>
                <div className='flex'>
                  <label className=''>Private</label>
                  <input className='' type="checkbox"></input>
                </div>
              </div>
              <div className='flex justify-center'>
                <div className='flex'>
                  <label className=''>Local</label>
                  <input className='' type="checkbox"></input>
                </div>
                <div className='flex'>
                  <label className=''>Online</label>
                  <input className='' type="checkbox"></input>
                </div>
              </div>
              <div className='flex justify-center'>
                  <Button

                  >
                      Create Room
                  </Button>
              </div>
            </form>
        </div>
      </main>
    )
  }