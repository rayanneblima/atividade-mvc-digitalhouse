package view;

public class ProdutoView {

	public void imprimiProduto(int id_produto, String nome, String descricao, int estoque, double preco) {
		System.out.println("=============Produto=============");
		System.out.println("Id: " + id_produto);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Estoque: " + estoque);
		System.out.println("Preço: " + preco);
	}

}
