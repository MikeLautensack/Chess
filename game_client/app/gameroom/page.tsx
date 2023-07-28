import Button from '../components/Button'
import SideNav from '../components/SideNav'
import Search from '../components/Search'
import { onSearch, onInvite } from '../actions/actions'
import ListItem from '../components/ListItem'
import ListTitleBar from '../components/ListTitleBar'

export default function GameRoom() {

  const friends: any = [
    {
      friends_user_id: 1,
      user_id: 1,
      name: 'Bob'
    },
    {
      friends_user_id: 2,
      user_id: 1,
      name: 'John'
    },
    {
      friends_user_id: 3,
      user_id: 1,
      name: 'Tim'
    }
  ]

    return (
      <main className="flex min-h-screen bg-gradient-to-br from-gray-500 via-blue-600 to-indigo-900">
        <SideNav />
        <div id='content' className='w-full h-screen'>
          <div id='heading' className='flex justify-between'>
            <h1 className='text-3xl text-gray-100 m-5'>Game Room</h1>
            <h2 className='text-1xl text-blue-300 m-5'>Owner</h2>
          </div>
          <h3 className='text-1xl text-gray-100 m-4'>Players</h3>
          <div className='flex w-full justify-between px-4'>
              <div className='flex gap-2'>
                <Button
                  className='text-blue-500 font-medium border-blue-500 border p-2'
                >
                  Invite Player
                </Button>
                <Button
                  className='text-blue-500 font-medium border-blue-500 border p-2'
                >
                  Kick Player
                </Button>
              </div>
              <div>
                <Search
                  inputStyles='rounded-l-full'
                  buttonStyles='bg-blue-500 text-white rounded-r-full px-2'
                  onSearch={onSearch}
                />
              </div>
            </div>
            <div>
              <ListTitleBar
                col1={'Name'}
                col2={'Invite'}
                col3={'Edit'}
              />
              {friends.map((friend: any) => (
                <ListItem
                  col1={friend.name}
                  col2={'Invite'}
                  col2func={onInvite}
                  col3={'Edit'}
                  col3func={onInvite}
                />
              ))}
            </div>
        </div>
      </main>
    )
  }