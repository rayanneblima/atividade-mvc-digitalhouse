package model;

public class Pedido {
	private int nfe;
	private String data_solicitacao;
	private double valor_total;
	private String status;

	public int getNfe_pedido() {
		return nfe;
	}

	public void setNfe_pedido(int nfe) {
		this.nfe = nfe;
	}

	public String getData_solicitacao() {
		return data_solicitacao;
	}

	public void setData_solicitacao(String data_solicitacao) {
		this.data_solicitacao = data_solicitacao;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
