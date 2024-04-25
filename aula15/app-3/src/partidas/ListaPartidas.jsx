import { useEffect, useState } from "react"


export function ListaPartidas() {

  const [data, setData] = useState([])

  useEffect(() => {
    load()
  }, [])

  function load() {
    fetch('http://localhost:8080/partida', {
      method: 'GET'
    }).then(response => {
      return response.json()
    }).then(data => {
      setData(data)
    }).catch(response => {
      alert('Erro ao listar partidas!')
      alert(response.status)
    })
  }

  return(
    <>
        <div className="card">
            <table>
                <tbody>
                    <tr>
                    <td>Identidicador</td>
                    <td>Time Mandante</td>
                    <td>Time Visitante</td>
                    <td>Placar Mandante</td>
                    <td>Placar Visitante</td>
                    </tr>            
                    {
                    data.map((partida, index) => {
                        return <tr key={index}>
                        <td>{partida.nomeCampeonato}</td>
                        <td>{partida.nomeMandante}</td>
                        <td>{partida.nomeVisitante}</td>
                        <td>{partida.placarMandante}</td>
                        <td>{partida.placarVisitante}</td>
                        </tr>
                    })

                    }
                </tbody>
            </table>

        </div>
      </>
  )


}