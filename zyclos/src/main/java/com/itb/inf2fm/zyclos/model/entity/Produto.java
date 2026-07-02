package com.itb.inf2fm.zyclos.model.entity;

import java.math.BigDecimal;

import com.itb.inf2fm.zyclos.model.enums.CategoriaProduto;
import com.itb.inf2fm.zyclos.model.enums.CondicaoProduto;

public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private CategoriaProduto categoria;
    private CondicaoProduto condicao;
    private String tamanho;
    private String material;
    private BigDecimal valorVenda;
    private int quantidadeEstoque;
    // CO2 economizado ao reutilizar/reciclar a peca em vez de comprar nova
    private BigDecimal impactoAmbientalKgCo2;
    private boolean codStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public CondicaoProduto getCondicao() {
        return condicao;
    }

    public void setCondicao(CondicaoProduto condicao) {
        this.condicao = condicao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public BigDecimal getImpactoAmbientalKgCo2() {
        return impactoAmbientalKgCo2;
    }

    public void setImpactoAmbientalKgCo2(BigDecimal impactoAmbientalKgCo2) {
        this.impactoAmbientalKgCo2 = impactoAmbientalKgCo2;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
