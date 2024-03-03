package org.acme.persistence.dto;

import org.acme.enums.Categoria;
import org.acme.enums.TipoLancamento;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Objects;

/**
 * DTO for {@link org.acme.persistence.models.Lancamento}
 */
public class LancamentoDto implements Serializable {
    private final String title;
    private final BigDecimal value;
    private final TipoLancamento tipo;
    private final Calendar dataLancamento;
    private final Calendar dataVencimento;
    private final boolean isConcluido;
    private final Categoria categoria;
    private final UserDto usuario;

    public LancamentoDto(String title, BigDecimal value, TipoLancamento tipo, Calendar dataLancamento, Calendar dataVencimento, boolean isConcluido, Categoria categoria, UserDto usuario) {
        this.title = title;
        this.value = value;
        this.tipo = tipo;
        this.dataLancamento = dataLancamento;
        this.dataVencimento = dataVencimento;
        this.isConcluido = isConcluido;
        this.categoria = categoria;
        this.usuario = usuario;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getValue() {
        return value;
    }

    public TipoLancamento getTipo() {
        return tipo;
    }

    public Calendar getDataLancamento() {
        return dataLancamento;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public boolean getIsConcluido() {
        return isConcluido;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public UserDto getUsuario() {
        return usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LancamentoDto entity = (LancamentoDto) o;
        return Objects.equals(this.title, entity.title) &&
                Objects.equals(this.value, entity.value) &&
                Objects.equals(this.tipo, entity.tipo) &&
                Objects.equals(this.dataLancamento, entity.dataLancamento) &&
                Objects.equals(this.dataVencimento, entity.dataVencimento) &&
                Objects.equals(this.isConcluido, entity.isConcluido) &&
                Objects.equals(this.categoria, entity.categoria) &&
                Objects.equals(this.usuario, entity.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, value, tipo, dataLancamento, dataVencimento, isConcluido, categoria, usuario);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "title = " + title + ", " +
                "value = " + value + ", " +
                "tipo = " + tipo + ", " +
                "dataLancamento = " + dataLancamento + ", " +
                "dataVencimento = " + dataVencimento + ", " +
                "isConcluido = " + isConcluido + ", " +
                "categoria = " + categoria + ", " +
                "usuario = " + usuario + ")";
    }
}