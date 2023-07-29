'use client'

import React from 'react'
import { SquareProps } from '../types/types'
import { useState } from 'react'
import LIGHT_SQUARE from '../../public/light-square.jpg'
import DARK_SQUARE from '../../public/dark-square.jpg'
import { SquareColor } from '../utils/enums'

const Square = ({ square_id, squareColor, pieceOnSquare, children }: SquareProps) => {

  const [ square, setSquare ] = useState({
    square_id: square_id,
    squareColor: squareColor,
    pieceOnSquare: pieceOnSquare
  })

  return (
    <div className={`w-[%12.5] aspect-square ${squareColor == SquareColor.LIGHT ? 'bg-light-square' : 'bg-dark-square'}`}>
      {children}
    </div>
  )
}

export default Square