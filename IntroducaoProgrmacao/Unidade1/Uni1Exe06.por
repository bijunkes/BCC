programa {
    funcao calcularConsumo(inteiro c, inteiro q) {
        real consumo = q / 10.0 //Supondo que um carro consome 1L a cada 10km

        se(consumo > c) {
        escreva("Combustível insuficiente\n")
        retorne
        }

        escreva("Consumo: " + consumo + "L\n")
        escreva("Combustível restante: " + (c - consumo) + "L\n")
    }

    funcao inicio() {
        cadeia modelo
        inteiro capacidade
        inteiro quilometragem

        escreva("Modelo do carro: ")
        leia(modelo)

        escreva("Capacidade do tanque (L): ")
        leia(capacidade)

        escreva("Quilometragem rodada (Km): ")
        leia(quilometragem)

        calcularConsumo(capacidade, quilometragem)
    }
}