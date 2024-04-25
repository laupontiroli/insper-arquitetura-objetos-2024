import { Fragment, useState } from "react"
import { Button, IconButton, Snackbar } from '@mui/material';


export function CadastraCampeonato() {

    const [nome, setNome] = useState()
    const [identificador, setIdentificador] = useState()

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
          'identificador': identificador
        }
    
        fetch('http://localhost:8080/campeonato', {
          method: 'POST',
          body: JSON.stringify(data),
          headers: {
            'Content-Type': 'application/json'
          }
        }).then(response => {
            if (!response.ok) {
            throw 'Error';
          }
          setOpen(true)
          //load()
        }).catch(response => {
          alert('erro no cadastro do campeonato!')
          alert(response.status)
        })
    }

    return (
        <>
            <div className="card">

                Nome: <input type='text' value={nome} onChange={e => setNome(e.target.value)} ></input><br></br>
                Identificador: <input type='text' value={identificador} onChange={e => setIdentificador(e.target.value)}></input><br></br>
                <Button variant="outlined" onClick={() => click()}>Cadastrar</Button>

            </div>
            <Snackbar
                open={open}
                autoHideDuration={6000}
                onClose={handleClose}
                message="Campeonato cadastrado com sucesso!"
            ></Snackbar>
        </>
    )

}3