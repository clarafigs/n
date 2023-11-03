package br.com.cz.gestaoProdutos.Main;

import br.com.cz.gestaoProdutos.Interface.IEstoque;
import br.com.cz.gestaoProdutos.Interface.IFornecedor;
import br.com.cz.gestaoProdutos.Interface.IProduto;
import br.com.cz.gestaoProdutos.Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class GestorProdutos {
    private List<IFornecedor> fornecedores;
    private IEstoque estoque;

    public GestorProdutos(IEstoque estoque) {
        fornecedores = new ArrayList<>();
        this.estoque = estoque;
    }

    public void cadastrarFornecedor(IFornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public IProduto buscarProdutoPorNome(String nome) {
        for (IFornecedor fornecedor : fornecedores) {
            for (IProduto produto : fornecedor.getprodutosFornecidos()) {
                if (produto.getnome().equalsIgnoreCase(nome)) {
                    return produto;
                }
            }
        }
        return null;
    }

    public IProduto buscarProdutoPorID(int id) {
        for (IFornecedor fornecedor : fornecedores) {
            for (IProduto produto : fornecedor.getprodutosFornecidos()) {
                if (produto.getId() == id) {
                    return produto;
                }
            }
        }
        return null;
    }

    public void exibirInfoFornecedor(IFornecedor fornecedor) {
        fornecedor.exibirInfo();
    }

    public void exibirInfoProduto(IProduto produto) {
        produto.exibirInfo();
    }

    public void verificarDisponibilidade() {
        estoque.verificarDisponibilidade();
    }

    public void adicionarProdutoAoEstoque(IProduto produto) {
        estoque.adicionarProduto(produto);
    }

    public void atualizarProdutoNoEstoque(int id, String nome, String descricao, double preco, int quantidadeEmEstoque) {
        estoque.atualizarProduto(id, nome, descricao, preco, quantidadeEmEstoque);
    }

    public void excluirProdutoDoEstoque(int id) {
        estoque.excluirProduto(id);
    }

    public void gerarRelatorioDeEstoque() {
        estoque.gerarRelatorio();
    }
}
