package com.itb.inf2fm.zyclos.model.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.itb.inf2fm.zyclos.model.entity.Produto;
import com.itb.inf2fm.zyclos.model.enums.CategoriaProduto;
import com.itb.inf2fm.zyclos.model.enums.CondicaoProduto;

public class ProdutoService {

    private static List<Produto> produtos = new ArrayList<>();
    private static Long proximoId = 1L;

    static {
        Produto produto1 = new Produto();
        produto1.setId(gerarNovoId());
        produto1.setNome("Jaqueta Jeans");
        produto1.setDescricao("Jaqueta jeans seminova, otimo estado de conservacao.");
        produto1.setCategoria(CategoriaProduto.JAQUETA);
        produto1.setCondicao(CondicaoProduto.SEMINOVO);
        produto1.setTamanho("M");
        produto1.setMaterial("Algodao / Jeans");
        produto1.setValorVenda(new BigDecimal("89.90"));
        produto1.setQuantidadeEstoque(1);
        produto1.setImpactoAmbientalKgCo2(new BigDecimal("12.50"));
        produto1.setCodStatus(true);
        produtos.add(produto1);

        Produto produto2 = new Produto();
        produto2.setId(gerarNovoId());
        produto2.setNome("Vestido Floral");
        produto2.setDescricao("Vestido floral usado, ideal para o verao.");
        produto2.setCategoria(CategoriaProduto.VESTIDO);
        produto2.setCondicao(CondicaoProduto.USADO);
        produto2.setTamanho("P");
        produto2.setMaterial("Viscose");
        produto2.setValorVenda(new BigDecimal("49.90"));
        produto2.setQuantidadeEstoque(1);
        produto2.setImpactoAmbientalKgCo2(new BigDecimal("8.30"));
        produto2.setCodStatus(true);
        produtos.add(produto2);
    }

    // CREATE
    public Produto salvar(Produto produto) {
        produto.setId(gerarNovoId());
        produtos.add(produto);
        return produto;
    }

    // READ
    public List<Produto> listarTodos() {
        return produtos;
    }

    public Produto buscarPorId(Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

    // UPDATE
    public Produto atualizar(Long id, Produto produtoAtualizado) {
        Produto produto = buscarPorId(id);
        if (produto != null) {
            produto.setNome(produtoAtualizado.getNome());
            produto.setDescricao(produtoAtualizado.getDescricao());
            produto.setCategoria(produtoAtualizado.getCategoria());
            produto.setCondicao(produtoAtualizado.getCondicao());
            produto.setTamanho(produtoAtualizado.getTamanho());
            produto.setMaterial(produtoAtualizado.getMaterial());
            produto.setValorVenda(produtoAtualizado.getValorVenda());
            produto.setQuantidadeEstoque(produtoAtualizado.getQuantidadeEstoque());
            produto.setImpactoAmbientalKgCo2(produtoAtualizado.getImpactoAmbientalKgCo2());
            produto.setCodStatus(produtoAtualizado.isCodStatus());
        }
        return produto;
    }

    // DELETE
    public boolean excluir(Long id) {
        Produto produto = buscarPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            return true;
        }
        return false;
    }

    private static Long gerarNovoId() {
        return proximoId++;
    }
}
