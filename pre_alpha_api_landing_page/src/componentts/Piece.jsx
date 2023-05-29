import React from 'react'
import './css/Demo.css'
import { useDrag } from 'react-dnd'

const Piece = ({ piece, currentPosition}) => {

  const [{ isDragging }, drag] = useDrag(() => ({
    type: 'Piece',
    item: {
      id: piece,
      currentPosition: currentPosition
    },
    collect: (monitor) => ({
      isDragging: !!monitor.isDragging()
    })
  }))

  return (
    <div ref={drag} className={ ` ${piece} ${isDragging && 'transparent'}` }>
        
    </div>
  )
}

export default Piece