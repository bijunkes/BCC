programa {
    funcao inteiro adicionar(inteiro q, inteiro v) {
        q = q + v
        escreva("Quantidade atualizada: " + q + "\n")
        retorne q
    }

    funcao inteiro remover(inteiro q, inteiro v) {
        se(q < v) {
        escreva("Estoque insuficiente\n")
        retorne q
        }
        q = q - v
        escreva("Quantidade atualizada: " + q + "\n")
        retorne q
    }

    funcao calcularTotal(real p, inteiro q) {
        retorne escreva("Valor total: " + (p * q) + "\n")
    }

    funcao inicio() {
        cadeia nome
        real preco
        inteiro quantidade
        
        escreva("Nome do produto: ")
        leia(nome)

        escreva("Preço do produto: ")
        leia(preco)

        escreva("Quantidade do produto: ")
        leia(quantidade)

        caracter acao

        inteiro valor

        enquanto(verdadeiro) {
        escreva("Ação a efetuada (A / R / C): ")
        leia(acao)

        se(acao == "A") {
            escreva("Quantidade a ser adicionada: ")
            leia(valor)
            quantidade = adicionar(quantidade, valor)

        } senao se(acao == "R") {
            escreva("Quantidade a ser removida: ")
            leia(valor)
            quantidade =remover(quantidade, valor)

        } senao se (acao == "C") {
            calcularTotal(preco, quantidade)

        } senao {
            escreva("Ação inexistente")
        }
        }
    }
}