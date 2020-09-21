package controller;

import model.Telefone;
import view.TelefoneView;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;

	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}

	public void updateTelefoneView() {
		view.imprimiTelefone(model.getDdd(), model.getNumero());
	}

	public String getTelefoneDDD() {
		return model.getDdd();
	}

	public void setTelefoneDDD(String ddd) {
		model.setDdd(ddd);
	}

	public String getTelefoneNumero() {
		return model.getNumero();
	}

	public void setTelefoneNumero(String numero) {
		model.setNumero(numero);
	}

}
