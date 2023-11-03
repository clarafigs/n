package br.com.cz.gestaoProdutos.Interface;

public interface IProduto {
    void exibirInfo();
    int getIdProduto();
    String getnome();
    String getdescricao();
    float getpreco();
    int getquantidadeEstoque();

    int getId();
}
