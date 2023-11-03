package br.com.cz.gestaoProdutos.Model;

import br.com.cz.gestaoProdutos.Interface.IEstoque;
import br.com.cz.gestaoProdutos.Interface.IProduto;

import java.util.ArrayList;
import java.util.List;

public class Estoque implements IEstoque {
    public List<IProduto> produtosEstoque;
    public Estoque() {
        produtosEstoque = new ArrayList<>();
    }
    public void verificarDisponibilidade() {
        System.out.println("Produtos em Estoque:");
        for (IProduto produto : produtosEstoque) {
            produto.exibirInfo();
        }
    }
    public void adicionarProduto(IProduto produto) {
        produtosEstoque.add(produto);
    }

    public void atualizarProduto(int id, String nome, String descricao, double preco, int quantidadeEstoque) {
        for (IProduto produto : produtosEstoque) {
            if (produto.getId() == id) {
                if (produto instanceof Produto) {
                    Produto produtoAtualizavel = (Produto) produto;
                    produtoAtualizavel.setnome(nome);
                    produtoAtualizavel.setdescricao(descricao);
                    produtoAtualizavel.setpreco(preco);
                    produtoAtualizavel.setQuantidadeEstoque(quantidadeEstoque);
                }
                break;
            }
        }
    }
    public void excluirProduto(int id) {
        for (IProduto produto : produtosEstoque) {
            if (produto.getId() == id) {
                produtosEstoque.remove(produto);
                break;
            }
        }
    }
    public void gerarRelatorio() {
        System.out.println("Relatório de Produtos em Estoque:");
        for (IProduto produto : produtosEstoque) {
            produto.exibirInfo();
        }
    }

    @Override
    public List<IProduto> getprodutosEstoque() {
        return null;
    }

    @Override
    public void adicionarProdutoAoEstoque(IProduto produto1) {

    }
}
