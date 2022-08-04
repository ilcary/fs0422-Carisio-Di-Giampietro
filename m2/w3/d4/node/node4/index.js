const express = require('express');
const app = express();

const path = require('path');

app.engine('html', require('ejs').renderFile);
app.set('view engine', 'html');

app.get('/', (req, res) => {
    res.send('Benvenuto')
})

app.get('/chi-siamo', (req, res) => {
    res.render(path.join(__dirname+'/chi-siamo.html'),{titolo:'Chi siamo'})
})
app.get('/contatti', (req, res) => {
    res.sendFile(path.join(__dirname+'/contatti.html'))
})

app.get('/api/v1/menu', (req, res) => {
    res.send([
        {
            gusto:'Margherita',
            prezzo: 5
        },
        {
            gusto:'Diavola',
            prezzo: 1
        }
    ])
})

app.use((req,res) => {
    res.status(404).send('Not found')
})

app.listen(3000, () => console.log("Server attivo all'indirizzo http://127.0.0.1:3000") )