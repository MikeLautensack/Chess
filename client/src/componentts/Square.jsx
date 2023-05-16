import React from 'react'
import Piece from './Piece'
import './css/Demo.css'
import { useDrop } from 'react-dnd'
import axios from 'axios'

const Square = ({ className,
                  id, 
                  piece,
                  boardConfig,
                  setBoardConfig,
                  legalMoves,
                  setLegalMoves,
                  isWhitesTurn,
                  setIsWhitesTurn }) => {

  const [{ isOver, canDrop }, drop] = useDrop(
    () => ({
      accept: 'Piece',
      canDrop: (item) => {
        const moves = legalMoves[item.id]
        if (isWhitesTurn) {
          if (item.id.includes('white')) {
            if (moves.includes(id)) {
              return true
            }
          }
        } else {
          if (item.id.includes('black')) {
            if (moves.includes(id)) {
              return true
            }
          }
        }
      },
      drop: (item) => {
        const newBoardConfig = {...boardConfig,
                                  [item.currentPosition]: '',
                                  [id]: `${item.id}`} 
        setBoardConfig(newBoardConfig)
        const callAPI = async () => {
          try {
            const response = await axios.post('http://localhost:8080/boardConfig');
            setLegalMoves(response.data)
            console.log(response.data, 'API call succsessful')
          } catch (error) {
            console.error(error);
          }
        }
        callAPI()
        setIsWhitesTurn(!isWhitesTurn)
        console.log(newBoardConfig)
      },
      collect: (monitor) => ({
        isOver: !!monitor.isOver(),
        canDrop: !!monitor.canDrop()
      })
    }),
    [boardConfig, legalMoves]
  )

  return (
    <div ref={drop} className={className}>
      {piece !== '' ? <Piece currentPosition={id} piece={piece}/> : <></>}
    </div>
  )
}

export default Square