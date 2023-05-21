import { useMediaQuery } from 'react-responsive'
import { Route, Routes} from 'react-router-dom'
import Hero from './componentts/Hero'
import About from './componentts/About'
import Demo from './componentts/Demo'
import { scroller } from 'react-scroll'

function App() {

  const isMobile = useMediaQuery({ maxWidth: 750 })

  const scrollToComponent = (componentName) => {
    scroller.scrollTo(componentName, {
      duration: 800,
      delay: 0,
      smooth: 'easeInOutQuart',
    })
  }
  

  if (isMobile) {
    return (
      <Routes>
          <Route path='/' element={<Hero />}></Route>
          <Route path='/About' element={<About />}></Route>
          <Route path='/Demo' element={<Demo />}></Route>
      </Routes>
    );
  } else {
    return (
      <div className='app'>
        <Hero id='hero' scrollToComponent={scrollToComponent} />
        <About id='about'/>
        <Demo id='demo'/>
      </div>
    );
  }
}

export default App;
