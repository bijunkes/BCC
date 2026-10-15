package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.Prato;

class PratoTest {

    @Test
    void tamanhoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Prato("Xis", 30, 'X');
        });
    }

    @Test
    void descontoDezPorCento() {
        Prato prato = new Prato("Xis", 30, 'M');
        assertEquals(35.10, prato.calcularPrecoComDesconto(10), 0.001);
    }

    @Test
    void descontoInvalido() {
        Prato prato = new Prato("Xis", 30, 'M');
        assertThrows(IllegalArgumentException.class, () -> {
            prato.calcularPrecoComDesconto(120);
        });
    }

    // casos próprios
    @Test
    void tamanhoGrande() {
        Prato prato = new Prato("Xis", 30, 'G');
        assertEquals(48.0, prato.calcularPreco(), 0.001);
    }

    @Test
    void toStringComTamanho() {
        Prato prato = new Prato("Xis Salada", 30, 'M');
        assertEquals("Xis Salada - R$ 39,00 (tamanho M)", prato.toString());
    }
}