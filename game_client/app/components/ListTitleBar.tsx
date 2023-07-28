import Button from './Button'
import Search from './Search'
import SideNav from './SideNav'
import { TitleBarProps } from '../types/types'


export default function ListTitleBar({ col1, col2, col3 }: TitleBarProps) {
    return (
      <div className='flex justify-between bg-gray-400 border-black border-2 mx-4 mt-4'>
        <div className='w-80 border-r border-gray-500'>
            <h2 className='mx-4'>{col1}</h2>
        </div>
        <div className='flex'>
          <div className='w-20 border-l border-gray-500'>
              <h2 className='mx-4'>{col2}</h2>
          </div>
          <div className='w-20 border-l border-gray-500'>
            <h2 className='mx-4'>{col3}</h2>
          </div>
        </div>
      </div>
    )
  }