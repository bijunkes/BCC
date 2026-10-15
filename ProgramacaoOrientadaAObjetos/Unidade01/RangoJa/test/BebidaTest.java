package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.Bebida;

class BebidaTest {

    @Test
    void choppAlcoolico() {
        Bebida chopp = new Bebida("Chopp", 12, 500, true);
        assertEquals(15.0, chopp.calcularPreco(), 0.001);
    }

    // casos próprios
    @Test
    void refriSemAcrescimo() {
        Bebida refri = new Bebida("Refri", 6, 350, false);
        assertEquals(6.0, refri.calcularPreco(), 0.001);
    }

    @Test
    void volumeInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Bebida("Refri", 6, 0, false);
        });
    }

    @Test
    void toStringAlcoolica() {
        Bebida chopp = new Bebida("Chopp", 12, 500, true);
        assertEquals("Chopp - R$ 15,00 (500 ml) [alcoólica]", chopp.toString());
    }
}