package controller;

import model.Pedido;
import view.PedidoView;

public class PedidoController {
	private Pedido model;
	private PedidoView view;

	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}

	public void updatePedidoView() {
		view.imprimiPedido(model.getNfe_pedido(), model.getData_solicitacao(), model.getValor_total(),
				model.getStatus());
	}

	public int getPedidoId() {
		return model.getNfe_pedido();
	}

	public void setPedidoId(int nfe) {
		model.setNfe_pedido(nfe);
	}

	public String getPedidoDataSolicitacao() {
		return model.getData_solicitacao();
	}

	public void setPedidoDataSolicitacao(String data_solicitacao) {
		model.setData_solicitacao(data_solicitacao);
	}

	public double getPedidoValor_total() {
		return model.getValor_total();
	}

	public void setPedidoValorTotal(double valor_total) {
		model.setValor_total(valor_total);
	}

	public String getPedidoStatus() {
		return model.getStatus();
	}

	public void setPedidoStatus(String status) {
		model.setStatus(status);
	}

}
