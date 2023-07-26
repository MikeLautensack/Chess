import Button from './Button'

export default function TopNav() {
    return (
      <nav className='flex flex-col w-80 bg-[#334155] h-screen'>
        <h2 className='text-gray-100 m-5 text-4xl'>Chess App</h2>
        <div>

        </div>
        <div className='flex flex-col items-start w-full pt-20 pl-20'>
            <Button
                className='text-white'
            >
                Dashboard
            </Button>
            <Button
                className='text-white my-2'
            >
                Friends
            </Button>
            <Button
                className='text-white'
            >
                Game Rooms
            </Button>
        </div>
      </nav>
    )
}