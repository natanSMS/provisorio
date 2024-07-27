const http = require('http')
const port = 5000

const produtos = [
    { nome: 'Bolu de murangu', valor: 1000000},
    { nome: 'Bollo de chocolate', valor: 3000},
]
const requestHandler = (req, res) => {
    res.setHeader('Acess-Control-Allow-Origin', '*')
    res.write(JSON.stringify(produtos))
    return res.end()
}

const server = http.createServer(requestHandler)

server.listen(port, () => {
    console.log('Servidor rodando na porta 5000')
})