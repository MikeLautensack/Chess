import Button from './Button'

export default function TopNav() {
    return (
      <nav className='absolute top-0 left-0 flex justify-between w-full bg-[#334155]'>
        <h3 className='m-2 text-[#F8FAFC] align-middle text-center text-1xl'>Chess App</h3>
        <div className=' flex m-2 gap-2'>
            <Button
              className='bg-white text-blue-500 p-2'
            >
              Log In
            </Button>
            <Button
              className='bg-blue-500 text-white p-2'
            >
              Sign Up
            </Button>
        </div>
      </nav>
    )
}