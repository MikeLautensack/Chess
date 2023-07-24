import Button from './Button'

export default function TopNav() {
    return (
      <nav className='flex flex-col w-80 bg-[#334155] h-screen'>
        <h2 className='text-gray-100 m-5 text-4xl'>Chess App</h2>
        <div>

        </div>
        <div className='flex flex-col items-start w-full p-20'>
            <Button
                buttonStyles={{
                    color: '#F9FAFB',
                    margin: '.5rem 0'
                }}
            >
                Dashboard
            </Button>
            <Button
                buttonStyles={{
                    color: '#F9FAFB',
                    margin: '.5rem 0'
                }}
            >
                Friends
            </Button>
            <Button
                buttonStyles={{
                    color: '#F9FAFB',
                    margin: '.5rem 0'
                }}
            >
                Game Rooms
            </Button>
        </div>
      </nav>
    )
}