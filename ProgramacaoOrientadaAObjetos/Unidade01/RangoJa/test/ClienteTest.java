package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Cliente;
import src.SaldoInsuficienteException;

class ClienteTest {

    Cliente ana;

    @BeforeEach
    void setup() {
        ana = new Cliente("Ana Souza", "ana@furb.br", 20);
    }

    @Test
    void idadeNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cliente("X", "x@x.br", -1);
        });
    }

    @Test
    void emailSemArroba() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cliente("Ana", "ana.furb.br", 20);
        });
    }

    @Test
    void indicacaoCreditaDez() {
        new Cliente("Beto", "beto@furb.br", 17, ana);
        assertEquals(10.0, ana.getSaldoCashback(), 0.001);
    }

    @Test
    void usarMaisQueOSaldo() {
        ana.creditarCashback(10.0);
        assertThrows(SaldoInsuficienteException.class, () -> {
            ana.usarCashback(15.0);
        });
    }

    @Test
    void equalsIgnoraCase() {
        Cliente outra = new Cliente("Outra", "ANA@FURB.BR", 30);
        assertTrue(ana.equals(outra));
    }

    // casos próprios
    @Test
    void toStringFormato() {
        assertEquals("Ana Souza <ana@furb.br>", ana.toString());
    }

    @Test
    void usarCashbackDescontaSaldo() throws SaldoInsuficienteException {
        ana.creditarCashback(10.0);
        ana.usarCashback(4.0);
        assertEquals(6.0, ana.getSaldoCashback(), 0.001);
    }
}