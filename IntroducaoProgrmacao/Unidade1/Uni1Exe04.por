programa {
    funcao real depositar(real v, real s) {
        s = s + v
        escreva("Saldo: " + s + "\n")
        retorne s
    }

    funcao real sacar(real v, real s) {
        se (v > s) {
        escreva("Valor insuficiente")
        retorne s
        }
        s = s - v
        escreva("Saldo: " + s + "\n")
        retorne s
    }

    funcao inicio() {
        inteiro numero
        real saldo = 0
        real valor
        caracter acao

        enquanto(verdadeiro) {
        escreva("Ação a ser efetuada (D / S): ")
        leia(acao)

        se (acao == "D") {
            escreva("Valor a ser depositado: ")
            leia(valor)
            saldo = depositar(valor, saldo)

        } senao se (acao == "S") {
            escreva("Valor a ser sacado: ")
            leia(valor)
            saldo = sacar(valor, saldo)

        } senao {
            escreva("Ação inexistente")
        }
        }
    }
}