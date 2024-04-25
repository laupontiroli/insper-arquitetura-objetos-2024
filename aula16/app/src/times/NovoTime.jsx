import { useState } from 'react'

export function NovoTime() {

    const [nome, setNome] = useState()
    const [identificador, setIdentificador] = useState()
    const [estadio, setEstadio] = useState()

    function buttonClick() {

        var data = {
            'nome' : nome,
            'identificador': identificador,
            'estadio': estadio
        }

        fetch('http://localhost:8080/time', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        }).then(response => {
            console.log(response.status)
        }).catch(e => {
            alert('Erro criando time')
        })
    }
    
    return (
        <>
            Nome:<input type='text' value={nome} onChange={e => setNome(e.target.value)}></input><br></br>
            Descrição: <input type='text' value={identificador}  onChange={e => setIdentificador(e.target.value)}></input><br></br>
            Estádio: <input type='text' value={estadio}  onChange={e => setEstadio(e.target.value)}></input><br></br>

            <button onClick={() => buttonClick()}>Cadastrar</button>
        </>

    )

}
