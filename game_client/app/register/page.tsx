import Button from '../components/Button'
import TopNav from '../components/TopNav'

export default function Register() {
    return (
      <main className="flex flex-col justify-center items-center min-h-screen relative bg-gradient-to-br from-gray-500 via-blue-600 to-indigo-900">
        <TopNav />
        <form className=''>
            <div className='flex gap-2 w-full'>
                <div className='flex flex-col'>
                    <label>First Name</label>
                    <input></input>
                </div>
                <div className='flex flex-col'>
                    <label>Last Name</label>
                    <input></input>
                </div>
            </div>
            <div className='flex justify-center flex-col w-full'>
                <label>Email</label>
                <input></input>
            </div>
            <div className='flex justify-center flex-col w-full'>
                <label>Password</label>
                <input></input>
            </div>
            <div className='flex justify-center flex-col w-full'>
                <label>Confirm Password</label>
                <input></input>
            </div>
            <div className='flex justify-center'>
                <Button
                    buttonStyles={{
                        bgcolor: 'blue',
                        color: 'white',
                        fontWeight: '500',
                        margin: '1rem 0',
                        padding: '.5rem'
                    }}
                >
                    Sign Up
                </Button>
            </div>
        </form>
      </main>
    )
  }