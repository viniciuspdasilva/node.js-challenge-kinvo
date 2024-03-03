package org.acme.enums;

public enum Categoria {
    CASA("CASA", 1, .874),
    EDUCACAO("EDUCACAO", 2, .744),
    LAZER("LAZER", 3, .544),
    SAUDE("SAUDE", 4, .9934),
    ALIMENTACAO("ALIMENTACAO", 5, .9945),
    TRANSPORTE("TRANSPORTE", 6, .8766),
    PESSOAIS("DESPESAS_PESSOAIS", 7, .655),
    COMUNICACAO("COMUNICACAO", 8, .4333),
    TARIFAS("TARIFAS_IMPOSTOS", 9, 1.0),
    OUTROS("OUTROS", 10, .344);

    private final String label;
    private final Integer value;
    private final Double grauImportancia;

    Categoria(String label, Integer value, Double grauImportancia) {
        this.label = label;
        this.value = value;
        this.grauImportancia = grauImportancia;
    }

    public String getLabel() {
        return label;
    }

    public Integer getValue() {
        return value;
    }

    public Double getGrauImportancia() {
        return grauImportancia;
    }
}
