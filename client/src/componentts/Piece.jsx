import React from 'react'
import './css/Demo.css'
import { useDrag } from 'react-dnd'

const Piece = ({ piece }) => {

  const [{ isDragging }, drag] = useDrag(() => ({
    type: 'Piece',
    collect: (monitor) => ({
      isDragging: !!monitor.isDragging()
    })
  }))

  return (
    <div ref={drag} className={ piece }>
        
    </div>
  )
}

export default Piece