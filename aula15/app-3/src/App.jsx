import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { CadastraTime } from './times/CadastraTime'
import { ListaTimes } from './times/ListaTimes'
import { CadastraPartida } from './partidas/CadastraPartida'
import { ListaPartidas} from './partidas/ListaPartidas'
import { Link, Route, Routes } from 'react-router-dom'
import { Grid } from '@mui/material'
import { ListaCampeonatos } from './campeonatos/ListaCampeonatos'
import { CadastraCampeonato } from './campeonatos/CadastraCampeonato'

function App() {


  return (
    <>
      <Grid containe className='menu'>
      <Grid item xs={4}>
      <Link to="/">Home</Link>
      </Grid>
      <Grid item xs={4}>
      <Link to="/cadastrarTime">Cadastre um novo time</Link>
      </Grid>
      <Grid item xs={4}>
      <Link to="/listarTimes"> Veja todos os times</Link>
      </Grid>
      <Grid item xs={4}>
      <Link to="/cadastrarPartida">Cadastre uma nova partida</Link>
      </Grid>
      <Grid item xs={4}>
      <Link to="/listarPartidas"> Veja todas as partidas</Link>
      </Grid>
      <Grid item xs={4}>
      <Link to="/cadastrarCampeonato">Cadastre um novo Campeonato</Link>
      </Grid>
      <Grid item xs={4}>
      <Link to="/listarCampeonatos"> Veja todos os Campeonatos</Link>
      </Grid>
      </Grid>
      <h1>Hello World!</h1>

      <Routes> 
        <Route path='/cadastrarTime' element={<CadastraTime/>}> </Route>
        <Route path='/cadastrarPartida' element={<CadastraPartida/>}> </Route>
        <Route path='/cadastrarCampeonato' element={<CadastraCampeonato/>}> </Route>
        <Route path='/listarTimes' element={<ListaTimes/>}> </Route>
        <Route path='/listarPartidas' element={<ListaPartidas/>}> </Route>
        <Route path='/listarCampeonatos' element={<ListaCampeonatos/>}> </Route>
      </Routes>
    </>
  )
}

export default App
