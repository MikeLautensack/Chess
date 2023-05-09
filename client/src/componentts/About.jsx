import React from 'react'
import './css/About.css'
import { FaBars, FaTimes } from 'react-icons/fa'
import { useState } from 'react'
import { Link } from 'react-router-dom'
import CBC from './assets/currentboardconfig.png'
import LM from './assets/legalmoves.png'

const About = () => {

  const [nav, setNav] = useState(false)
  const handleClick = () => setNav(!nav)

  return (
    <section className='about' id='about'>

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

      <div className='content'>

        {/* Content Left */}
        <div className='content-left'>
          <h1>What is Chess API?</h1>
          <h6>Chess API is a REST API that accepts a board config JSON object and returns a legal moves JSON object.  Chess API can be used as an easy way to restrict a user from making illegal moves on a client side chess application.</h6>
          <h4>How Do I Use Chess API</h4>
          <p>
            Chess API is intended to be used in client side chess applications as a easy way of restricting illegal moves just like you see on the big name chess websites.  To use Chess API follow these simple steps and level up your client chess application.  

            Start by creating an object in your client code called “boardConfig” or similar with a key for each square and value representing the piece on the svquare.  Pieces are represented by a simple string containing a piece name and empty squares are represented by empty strings.  When a move is made in your client application trigger an API call to Chess API using a post request to the address below with the boardConfig object in the body and you will receive a “legalMoves” object in the response body.  The legal moves object contains keys representing each unique piece on the chess board.  Each keys value is an array containing a list of square coordinates like e4, d4, c4 representing the legal moves for the piece.  If the array is empty that piece has no legal moves or is currently not on the board.  You can use the legalMoves object in your client code to restrict players from making illegal moves during a game.  Keep track of who is to move, move number and other stats in your client code.  You can also very easily setup checkmate and stalemate detection in your client code but using the kings legal moves and which color is to move.

            Chess API helps you easily transform a simple frontend drag and drop chess application into a professional feeling online chess experience you would expect from the big name chess websites.
          </p>
          <h5 className='api-access'>API Access</h5>
          <p className='api-endpoint'>193.46.198.215:8080/getLegalMoves</p>
        </div>

        {/* Content Right */}
        <div className='content-right'>
          <h4>Example</h4>
          <h5>Input</h5>
          <div className='input-example'>
            <img src={CBC} alt='boardconfig'></img>
          </div>
          <p>The above is example input to Chess API.  The example input is the starting position on the chess board.</p>
          <h5>Output</h5>
          <div className='output-example'>
            <img src={LM} alt='legalmoves'></img>
          </div>
          <p>The above is example output from the example input.</p>
        </div>

      </div>
    </section>
  )
}

export default About