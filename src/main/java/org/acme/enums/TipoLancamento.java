package org.acme.enums;

public enum TipoLancamento {
    DEBITO("D", 1),
    CREDITO("C", 2);
    private final String label;
    private final Integer codigo;

    TipoLancamento(String label, Integer codigo) {
        this.label = label;
        this.codigo = codigo;
    }

    public String getLabel() {
        return label;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
