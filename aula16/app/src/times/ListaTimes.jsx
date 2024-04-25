import { useEffect, useState } from "react";

export default function ListarTimes() {

    const [data, setData] = useState([])

    async function listTeams() {
        let data = await fetch('http://localhost:8080/time', {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(response => {
            console.log(response.status)
            if (response.status === 200) {
                return response.json();
            } else {
                return null;
            }
        })
        console.log(data)
        setData(data)
    };

    useEffect(() => {
        listTeams()
    }, []);

    return (
        <div>
            <table>
                <tbody>

                {
                    data.map((team, index) => {
                        return <tr>
                           <td>{team.identificador}</td>
                           <td>{team.nome}</td>
                        </tr> 
                    })
                }
                </tbody>

            </table>

        </div>
    )

}