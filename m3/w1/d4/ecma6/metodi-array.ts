

let prodotty = [
    {
        tipo:'Maglietta',
        prezzo:35,
        varianti:[
            {
                taglia: 'xs',
                colore: 'Giallo',
                q:3,
                disponibile:true
            },
            {
                taglia: 'xs',
                colore: 'Rosso',
                q:0,
                disponibile:true
            },
            {
                taglia: 'm',
                colore: 'Giallo Fluo',
                q:100,
                disponibile:true
            }
        ]
    },
    {
        tipo:'Canottiera',
        prezzo:25,
        varianti:[
            {
                taglia: 'xs',
                colore: 'Giallo',
                q:15,
                disponibile:true
            },
            {
                taglia: 'm',
                colore: 'Giallo Fluo',
                q:100,
                disponibile:true
            }
        ]
    },
]

// MAP
// ottengo array delle varianti
let taglie = prodotty.map(p => p.varianti)

console.log(taglie);

prodotty = prodotty.map(p => {

    p.varianti = p.varianti.map(v =>{
        if(v.q == 0){
            v.disponibile = false;
        } 
        return v;

    })

    return p
})

//il terminale di vs mi abbrevia ad [Object] ma funziona
console.log(prodotty);
console.log('-------------------------------------');

// FILTER = restituisce un array
let taglieDisponibili = prodotty[0].varianti.filter(v => v.disponibile)
console.log(taglieDisponibili);

// FIND = restituisce un solo valore o niente
// non so perche non vada
let jeans = prodotty.find(p => p.tipo == 'Jeans')

