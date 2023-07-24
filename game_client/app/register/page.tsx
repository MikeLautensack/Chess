import Button from '../components/Button'
import TopNav from '../components/TopNav'

export default function Register() {
    return (
      <main className="min-h-screen relative bg-gradient-to-br from-gray-500 via-blue-600 to-indigo-900">
        <TopNav />
        <form>
            <div>
                <div>
                    <label>First Name</label>
                    <input></input>
                </div>
                <div>
                    <label>Last Name</label>
                    <input></input>
                </div>
            </div>
            <div>
                <label>Email</label>
                <input></input>
            </div>
            <div>
                <label>Password</label>
                <input></input>
            </div>
            <Button 
                buttonStyles={{
                    
                }}/>
        </form>
      </main>
    )
  }