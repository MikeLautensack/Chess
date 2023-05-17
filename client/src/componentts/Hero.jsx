import React from 'react'
import './css/Hero.css'
import { useState } from 'react'
import { FaBars, FaTimes } from 'react-icons/fa'
import { Link } from 'react-router-dom'

const Hero = ({ scrollToComponent }) => {

  const [nav, setNav] = useState(false)
  const handleClick = () => setNav(!nav)
    
  return (
    <section className='hero' id='hero'>

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
        <div className='content hero-grid-rows'>

            {/* Header */}
            <header className='header'>
                <h3 className='header-heading'>Chess API</h3>
                <nav className='header-nav'>
                    <div className='header-nav-home'>
                        <a onClick={() => scrollToComponent('hero')} className='header-nav-button'>Home</a>
                    </div>
                    <div className='header-nav-about'>
                        <a onClick={() => scrollToComponent('about')} className='header-nav-button'>About</a>
                    </div>
                    <div className='header-nav-demo'>
                        <a onClick={() => scrollToComponent('demo')} className='header-nav-button'>Demo</a>
                    </div>
                </nav>
            </header>

            {/* Hero Content */}
            <div className='hero-content'>
                <h6>Welcome to</h6>
                <h1>Chess API</h1>
                <p>Chess API generates legal moves for each piece in any position with simple JSON Object Input and Output</p>
                <div className='hero-content-buttons'>
                    <button onClick={() => scrollToComponent('about')} className='learn-more'>Learn More</button>
                    <button onClick={() => scrollToComponent('demo')} className='explore-demo'>Explore Demo</button>
                </div>
            </div>

        </div>

    </section>
  )
}

export default Hero