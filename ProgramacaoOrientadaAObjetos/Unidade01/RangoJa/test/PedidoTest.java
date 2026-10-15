package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.*;

class PedidoTest {

    Cliente ana;
    Cliente beto;

    @BeforeEach
    void setup() {
        ana = new Cliente("Ana", "ana@furb.br", 20);
        beto = new Cliente("Beto", "beto@furb.br", 17);
    }

    @Test
    void subtotalMisto() {
        Pedido p = new Pedido(ana);
        p.adicionarItem(new Prato("Xis Salada", 30, 'M'));
        p.adicionarItem(new Bebida("Refri", 6, 350, false));
        p.adicionarItem(new Sobremesa("Pudim", 8, 150));
        assertEquals(57.0, p.calcularSubtotal(), 0.001);
        assertEquals(7.0, p.calcularTaxaEntrega(), 0.001);
        assertEquals(64.0, p.calcularValorCobrar(), 0.001);
    }

    @Test
    void freteGratis() {
        Pedido p = new Pedido(ana);
        p.adicionarItem(new Prato("Xis", 40, 'G'), 2);
        assertEquals(0.0, p.calcularTaxaEntrega(), 0.001);
        assertEquals(128.0, p.calcularValorCobrar(), 0.001);
    }

    @Test
    void menorComChopp() {
        Pedido p = new Pedido(beto);
        assertThrows(IllegalArgumentException.class, () -> {
            p.adicionarItem(new Bebida("Chopp", 12, 500, true));
        });
    }

    @Test
    void quantidadeZero() {
        Pedido p = new Pedido(ana);
        assertThrows(IllegalArgumentException.class, () -> {
            p.adicionarItem(new Prato("Xis", 30, 'P'), 0);
        });
    }

    @Test
    void finalizarSemItens() {
        Pedido p = new Pedido(ana);
        assertThrows(IllegalStateException.class, () -> {
            p.finalizar();
        });
    }

    @Test
    void finalizarCreditaCashback() {
        Pedido p = new Pedido(ana);
        p.adicionarItem(new Prato("Xis Salada", 30, 'M'));
        p.adicionarItem(new Bebida("Refri", 6, 350, false));
        p.adicionarItem(new Sobremesa("Pudim", 8, 150));
        p.finalizar();
        assertEquals(2.85, ana.getSaldoCashback(), 0.001);
    }

    @Test
    void numerosConsecutivos() {
        Pedido a = new Pedido(ana);
        Pedido b = new Pedido(ana);
        assertEquals(1, b.getNumero() - a.getNumero());
    }

    // casos próprios
    @Test
    void clienteNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Pedido(null);
        });
    }

    @Test
    void adicionarAposFinalizar() {
        Pedido p = new Pedido(ana);
        p.adicionarItem(new Prato("Xis", 30, 'P'));
        p.finalizar();
        assertThrows(IllegalStateException.class, () -> {
            p.adicionarItem(new Prato("Xis", 30, 'P'));
        });
    }
}