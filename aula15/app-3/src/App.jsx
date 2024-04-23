import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { CadastraTime } from './times/CadastraTime'
import { ListaTimes } from './times/ListaTimes'

function App() {


  return (
    <>
      <h1>Hello World!</h1>
      <CadastraTime></CadastraTime>
      <ListaTimes></ListaTimes>
    </>
  )
}

export default App
