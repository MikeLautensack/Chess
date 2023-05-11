import React from 'react'
import './css/Hero.css'
import { useState } from 'react'
import { FaBars, FaTimes } from 'react-icons/fa'
import { Link } from 'react-router-dom'

const Hero = () => {

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
                        <a className='header-nav-button'>Home</a>
                    </div>
                    <div className='header-nav-about'>
                        <a className='header-nav-button'>About</a>
                    </div>
                    <div className='header-nav-demo'>
                        <a className='header-nav-button'>Demo</a>
                    </div>
                </nav>
            </header>

            {/* Hero Content */}
            <div className='hero-content'>
                <h6>Welcome to</h6>
                <h1>Chess API</h1>
                <p>Chess API generates legal moves for each piece in any position with simple JSON Object Input and Output</p>
                <div className='hero-content-buttons'>
                    <button className='learn-more'><Link to='/About' className='nav-link'>Learn More</Link></button>
                    <button className='explore-demo'><Link to='/Demo' className='nav-link'>Explore Demo</Link></button>
                </div>
            </div>

        </div>

    </section>
  )
}

export default Hero