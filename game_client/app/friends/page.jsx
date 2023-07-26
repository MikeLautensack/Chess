import Button from '../components/Button'
import Search from '../components/Search'
import SideNav from '../components/SideNav'

export default function Friends() {
    return (
      <main className="flex min-h-screen bg-gradient-to-br from-gray-500 via-blue-600 to-indigo-900">
        <SideNav />
        <div id='content' className='w-full h-screen'>
            <h1 className='text-3xl text-gray-50 m-5'>Friends</h1>
            <div className='flex w-full justify-between px-4'>
              <div className='flex gap-2'>
                <Button
                  className='text-blue-500 font-medium border-blue-500 border p-2'
                >
                  Find Friends
                </Button>
                <Button
                  className='text-blue-500 font-medium border-blue-500 border p-2'
                >
                  Filters
                </Button>
              </div>
              <div>
                <Search
                  inputStyles='rounded-l-full'
                  buttonStyles='bg-blue-500 text-white rounded-r-full px-2'
                />
              </div>
            </div>
            <div>
              
            </div>
        </div>
      </main>
    )
  }