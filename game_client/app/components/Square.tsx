'use client'

import React from 'react'
import { SquareProps } from '../types/types'
import { useState } from 'react'

const Square = ({ square_id, squareColor, pieceOnSquare }: SquareProps) => {

  const [ square, setSquare ] = useState({
    square_id: square_id,
    squareColor: squareColor,
    pieceOnSquare: pieceOnSquare
  })

  return (
    <div className=''>
        
    </div>
  )
}

export default Square