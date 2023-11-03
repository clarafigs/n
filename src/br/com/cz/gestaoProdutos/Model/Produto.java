package br.com.cz.gestaoProdutos.Model;

import br.com.cz.gestaoProdutos.Interface.IProduto;

public class Produto implements IProduto {
    public int IdProduto;
    public String nome;
    public String descricao;
    public float preco;
    public int quantidadeEstoque;


    public Produto(int IdProduto, String nome, String descricao, float preco, int quantidadeEstoque){
        this.IdProduto = IdProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;

    }
    public void exibirInfo() {
        System.out.println("ID do Produto: " + getIdProduto());
        System.out.println("Nome: " + getnome());
        System.out.println("Descrição: " + getdescricao());
        System.out.println("Preço: " + getpreco());
        System.out.println("Quantidade em Estoque: " + getquantidadeEstoque());
    }
    @Override
    public int getIdProduto() {
        return 0;
    }

    @Override
    public String getnome() {
        return null;
    }

    @Override
    public String getdescricao() {
        return null;
    }

    @Override
    public float getpreco() {
        return 0;
    }

    @Override
    public int getquantidadeEstoque() {
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }

    public void setnome(String nome) {
    }

    public void setdescricao(String descricao) {
    }

    public void setpreco(double preco) {
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
    }
}
