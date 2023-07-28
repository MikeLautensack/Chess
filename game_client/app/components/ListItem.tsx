import Button from './Button'
import Search from './Search'
import SideNav from './SideNav'
import { ListItemProps } from '../types/types'

export default function ListItem({col1, col2, col3, col2func, col3func }: ListItemProps) {
    return (
      <div className='flex justify-between bg-gray-200 border-gray-500 border-l border-b border-r mx-4'>
        <div className='flex justify-start items-center w-80 border-r border-gray-500'>
            <h2 className='mx-4'>{col1}</h2>
        </div>
        <div className='flex'>
          <div className='w-20 border-l border-gray-500 p-2'>
              <Button
                className='bg-green-600 rounded-full w-full'
                onClick={col2func}
              >
                {col2}
              </Button>
          </div>
          <div className='w-20 border-l border-gray-500 p-2'>
            <Button
              className='bg-red-600 rounded-full w-full'
              onClick={col3func}
            >
              {col3}
            </Button>
          </div>
        </div>
      </div>
    )
  }