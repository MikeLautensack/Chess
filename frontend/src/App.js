import Navbar from './components/Navbar';
import Board from './components/Board';

function App() {
  return (
    <body className='flex h-screen bg-blue-100'>
      <Navbar />
      <div id='game-area' className='absolute flex w-[80%] right-0 h-screen justify-center items-center bg-blue-500'>
        <Board />
      </div>
    </body>
  );
}

export default App;
