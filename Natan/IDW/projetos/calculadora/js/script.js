let calculadora = document.getElementById('calculadora')
let resultado = document.getElementById('result')
let numeroDigitado = ''

let criarBotao = (id, classe, valor) => {
    let button = document.createElement('button')
    button.id = id
    button.className = classe
    button.value = valor
    button.textContent = valor

    calculadora.appendChild(button)
}

for(let i = 0; i < 10; i++) {
    let botao = document.createElement('button')
    botao.textContent = i
    botao.value = i
    botao.id = `btn-${i}`

    if (i % 2 == 0) {
        botao.className = 'btn-par btn'
    } else {
        botao.className = 'btn-impar btn'
    }

    botao.addEventListener('click', (evento) =>{
        numeroDigitado += evento.target.value
        resultado.textContent = numeroDigitado
    })

    calculadora.appendChild(botao)
}

criarBotao('btn-ponto', 'btn btn-calculo', '.')
criarBotao("btn-soma", 'btn btn-calculo', '+')
criarBotao('btn-sub', 'btn btn-calculo', '-')
criarBotao('btn-mult', 'btn btn-calculo', '*')
criarBotao('btn-div', 'btn btn-calculo', '/')
criarBotao('btn-result', 'btn btn-calculo', '=')

document.getElementById('btn-ponto').addEventListener('click', (evento) => {
    numeroDigitado += evento.target.value
    resultado.textContent = numeroDigitado
})

document.getElementById('btn-soma').addEventListener('click', (evento) => {
    numeroDigitado += evento.target.value
    resultado.textContent = numeroDigitado
})

document.getElementById('btn-sub').addEventListener('click', (evento) => {
    numeroDigitado += evento.target.value
    resultado.textContent = numeroDigitado
})

document.getElementById('btn-div').addEventListener('click', (evento) => {
    numeroDigitado += evento.target.value
    resultado.textContent = numeroDigitado
})

document.getElementById('btn-mult').addEventListener('click', (evento) => {
    numeroDigitado += evento.target.value
    resultado.textContent = numeroDigitado
})

document.getElementById('btn-result').addEventListener('click', (evento) => {
    numeroDigitado = eval(numeroDigitado)
    resultado.textContent = numeroDigitado
})

document.getElementById('limpar').addEventListener('click', (evento) => {
    numeroDigitado = ''
    resultado.textContent = numeroDigitado
})