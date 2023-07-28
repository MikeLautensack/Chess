'use client'

import React from 'react'
import { SquareColor } from '../utils/enums'
import { useState } from 'react'

const Board = () => {

    const [ board, setBoard ] = useState([
        [{ square_id: 'a8', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'b8', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'c8', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'd8', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'e8', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'f8', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'g8', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'h8', squareColor: SquareColor.DARK, pieceOnSquare: {}}],
        [{ square_id: 'a7', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'b7', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'c7', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'd7', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'e7', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'f7', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'g7', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'h7', squareColor: SquareColor.LIGHT, pieceOnSquare: {}}],
        [{ square_id: 'a6', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'b6', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'c6', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'd6', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'e6', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'f6', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'g6', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'h6', squareColor: SquareColor.DARK, pieceOnSquare: {}}],
        [{ square_id: 'a5', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'b5', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'c5', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'd5', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'e5', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'f5', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'g5', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'h5', squareColor: SquareColor.LIGHT, pieceOnSquare: {}}],
        [{ square_id: 'a4', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'b4', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'c4', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'd4', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'e4', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'f4', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'g4', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'h4', squareColor: SquareColor.DARK, pieceOnSquare: {}}],
        [{ square_id: 'a3', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'b3', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'c3', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'd3', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'e3', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'f3', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'g3', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'h3', squareColor: SquareColor.LIGHT, pieceOnSquare: {}}],
        [{ square_id: 'a2', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'b2', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'c2', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'd2', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'e2', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'f2', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'g2', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'h2', squareColor: SquareColor.DARK, pieceOnSquare: {}}],
        [{ square_id: 'a1', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'b1', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'c1', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'd1', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'e1', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'f1', squareColor: SquareColor.LIGHT, pieceOnSquare: {}},{ square_id: 'g1', squareColor: SquareColor.DARK, pieceOnSquare: {}},{ square_id: 'h1', squareColor: SquareColor.LIGHT, pieceOnSquare: {}}]
    ])

    return (
      <div id="board" className="">
        <div id="squares">
            {}
        </div>
      </div>
    )
}

export default Board