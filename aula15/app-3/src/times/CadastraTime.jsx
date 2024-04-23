import { Fragment, useState } from "react"
import { Button, IconButton, Snackbar } from '@mui/material';


export function CadastraTime() {

    const [nome, setNome] = useState()
    const [identificador, setIdentificador] = useState()
    const [estado, setEstado] = useState()
    const [estadio, setEstadio] = useState()

    const [open, setOpen] = useState(false)

    const handleClose = (event, reason) => {
        if (reason === 'clickaway') {
          return;
        }
    
        setOpen(false);
    };


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
          setOpen(true)
          //load()
        }).catch(response => {
          alert('erro no cadastro do time!')
          alert(response.status)
        })
    }

    return (
        <>
            <div className="card">

                Nome: <input type='text' value={nome} onChange={e => setNome(e.target.value)} ></input><br></br>
                Identificador: <input type='text' value={identificador} onChange={e => setIdentificador(e.target.value)}></input><br></br>
                Estado: <input type='text' value={estado} onChange={e => setEstado(e.target.value)}></input><br></br>
                Estádio: <input type='text' value={estadio} onChange={e => setEstadio(e.target.value)}></input><br></br>

                <Button variant="outlined" onClick={() => click()}>Cadastrar</Button>

            </div>
            <Snackbar
                open={open}
                autoHideDuration={6000}
                onClose={handleClose}
                message="Time cadastrado com sucesso!"
            ></Snackbar>
        </>
    )

}