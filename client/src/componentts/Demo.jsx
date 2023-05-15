import React from 'react'
import './css/Demo.css'
import { FaBars, FaTimes } from 'react-icons/fa'
import { useState } from 'react'
import { Link } from 'react-router-dom'
import Square from './Square'

const Demo = () => {

  const [nav, setNav] = useState(false)

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
              <h4>White to Move!</h4>
              <button>Reset Board</button>
            </div>
            {/* Board */}
            <div className='board'>
              <div className='rank'>
                <Square piece={getPiece('a8')} id='a8' className='square light'/>
                <Square piece={getPiece('b8')} id='b8' className='square dark'/>
                <Square piece={getPiece('c8')} id='c8' className='square light'/>
                <Square piece={getPiece('d8')} id='d8' className='square dark'/>
                <Square piece={getPiece('e8')} id='e8' className='square light'/>
                <Square piece={getPiece('f8')} id='f8' className='square dark'/>
                <Square piece={getPiece('g8')} id='g8' className='square light'/>
                <Square piece={getPiece('h8')} id='h8' className='square dark'/>
              </div>
              <div className='rank'>
                <Square piece={getPiece('a7')} id='a7' className='square dark'/>
                <Square piece={getPiece('b7')} id='b7' className='square light'/>
                <Square piece={getPiece('c7')} id='c7' className='square dark'/>
                <Square piece={getPiece('d7')} id='d7' className='square light'/>
                <Square piece={getPiece('e7')} id='e7' className='square dark'/>
                <Square piece={getPiece('f7')} id='f7' className='square light'/>
                <Square piece={getPiece('g7')} id='g7' className='square dark'/>
                <Square piece={getPiece('h7')} id='h7' className='square light'/>
              </div>
              <div className='rank'>
                <Square piece={getPiece('a6')} id='a6' className='square light'/>
                <Square piece={getPiece('b6')} id='b6' className='square dark'/>
                <Square piece={getPiece('c6')} id='c6' className='square light'/>
                <Square piece={getPiece('d6')} id='d6' className='square dark'/>
                <Square piece={getPiece('e6')} id='e6' className='square light'/>
                <Square piece={getPiece('f6')} id='f6' className='square dark'/>
                <Square piece={getPiece('g6')} id='g6' className='square light'/>
                <Square piece={getPiece('h6')} id='h6' className='square dark'/>
              </div>
              <div className='rank'>
                <Square piece={getPiece('a5')} id='a5' className='square dark'/>
                <Square piece={getPiece('b5')} id='b5' className='square light'/>
                <Square piece={getPiece('c5')} id='c5' className='square dark'/>
                <Square piece={getPiece('d5')} id='d5' className='square light'/>
                <Square piece={getPiece('e5')} id='e5' className='square dark'/>
                <Square piece={getPiece('f5')} id='f5' className='square light'/>
                <Square piece={getPiece('g5')} id='g5' className='square dark'/>
                <Square piece={getPiece('h5')} id='h5' className='square light'/>
              </div>
              <div className='rank'>
                <Square piece={getPiece('a4')} id='a4' className='square light'/>
                <Square piece={getPiece('b4')} id='b4' className='square dark'/>
                <Square piece={getPiece('c4')} id='c4' className='square light'/>
                <Square piece={getPiece('d4')} id='d4' className='square dark'/>
                <Square piece={getPiece('e4')} id='e4' className='square light'/>
                <Square piece={getPiece('f4')} id='f4' className='square dark'/>
                <Square piece={getPiece('g4')} id='g4' className='square light'/>
                <Square piece={getPiece('h4')} id='h4' className='square dark'/>
              </div>
              <div className='rank'>
                <Square piece={getPiece('a3')} id='a3' className='square dark'/>
                <Square piece={getPiece('b3')} id='b3' className='square light'/>
                <Square piece={getPiece('c3')} id='c3' className='square dark'/>
                <Square piece={getPiece('d3')} id='d3' className='square light'/>
                <Square piece={getPiece('e3')} id='e3' className='square dark'/>
                <Square piece={getPiece('f3')} id='f3' className='square light'/>
                <Square piece={getPiece('g3')} id='g3' className='square dark'/>
                <Square piece={getPiece('h3')} id='h3' className='square light'/>
              </div>
              <div className='rank'>
                <Square piece={getPiece('a2')} id='a2' className='square light'/>
                <Square piece={getPiece('b2')} id='b2' className='square dark'/>
                <Square piece={getPiece('c2')} id='c2' className='square light'/>
                <Square piece={getPiece('d2')} id='d2' className='square dark'/>
                <Square piece={getPiece('e2')} id='e2' className='square light'/>
                <Square piece={getPiece('f2')} id='f2' className='square dark'/>
                <Square piece={getPiece('g2')} id='g2' className='square light'/>
                <Square piece={getPiece('h2')} id='h2' className='square dark'/>
              </div>
              <div className='rank'>
                <Square piece={getPiece('a1')} id='a1' className='square dark'/>
                <Square piece={getPiece('b1')} id='b1' className='square light'/>
                <Square piece={getPiece('c1')} id='c1' className='square dark'/>
                <Square piece={getPiece('d1')} id='d1' className='square light'/>
                <Square piece={getPiece('e1')} id='e1' className='square dark'/>
                <Square piece={getPiece('f1')} id='f1' className='square light'/>
                <Square piece={getPiece('g1')} id='g1' className='square dark'/>
                <Square piece={getPiece('h1')} id='h1' className='square light'/>
              </div>
            </div>
          </div>

          </div>

          {/* Demo Content Right */}
          <div className='demo-content-right'>

          {/* API Response Display Area */}
          <h6 className='legalmoves-heading'>Legal Moves</h6>
          <div>

          </div>

          </div>
        </div>
        
      </div>
    </section>
  )
}

export default Demo