import { useMediaQuery } from 'react-responsive'
import { Route, Routes} from 'react-router-dom'
import Hero from './componentts/Hero'
import About from './componentts/About'
import Demo from './componentts/Demo'

function App() {

  const isMobile = useMediaQuery({ maxWidth: 768 })

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
      <>
        <Hero />
        <About />
        <Demo />
      </>
    );
  }
}

export default App;
