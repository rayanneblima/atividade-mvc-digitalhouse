package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	private Produto model;
	private ProdutoView view;

	public void updateProdutoView() {
		view.imprimiProduto(model.getId_produto(), model.getNome(), model.getDescricao(), model.getEstoque(),
				model.getPreco());
	}

	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}

	public int getProdutoId() {
		return model.getId_produto();
	}

	public void setProdutoId(int id_produto) {
		model.setId_produto(id_produto);
	}

	public String getProdutoNome() {
		return model.getNome();
	}

	public void setProdutoNome(String nome) {
		model.setNome(nome);
	}

	public String getProdutoDescricao(String descricao) {
		return model.getDescricao();
	}

	public void setProdutoDescricao(String descricao) {
		model.setDescricao(descricao);
	}

	public int getProdutoEstoque(int estoque) {
		return model.getEstoque();
	}

	public void setProdutoEstoque(int estoque) {
		model.setEstoque(estoque);
	}

	public double getProdutoPreco() {
		return model.getPreco();
	}

	public void setProdutoPreco(double preco) {
		model.setPreco(preco);
	}

}
