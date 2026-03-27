programa {
    funcao inteiro calcularArea(inteiro c, inteiro l) {
        retorne c * l
    }

    funcao inteiro cacularPerimetro(inteiro c, inteiro l) {
        retorne 2 * c + 2 * l
    }

    funcao inicio() {
        inteiro comprimento
        inteiro largura

        escreva("Comprimento: ")
        leia(comprimento)

        escreva("Largura: ")
        leia(largura)

        escreva("Área: " + calcularArea(comprimento, largura))
        escreva("\nPerímetro: " + cacularPerimetro(comprimento, largura))
    }
}