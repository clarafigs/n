package br.com.cz.gestaoProdutos.Interface;

import java.util.List;

public interface IEstoque {
    void verificarDisponibilidade();
    void adicionarProduto(IProduto produto);
    void atualizarProduto(int IdProduto, String nome, String descricao, double preco, int quantidadeEstoque);
    void excluirProduto(int IdProduto);
    void gerarRelatorio();
    List<IProduto> getprodutosEstoque();

    void adicionarProdutoAoEstoque(IProduto produto1);
}
