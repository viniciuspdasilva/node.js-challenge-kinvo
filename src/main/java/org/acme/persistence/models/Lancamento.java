package org.acme.persistence.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import org.acme.enums.Categoria;
import org.acme.enums.TipoLancamento;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Objects;

@Entity
@Table(name = "lancamento", indexes = {
        @Index(name = "idx_lancamento_title_tipo",
                columnList = "title, tipo, categoria, dataLancamento"
        )
})
public class Lancamento extends PanacheEntity {
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private BigDecimal value;
    @Enumerated(EnumType.ORDINAL)
    private TipoLancamento tipo;
    private Calendar dataLancamento = Calendar.getInstance();
    private Calendar dataVencimento;
    private boolean isConcluido;
    @Enumerated(EnumType.ORDINAL)
    private Categoria categoria;
    @OneToOne(orphanRemoval = true)
    private User usuario;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public TipoLancamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoLancamento tipo) {
        this.tipo = tipo;
    }

    public Calendar getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Calendar dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isConcluido() {
        return isConcluido;
    }

    public void setConcluido(boolean concluido) {
        isConcluido = concluido;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lancamento that = (Lancamento) o;
        return isConcluido == that.isConcluido && Objects.equals(title, that.title) && Objects.equals(value, that.value) && tipo == that.tipo && Objects.equals(dataLancamento, that.dataLancamento) && Objects.equals(dataVencimento, that.dataVencimento) && categoria == that.categoria && Objects.equals(usuario, that.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, value, tipo, dataLancamento, dataVencimento, isConcluido, categoria, usuario);
    }

    @Override
    public String toString() {
        return "Lancamento{" +
                "title='" + title + '\'' +
                ", value=" + value +
                ", tipo=" + tipo +
                ", dataLancamento=" + dataLancamento +
                ", dataVencimento=" + dataVencimento +
                ", isConcluido=" + isConcluido +
                ", categoria=" + categoria +
                '}';
    }
}