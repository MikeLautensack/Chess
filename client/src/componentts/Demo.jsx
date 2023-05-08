import React from 'react'
import './css/Demo.css'
import { FaBars, FaTimes } from 'react-icons/fa'
import { useState } from 'react'
import { Link } from 'react-router-dom'

const Demo = () => {

  const [nav, setNav] = useState(false)
  const handleClick = () => setNav(!nav)

  return (
    <section className='demo'>

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
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
            </div>
            <div className='rank'>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
            </div>
            <div className='rank'>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
            </div>
            <div className='rank'>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
            </div>
            <div className='rank'>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
            </div>
            <div className='rank'>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
            </div>
            <div className='rank'>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
            </div>
            <div className='rank'>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
              <div className='square dark'></div>
              <div className='square light'></div>
            </div>
          </div>
        </div>
        
        {/* API Response Display Area */}
        <h6 className='legalmoves-heading'>Legal Moves</h6>
        <div>

        </div>

      </div>
    </section>
  )
}

export default Demo