import Button from '../components/Button'
import ListItem from '../components/ListItem'
import ListTitleBar from '../components/ListTitleBar'
import Search from '../components/Search'
import SideNav from '../components/SideNav'
import { onSearch, onInvite } from '../actions/actions'

export default function Friends() {

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