function eliminaUtente(id,el){
    const apiUtenti = 'http://localhost:3000/utenti';

    let options = {
        method: 'DELETE',
        headers:{
            "content-type":"application/json"
        }
    }

    fetch(apiUtenti+'/'+id,options)
    .then(res => res.json())
    .then(res => {
      
        el.remove()
        
        Swal.fire({
            position: 'top-end',
            icon: 'success',
            title: 'Utente Eliminato',
            text:`L'utente è stato eliminato`,
            showConfirmButton: false,
            timer: 5000
        })
    })
}