import { useState } from 'react'
import { Link, Route, Routes } from 'react-router-dom';
import { NovoTime } from './times/NovoTime';
import ListarTimes from './times/ListaTimes';

function App() {

  return (
    <>
          <Link to='/newTeam'>New Team</Link>&nbsp;&nbsp;&nbsp;
          <Link to='/listTeam'>List Teams</Link>
          <br></br>
          <br></br>
        
          <Routes>
            <Route path='/newTeam' element={<NovoTime/>}></Route>
            <Route path='/listTeam' element={<ListarTimes/>}></Route>
          </Routes>

          
    </>
  )
}

export default App
