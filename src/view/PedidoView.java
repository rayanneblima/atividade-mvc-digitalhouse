package view;

public class PedidoView {
	public void imprimiPedido(int nfe, String data_solicitacao, double valor_total, String status) {
		System.out.println("=============Pedido=============");
		System.out.println("Nota Fiscal: " + nfe);
		System.out.println("Data solicitação: " + data_solicitacao);
		System.out.println("Valor total: " + valor_total);
		System.out.println("Status: " + status);
	}

}
