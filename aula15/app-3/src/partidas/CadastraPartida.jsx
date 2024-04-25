import { Fragment, useState } from "react"
import { Button, IconButton, Snackbar } from '@mui/material';


export function CadastraPartida() {

    const [identificador, setIdentificador] = useState()
    const [timeMandante, setTimeMandante] = useState()
    const [timeVisitante, setTimeVisitante] = useState()
    const [placarMandante, setPlacarMandante] = useState()
    const [placarVisitante, setPlacarVisitante] = useState()
    const [campeonato, setCampeonato] = useState()


    const [open, setOpen] = useState(false)

    const handleClose = (event, reason) => {
        if (reason === 'clickaway') {
          return;
        }
    
        setOpen(false);
    };


    function click() {
        let data = {
          'identificador': identificador,
          'mandante': timeMandante,
          'visitante': timeVisitante,
          'placarMandante': placarMandante,
          'placarVisitante': placarVisitante,
          'campeonato': campeonato,
        }
    
        fetch('http://localhost:8080/partida', {
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
          alert('erro no cadastro da Partida!')
          alert(response.status)
        })
    }

    return (
        <>
            <div className="card">

                Identificador: <input type='text' value={identificador} onChange={e => setIdentificador(e.target.value)}></input><br></br>
                Indentificador Time Mandante: <input type='text' value={timeMandante} onChange={e => setTimeMandante(e.target.value)}></input><br></br>
                Indentificador Time Visitante: <input type='text' value={timeVisitante} onChange={e => setTimeVisitante(e.target.value)}></input><br></br>
                Placar Time Mandante: <input type='text' value={placarMandante} onChange={e => setPlacarMandante(e.target.value)}></input><br></br>
                Placar Time Visitante: <input type='text' value={placarVisitante} onChange={e => setPlacarVisitante(e.target.value)}></input><br></br>
                Campeonato: <input type='text' value={campeonato} onChange={e => setCampeonato(e.target.value)}></input><br></br>


                <Button variant="outlined" onClick={() => click()}>Cadastrar</Button>

            </div>
            <Snackbar
                open={open}
                autoHideDuration={6000}
                onClose={handleClose}
                message="Partida cadastrada com sucesso!"
            ></Snackbar>
        </>
    )

}