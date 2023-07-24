import Button from './Button'

export default function TopNav() {
    return (
      <nav className='absolute top-0 left-0 flex justify-between w-full bg-[#334155]'>
        <h3 className='m-2 text-[#F8FAFC]'>Chess App</h3>
        <div className=' flex m-2 gap-2'>
            <Button
              buttonStyles={{
                padding: '0 4px',
                bgcolor: 'white',
                color: 'blue',
                fontWeight: '500'
              }}>
              Log In
            </Button>
            <Button
              buttonStyles={{
                padding: '0 4px',
                bgcolor: 'blue',
                color: 'white',
                fontWeight: '500'
              }}>
              Sign Up
            </Button>
        </div>
      </nav>
    )
}