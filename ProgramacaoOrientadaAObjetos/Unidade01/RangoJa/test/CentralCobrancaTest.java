package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.*;

class CentralCobrancaTest {

    CentralCobranca central;
    Cliente ana;

    @BeforeEach
    void setup() {
        central = new CentralCobranca();
        ana = new Cliente("Ana", "ana@furb.br", 20);
    }

    @Test
    void totalPedidoMaisAssinatura() {
        Pedido p = new Pedido(ana);
        p.adicionarItem(new Prato("Xis Salada", 30, 'M'));
        p.adicionarItem(new Bebida("Refri", 6, 350, false));
        p.adicionarItem(new Sobremesa("Pudim", 8, 150));
        central.registrar(p);
        central.registrar(new AssinaturaClube(ana, 19.90, 12));
        assertEquals(266.98, central.calcularTotalAReceber(), 0.001);
    }

    // casos próprios
    @Test
    void registrarNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            central.registrar(null);
        });
    }

    @Test
    void relatorioTemTotal() {
        central.registrar(new AssinaturaClube(ana, 10, 1));
        assertTrue(central.gerarRelatorio().endsWith("Total a receber: R$ 10,00"));
        assertEquals(1, central.getQuantidadeCobrancas());
    }
}