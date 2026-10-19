/**
 * DEPENDENCIA (seta tracejada - - ->): GeradorRecibo usa Entrega como PARAMETRO
 * e Taxa como VARIAVEL LOCAL. Nao ha variavel de instancia.
 */
public class GeradorRecibo {
    public String gerar(Entrega e) {             // parametro
        Taxa t = new Taxa();                     // variavel local
        return "RECIBO: " + e.resumo() + " | R$ " + String.format("%.2f", t.aplicar(e.getValor()));
    }
}
