package br.com.cz.gestaoProdutos.Interface;

import java.util.List;

public interface IFornecedor {
    void adicionarProduto(IProduto produto1);
    void exibirInfo();
    String getnome();
    String getcnpj ();


    List<IProduto> getprodutosFornecidos();
}
