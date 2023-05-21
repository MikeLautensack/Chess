import React from 'react'
import './css/Demo.css'
import { FaBars, FaTimes } from 'react-icons/fa'
import { useState } from 'react'
import { Link } from 'react-router-dom'
import Square from './Square'

const Demo = () => {

  const [nav, setNav] = useState(false)
  const [isWhitesTurn, setIsWhitesTurn] = useState(true)

  const [boardConfig, setBoardConfig] = useState(
    {
      'a8' : 'blackARook',
      'b8' : 'blackBKnight',
      'c8' : 'blackCBishop',
      'd8' : 'blackQueen',
      'e8' : 'blackKing',
      'f8' : 'blackFBishop',
      'g8' : 'blackGKnight',
      'h8' : 'blackHRook',
      'a7' : 'blackAPawn',
      'b7' : 'blackBPawn',
      'c7' : 'blackCPawn',
      'd7' : 'blackDPawn',
      'e7' : 'blackEPawn',
      'f7' : 'blackFPawn',
      'g7' : 'blackGPawn',
      'h7' : 'blackHPawn',
      'a6' : '',
      'b6' : '',
      'c6' : '',
      'd6' : '',
      'e6' : '',
      'f6' : '',
      'g6' : '',
      'h6' : '',
      'a5' : '',
      'b5' : '',
      'c5' : '',
      'd5' : '',
      'e5' : '',
      'f5' : '',
      'g5' : '',
      'h5' : '',
      'a4' : '',
      'b4' : '',
      'c4' : '',
      'd4' : '',
      'e4' : '',
      'f4' : '',
      'g4' : '',
      'h4' : '',
      'a3' : '',
      'b3' : '',
      'c3' : '',
      'd3' : '',
      'e3' : '',
      'f3' : '',
      'g3' : '',
      'h3' : '',
      'a2' : 'whiteAPawn',
      'b2' : 'whiteBPawn',
      'c2' : 'whiteCPawn',
      'd2' : 'whiteDPawn',
      'e2' : 'whiteEPawn',
      'f2' : 'whiteFPawn',
      'g2' : 'whiteGPawn',
      'h2' : 'whiteHPawn',
      'a1' : 'whiteARook',
      'b1' : 'whiteBKnight',
      'c1' : 'whiteCBishop',
      'd1' : 'whiteQueen',
      'e1' : 'whiteKing',
      'f1' : 'whiteFBishop',
      'g1' : 'whiteGKnight',
      'h1' : 'whiteHRook',
    })

  const [legalMoves, setLegalMoves] = useState(
    {
      'blackAPawn' : ['a5','a6'],
      'blackARook' : [],
      'blackBKnight' : ['a6','c6'],
      'blackBPawn' : ['b5','b6'],
      'blackCBishop' : [],
      'blackCPawn' : ['c5','c6'],
      'blackDPawn' : ['d5','d6'],
      'blackEPawn' : ['e5','e6'],
      'blackFBishop' : [],    
      'blackFPawn' : ['f5','f6'],
      'blackGKnight' : ['f6','h6'],
      'blackGPawn' : ['g5','g6'],
      'blackHPawn' : ['h5','h6'],
      'blackHRook' : [],
      'blackKing' : [],
      'blackQueen' : [],
      'promotionBishopA' : [],
      'promotionBishopB' : [],
      'promotionBishopC' : [],
      'promotionBishopD' : [],
      'promotionBishopE' : [],
      'promotionBishopF' : [],
      'promotionBishopG' : [],
      'promotionBishopH' : [],
      'promotionKnightA' : [],    
      'promotionKnightB' : [],
      'promotionKnightC' : [],
      'promotionKnightD' : [],
      'promotionKnightE' : [],    
      'promotionKnightF' : [],
      'promotionKnightG' : [],
      'promotionKnightH' : [],
      'promotionQueenA' : [],
      'promotionQueenB' : [],
      'promotionQueenC' : [],
      'promotionQueenD' : [],
      'promotionQueenE' : [],
      'promotionQueenF' : [],
      'promotionQueenG' : [],
      'promotionQueenH' : [],
      'promotionRookA' : [],    
      'promotionRookB' : [],
      'promotionRookC' : [],
      'promotionRookD' : [],
      'promotionRookE' : [],
      'promotionRookF' : [],
      'promotionRookG' : [],
      'promotionRookH' : [],
      'whiteAPawn' : ['a3','a4'],
      'whiteARook' : [],
      'whiteBKnight' : ['a3','c3'],
      'whiteBPawn' : ['b3','b4'],
      'whiteCBishop' : [],
      'whiteCPawn' : ['c3','c4'],
      'whiteDPawn' : ['d3','d4'],
      'whiteEPawn' : ['e3','e4'],
      'whiteFBishop' : [],    
      'whiteFPawn' : ['f3','f4'],
      'whiteGKnight' : ['f3','h3'],
      'whiteGPawn' : ['g3','g4'],
      'whiteHPawn' : ['h3','h4'],    
      'whiteHRook' : [],
      'whiteKing' : [],
      'whiteQueen' : [],
    })

  const handleClick = () => setNav(!nav)

  const getPiece = (pieceID) => {
    const piece = boardConfig[pieceID]
    return piece
  }
  const resetBoard = () => {
    setBoardConfig(
      {
        'a8' : 'blackARook',
        'b8' : 'blackBKnight',
        'c8' : 'blackCBishop',
        'd8' : 'blackQueen',
        'e8' : 'blackKing',
        'f8' : 'blackFBishop',
        'g8' : 'blackGKnight',
        'h8' : 'blackHRook',
        'a7' : 'blackAPawn',
        'b7' : 'blackBPawn',
        'c7' : 'blackCPawn',
        'd7' : 'blackDPawn',
        'e7' : 'blackEPawn',
        'f7' : 'blackFPawn',
        'g7' : 'blackGPawn',
        'h7' : 'blackHPawn',
        'a6' : '',
        'b6' : '',
        'c6' : '',
        'd6' : '',
        'e6' : '',
        'f6' : '',
        'g6' : '',
        'h6' : '',
        'a5' : '',
        'b5' : '',
        'c5' : '',
        'd5' : '',
        'e5' : '',
        'f5' : '',
        'g5' : '',
        'h5' : '',
        'a4' : '',
        'b4' : '',
        'c4' : '',
        'd4' : '',
        'e4' : '',
        'f4' : '',
        'g4' : '',
        'h4' : '',
        'a3' : '',
        'b3' : '',
        'c3' : '',
        'd3' : '',
        'e3' : '',
        'f3' : '',
        'g3' : '',
        'h3' : '',
        'a2' : 'whiteAPawn',
        'b2' : 'whiteBPawn',
        'c2' : 'whiteCPawn',
        'd2' : 'whiteDPawn',
        'e2' : 'whiteEPawn',
        'f2' : 'whiteFPawn',
        'g2' : 'whiteGPawn',
        'h2' : 'whiteHPawn',
        'a1' : 'whiteARook',
        'b1' : 'whiteBKnight',
        'c1' : 'whiteCBishop',
        'd1' : 'whiteQueen',
        'e1' : 'whiteKing',
        'f1' : 'whiteFBishop',
        'g1' : 'whiteGKnight',
        'h1' : 'whiteHRook',
      }
    )
    setLegalMoves(
      {
        'blackAPawn' : ['a5','a6'],
        'blackARook' : [],
        'blackBKnight' : ['a6','c6'],
        'blackBPawn' : ['b5','b6'],
        'blackCBishop' : [],
        'blackCPawn' : ['c5','c6'],
        'blackDPawn' : ['d5','d6'],
        'blackEPawn' : ['e5','e6'],
        'blackFBishop' : [],    
        'blackFPawn' : ['f5','f6'],
        'blackGKnight' : ['f6','h6'],
        'blackGPawn' : ['g5','g6'],
        'blackHPawn' : ['h5','h6'],
        'blackHRook' : [],
        'blackKing' : [],
        'blackQueen' : [],
        'promotionBishopA' : [],
        'promotionBishopB' : [],
        'promotionBishopC' : [],
        'promotionBishopD' : [],
        'promotionBishopE' : [],
        'promotionBishopF' : [],
        'promotionBishopG' : [],
        'promotionBishopH' : [],
        'promotionKnightA' : [],    
        'promotionKnightB' : [],
        'promotionKnightC' : [],
        'promotionKnightD' : [],
        'promotionKnightE' : [],    
        'promotionKnightF' : [],
        'promotionKnightG' : [],
        'promotionKnightH' : [],
        'promotionQueenA' : [],
        'promotionQueenB' : [],
        'promotionQueenC' : [],
        'promotionQueenD' : [],
        'promotionQueenE' : [],
        'promotionQueenF' : [],
        'promotionQueenG' : [],
        'promotionQueenH' : [],
        'promotionRookA' : [],    
        'promotionRookB' : [],
        'promotionRookC' : [],
        'promotionRookD' : [],
        'promotionRookE' : [],
        'promotionRookF' : [],
        'promotionRookG' : [],
        'promotionRookH' : [],
        'whiteAPawn' : ['a3','a4'],
        'whiteARook' : [],
        'whiteBKnight' : ['a3','c3'],
        'whiteBPawn' : ['b3','b4'],
        'whiteCBishop' : [],
        'whiteCPawn' : ['c3','c4'],
        'whiteDPawn' : ['d3','d4'],
        'whiteEPawn' : ['e3','e4'],
        'whiteFBishop' : [],    
        'whiteFPawn' : ['f3','f4'],
        'whiteGKnight' : ['f3','h3'],
        'whiteGPawn' : ['g3','g4'],
        'whiteHPawn' : ['h3','h4'],    
        'whiteHRook' : [],
        'whiteKing' : [],
        'whiteQueen' : [],
      }
    )
    setIsWhitesTurn(true)
  }

  const makeString = (arr) => {
    return arr.join(' ')
  }

  return (
    <section className='demo' id='demo'>

      {/* Hamburger Icon */}
      <div onClick={handleClick} className='hamburger-icon'>
          {!nav ? <FaBars /> : <FaTimes />}
      </div>

      {/* Navigation */}
      <nav className={`navigation ${nav ? 'navigation-open' : ''}`}>
            <div className='nav-box'>
                <div className='link-box'>
                    <Link to='/' className='nav-link'>Home</Link>
                </div>
                <div className='link-box'>
                    <Link to='/About' className='nav-link'>About</Link>
                </div>
                <div className='link-box'>
                    <Link to='/Demo' className='nav-link'>Demo</Link>
                </div>
            </div>
        </nav>

      {/* Content */}
      <div className='content demo-grid-rows'>

        <h1 className='demo-content-headings-h1'>Chess API In Action</h1>
        <h5 className='demo-content-headings-h5'>Click and drag chess pieces to watch chess API in action</h5>

        <div className='bottom-content'>
          {/* Demo Content Left */}
          <div className='demo-content-left'>

          {/* Board Container */}
          <div className='board-container'>

            {/* Board Header */}
            <div className='board-header'>
              <h4>{isWhitesTurn ? 'White To Move!' : 'Black To Move!'}</h4>
              <button onClick={() => resetBoard()}>Reset Board</button>
            </div>
            {/* Board */}
            <div className='board'>
              <div className='rank'>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('a8')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='a8' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('b8')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='b8' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('c8')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='c8' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('d8')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='d8' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('e8')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='e8' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('f8')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='f8' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('g8')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='g8' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('h8')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='h8' className='square dark'/>
              </div>
              <div className='rank'>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('a7')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='a7' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('b7')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='b7' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('c7')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='c7' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('d7')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='d7' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('e7')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='e7' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('f7')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='f7' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('g7')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='g7' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('h7')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='h7' className='square light'/>
              </div>
              <div className='rank'>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('a6')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='a6' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('b6')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='b6' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('c6')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='c6' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('d6')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='d6' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('e6')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='e6' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('f6')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='f6' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('g6')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='g6' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('h6')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='h6' className='square dark'/>
              </div>
              <div className='rank'>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('a5')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='a5' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('b5')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='b5' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('c5')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='c5' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('d5')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='d5' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('e5')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='e5' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('f5')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='f5' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('g5')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='g5' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('h5')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='h5' className='square light'/>
              </div>
              <div className='rank'>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('a4')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='a4' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('b4')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='b4' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('c4')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='c4' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('d4')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='d4' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('e4')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='e4' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('f4')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='f4' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('g4')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='g4' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('h4')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='h4' className='square dark'/>
              </div>
              <div className='rank'>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('a3')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='a3' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('b3')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='b3' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('c3')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='c3' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('d3')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='d3' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('e3')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='e3' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('f3')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='f3' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('g3')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='g3' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('h3')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='h3' className='square light'/>
              </div>
              <div className='rank'>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('a2')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='a2' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('b2')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='b2' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('c2')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='c2' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('d2')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='d2' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('e2')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='e2' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('f2')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='f2' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('g2')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='g2' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('h2')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='h2' className='square dark'/>
              </div>
              <div className='rank'>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('a1')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='a1' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('b1')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='b1' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('c1')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='c1' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('d1')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='d1' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('e1')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='e1' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('f1')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='f1' className='square light'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('g1')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='g1' className='square dark'/>
                <Square boardConfig={boardConfig} setBoardConfig={setBoardConfig} legalMoves={legalMoves} setLegalMoves={setLegalMoves} piece={getPiece('h1')} isWhitesTurn={isWhitesTurn} setIsWhitesTurn={setIsWhitesTurn} id='h1' className='square light'/>
              </div>
            </div>
          </div>

          </div>

          {/* Demo Content Right */}
          <div className='demo-content-right'>

            {/* API Response Display Area */}
            <h6 className='legalmoves-heading'>Legal Moves</h6>
            
              <div className='moves-box'>
                <p className='legalmoves'>White King: {makeString(legalMoves.whiteKing)}</p>
                <p className='legalmoves'>White Queen: {makeString(legalMoves.whiteQueen)}</p>
                <p className='legalmoves'>White A-Rook: {makeString(legalMoves.whiteARook)}</p>
                <p className='legalmoves'>White H-Rook: {makeString(legalMoves.whiteHRook)}</p>
                <p className='legalmoves'>White C-Bishop: {makeString(legalMoves.whiteCBishop)}</p>
                <p className='legalmoves'>White F-Bishop: {makeString(legalMoves.whiteFBishop)}</p>
                <p className='legalmoves'>White B-Knight: {makeString(legalMoves.whiteBKnight)}</p>
                <p className='legalmoves'>White G-Knight: {makeString(legalMoves.whiteGKnight)}</p>
                <p className='legalmoves'>White A-Pawn: {makeString(legalMoves.whiteAPawn)}</p>
                <p className='legalmoves'>White B-Pawn: {makeString(legalMoves.whiteBPawn)}</p>
                <p className='legalmoves'>White C-Pawn: {makeString(legalMoves.whiteCPawn)}</p>
                <p className='legalmoves'>White D-Pawn: {makeString(legalMoves.whiteDPawn)}</p>
                <p className='legalmoves'>White E-Pawn: {makeString(legalMoves.whiteEPawn)}</p>
                <p className='legalmoves'>white F-Pawn: {makeString(legalMoves.whiteFPawn)}</p>
                <p className='legalmoves'>white G-Pawn: {makeString(legalMoves.whiteGPawn)}</p>
                <p className='legalmoves'>white H-Pawn: {makeString(legalMoves.whiteHPawn)}</p>
                <p className='legalmoves'>Black King: {makeString(legalMoves.blackKing)}</p>
                <p className='legalmoves'>Black Queen: {makeString(legalMoves.blackQueen)}</p>
                <p className='legalmoves'>Black A-Rook: {makeString(legalMoves.blackARook)}</p>
                <p className='legalmoves'>Black H-Rook: {makeString(legalMoves.blackHRook)}</p>
                <p className='legalmoves'>Black C-Bishop: {makeString(legalMoves.blackCBishop)}</p>
                <p className='legalmoves'>Black F-Bishop: {makeString(legalMoves.blackFBishop)}</p>
                <p className='legalmoves'>Black B-Knight: {makeString(legalMoves.blackBKnight)}</p>
                <p className='legalmoves'>Black G-Knight: {makeString(legalMoves.blackGKnight)}</p>
                <p className='legalmoves'>Black A-Pawn: {makeString(legalMoves.blackAPawn)}</p>
                <p className='legalmoves'>Black B-Pawn: {makeString(legalMoves.blackBPawn)}</p>
                <p className='legalmoves'>Black C-Pawn: {makeString(legalMoves.blackCPawn)}</p>
                <p className='legalmoves'>Black D-Pawn: {makeString(legalMoves.blackDPawn)}</p>
                <p className='legalmoves'>Black E-Pawn: {makeString(legalMoves.blackEPawn)}</p>
                <p className='legalmoves'>Black F-Pawn: {makeString(legalMoves.blackFPawn)}</p>
                <p className='legalmoves'>Black G-Pawn: {makeString(legalMoves.blackGPawn)}</p>
                <p className='legalmoves'>Black H-Pawn: {makeString(legalMoves.blackHPawn)}</p>
              </div>
            

          </div>
        </div>
        
      </div>
    </section>
  )
}

export default Demo