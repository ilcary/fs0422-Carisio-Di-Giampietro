const express = require('express');
const app = express();

const path = require('path');

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname+'/index.html'))
})

app.get('/chisiamo', (req, res) => {
    res.sendFile(path.join(__dirname+'/chisiamo.html'))
})
app.get('/contatti', (req, res) => {
    res.sendFile(path.join(__dirname+'/contatti.html'))
})

app.listen(3000, () => console.log("Server attivo all'indirizzo http://127.0.0.1:3000/") )