package modelo;

import java.math.BigDecimal;

public class Orcamento {
    public BigDecimal valorOrcamento;
    public String icmsRegiao;

    public Orcamento(BigDecimal valororcamento, String icmsregiao) {
        this.valorOrcamento = valororcamento;
        this.icmsRegiao = icmsregiao;
    }
}
