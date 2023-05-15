import React from 'react'
import Piece from './Piece'
import './css/Demo.css'
import { useDrop } from 'react-dnd'

const Square = ({ className, piece }) => {

  const [{ isOver, canDrop }, drop] = useDrop(
    () => ({
      accept: 'Piece',
      canDrop: () => isDropValid(),
      drop: () => movePiece(),
      collect: (monitor) => ({
        isOver: !!monitor.isOver(),
        canDrop: !!monitor.canDrop()
      })
    })
  )

  const isDropValid = () => {

  }

  const movePiece = () => {

  }

  return (
    <div ref={drop} className={className}>
        <Piece piece={piece}/>
    </div>
  )
}

export default Square