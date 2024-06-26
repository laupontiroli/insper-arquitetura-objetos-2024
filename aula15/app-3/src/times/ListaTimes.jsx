import { useEffect, useState } from "react"


export function ListaTimes() {

  const [data, setData] = useState([])

  useEffect(() => {
    load()
  }, [])

  function load() {
    fetch('http://localhost:8080/time', {
      method: 'GET'
    }).then(response => {
      return response.json()
    }).then(data => {
      setData(data)
    }).catch(response => {
      alert('Erro ao listar times!')
      alert(response.status)
    })
  }

  return(
    <>
        <div className="card">
            <table>
                <tbody>
                    <tr>
                    <td>ID</td>
                    <td>Nome</td>
                    <td>Identificador</td>
                    <td>Estado</td>
                    <td>Estádio</td>
                    </tr>            
                    {
                    data.map((time, index) => {
                        return <tr>
                        <td>{time.id}</td>
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