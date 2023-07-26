import Button from './Button'
import Search from './Search'
import SideNav from './SideNav'
import { FriendsListItemProps } from '../types/friendstypes'

export default function FriendsListItem({name, }: FriendsListItemProps) {
    return (
      <div className="">
        <div>
            <h3>{name}</h3>
        </div>
        <div>
            <h3>{}</h3>
        </div>
        <div>

        </div>
      </div>
    )
  }