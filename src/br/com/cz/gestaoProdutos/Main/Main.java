package br.com.cz.gestaoProdutos.Main;

import br.com.cz.gestaoProdutos.Exception.ProdutoNaoEncontrado;
import br.com.cz.gestaoProdutos.Interface.IEstoque;
import br.com.cz.gestaoProdutos.Interface.IFornecedor;
import br.com.cz.gestaoProdutos.Interface.IProduto;
import br.com.cz.gestaoProdutos.Model.Estoque;
import br.com.cz.gestaoProdutos.Model.Fornecedor;
import br.com.cz.gestaoProdutos.Model.Produto;

public class Main {
    public static void main(String[] args) {
        IEstoque estoque = new Estoque();
        GestorProdutos gestor = new GestorProdutos(estoque);

        IFornecedor fornecedor1 = new Fornecedor("Fornecedor A", "1234567890");
        IFornecedor fornecedor2 = new Fornecedor("Fornecedor B", "0987654321");

        IProduto produto1 = new Produto(1, "Produto 1", "Descrição do Produto 1", 10.0f, 50);
        IProduto produto2 = new Produto(2, "Produto 2", "Descrição do Produto 2", 15.0f, 30);

        fornecedor1.adicionarProduto(produto1);
        fornecedor2.adicionarProduto(produto2);

        gestor.cadastrarFornecedor(fornecedor1);
        gestor.cadastrarFornecedor(fornecedor2);

        try {
            IProduto produtoEncontrado = gestor.buscarProdutoPorNome("Produto 3");
            if (produtoEncontrado != null) {
                gestor.exibirInfoProduto(produtoEncontrado);
            } else {
                throw new ProdutoNaoEncontrado("Produto não encontrado.");
            }
        } catch (ProdutoNaoEncontrado e) {
            System.out.println("Erro: " + e.getMessage());
        }  catch (NullPointerException e) {
            System.out.println("Erro: Produto não encontrado (NullPointerException)");
        }

        estoque.adicionarProdutoAoEstoque((IProduto) produto1);
        estoque.adicionarProdutoAoEstoque((IProduto) produto2);
        gestor.gerarRelatorioDeEstoque();

    }
}