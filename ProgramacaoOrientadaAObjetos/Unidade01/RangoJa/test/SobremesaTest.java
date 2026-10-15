package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.Sobremesa;

class SobremesaTest {

    @Test
    void pudim150g() {
        Sobremesa pudim = new Sobremesa("Pudim", 8, 150);
        assertEquals(12.0, pudim.calcularPreco(), 0.001);
    }

    // casos próprios
    @Test
    void pesoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Sobremesa("Pudim", 8, 0);
        });
    }

    @Test
    void toStringComPeso() {
        Sobremesa pudim = new Sobremesa("Pudim", 8, 150);
        assertEquals("Pudim - R$ 12,00 (150 g)", pudim.toString());
    }
}