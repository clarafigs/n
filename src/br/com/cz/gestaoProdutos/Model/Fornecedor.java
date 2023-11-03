package br.com.cz.gestaoProdutos.Model;

import br.com.cz.gestaoProdutos.Interface.IFornecedor;
import br.com.cz.gestaoProdutos.Interface.IProduto;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor implements IFornecedor {
    public String nome;
    public String cnpj;
    public List<IProduto>produtosFornecidos;

    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.produtosFornecidos =  new ArrayList<>();
    }
    public void exibirInfo() {
        System.out.println("Nome do Fornecedor: " + getnome());
        System.out.println("CNPJ: " + getcnpj());
        System.out.println("Produtos Fornecidos:");
        for (IProduto produto : produtosFornecidos) {
            produto.exibirInfo();
        }
    }
    public void adicionarProduto(IProduto produto) {
        produtosFornecidos.add(produto);
    }

    public List<IProduto> getprodutosFornecidos() {
        return produtosFornecidos;
    }

    @Override
    public String getnome() {
        return null;
    }

    @Override
    public String getcnpj() {
        return null;
    }

}
