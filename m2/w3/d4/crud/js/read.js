const apiUtenti = 'http://localhost:3000/utenti';
const tabellaUtenti = document.querySelector('#tabella-utenti')

if(tabellaUtenti){

    fetch(apiUtenti)
    .then(res => res.json())
    .then(utenti => {
            
        for(let utente of utenti){
            
            //creo la tr e le td per i dati dell'utente
            let tr = document.createElement('tr');
            let tdNome = document.createElement('td');
            let tdCognome = document.createElement('td');
            let tdEta = document.createElement('td');
            
            //inserisco i dati nelle rispettive td
            tdNome.innerHTML = utente.nome
            tdCognome.innerHTML = utente.cognome
            tdEta.innerHTML = utente.eta
            
            //creo una td per i bottoni delle azioni
            let tdAzioni = document.createElement('td');
            let btnModifica = document.createElement('button');
            let btnElimina = document.createElement('button');
            
            //scrivo nei bottoni e do loro delle classi
            btnModifica.classList.add('btn','btn-warning');
            btnModifica.innerHTML = 'Modifica'
            btnElimina.classList.add('btn','btn-danger','text-dark');
            btnElimina.innerHTML = 'Elimina'
            
            tdAzioni.append(btnModifica, btnElimina)
            
            tr.append(tdNome,tdCognome,tdEta,tdAzioni);
            tabellaUtenti.append(tr);
            
        }
        
    })
}

