import React from 'react'
import './css/Hero.css'
import { useState } from 'react'
import { FaBars, FaTimes } from 'react-icons/fa'
import { Link } from 'react-router-dom'

const Hero = () => {

  const [nav, setNav] = useState(false)
  const handleClick = () => setNav(!nav)
    
  return (
    <section className='hero'>

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
                        <Link to='/'>Home</Link>
                    </div>
                    <div className='header-nav-about'>
                        <Link to='/About'>About</Link>
                    </div>
                    <div className='header-nav-demo'>
                        <Link to='/Demo'>Demo</Link>
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