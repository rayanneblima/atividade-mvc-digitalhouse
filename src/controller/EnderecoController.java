package controller;

import model.Endereco;
import view.EnderecoView;

public class EnderecoController {
	private Endereco model;
	private EnderecoView view;

	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}

	public void updateEnderecoView() {
		view.imprimiEndereco(model.getRua(), model.getNumero(), model.getBairro(), model.getCidade(), model.getEstado(),
				model.getCep());
	}

	public String getEnderecoRua() {
		return model.getRua();
	}

	public void setEnderecoRua(String rua) {
		model.setRua(rua);
	}

	public String getEnderecoNumero() {
		return model.getNumero();
	}

	public void setEnderecoNumero(String numero) {
		model.setNumero(numero);
	}

	public String getEnderecoBairro() {
		return model.getBairro();
	}

	public void setEnderecoBairro(String bairro) {
		model.setBairro(bairro);
	}

	public String getEnderecoCidade() {
		return model.getCidade();
	}

	public void setEnderecoCidade(String cidade) {
		model.setCidade(cidade);
	}

	public String getEnderecoEstado() {
		return model.getEstado();
	}

	public void setEnderecoEstado(String estado) {
		model.setEstado(estado);
	}

	public String getEnderecoCep() {
		return model.getCep();
	}

	public void setEnderecoCep(String cep) {
		model.setCep(cep);
	}

}
