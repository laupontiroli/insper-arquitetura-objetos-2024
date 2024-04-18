import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {

  const [nome, setNome] = useState()
  const [identificador, setIdentificador] = useState()
  const [estado, setEstado] = useState()
  const [estadio, setEstadio] = useState()

  const [data, setData] = useState([])

  function click() {
    let data = {
      'nome': nome,
      'identificador': identificador,
      'estado': estado,
      'estadio': estadio
    }

    fetch('http://localhost:8080/time', {
      method: 'POST',
      body: JSON.stringify(data),
      headers: {
        'Content-Type': 'application/json'
      }
    }).then(response => {
      alert('Time cadastrado com sucesso!')
      alert(response.status)
      load()
    }).catch(response => {
      alert('erro no cadastro do time!')
      alert(response.status)
    })
  }

  async function load() {
    let data = await fetch('http://localhost:8080/time', {
      method: 'GET'
    }).then(response => {

      return response.json()
      
    }).catch(response => {
      alert('Erro ao listar times!')
      alert(response.status)
    })
    setData(data)
  }

  return (
    <>
      <h1>Hello World!</h1>
      <div className="card">

        Nome: <input type='text' value={nome} onChange={e => setNome(e.target.value)} ></input><br></br>
        Identificador: <input type='text' value={identificador} onChange={e => setIdentificador(e.target.value)}></input><br></br>
        Estado: <input type='text' value={estado} onChange={e => setEstado(e.target.value)}></input><br></br>
        Estádio: <input type='text' value={estadio} onChange={e => setEstadio(e.target.value)}></input><br></br>

        <button onClick={() => click()}>Cadastrar</button>
      </div>
      <div className="card">

        <table>
          <tbody>
            <tr>
              <td>Nome</td>
              <td>Identificador</td>
              <td>Estado</td>
              <td>Estádio</td>
            </tr>            
            {
              data.map((time, index) => {
                return <tr>
                  <td>{time.nome}</td>
                  <td>{time.identificador}</td>
                  <td>{time.estado}</td>
                  <td>{time.estadio}</td>
                </tr>
              })

            }
          </tbody>
        </table>

      </div>
      
    </>
  )
}

export default App
