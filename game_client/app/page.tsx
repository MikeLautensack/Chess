import Image from 'next/image'
import Button from './components/Button'
import TopNav from './components/TopNav'

export default function Home() {
  return (
    <main className="min-h-screen relative bg-gradient-to-br from-gray-500 via-blue-600 to-indigo-900">
      <TopNav />
      <div className='absolute top-60 left-60'>
        <h1 className='text-6x1 text-[#F8FAFC]'>Chess App</h1>
        <p className='text-base text-[#F8FAFC] my-4'>A simple chess app</p>
        <div className='flex justify-start gap-2'>
          <Button
            className='bg-blue-500 text-white p-2'
          >
            Sign Up
          </Button>
          <Button
            className='bg-white text-blue-500 p-2'
          >
            Log In
          </Button>
        </div>
      </div>
    </main>
  )
}
