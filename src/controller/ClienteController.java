package controller;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	private Cliente model;
	private ClienteView view;

	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}

	public void updateClienteView() {
		view.imprimiCliente(model.getId(), model.getNome(), model.getCpf(), model.getEmail(),
				model.getData_nascimento());
	}

	public int getClienteId() {
		return model.getId();
	}

	public void setClienteId(int id_cliente) {
		model.setId(id_cliente);
	}

	public String getClienteNome() {
		return model.getNome();
	}

	public void setClienteNome(String nome) {
		model.setNome(nome);
	}

	public String getClienteCpf() {
		return model.getCpf();
	}

	public void setClienteCpf(String cpf) {
		model.setCpf(cpf);
	}

	public String getClienteEmail() {
		return model.getEmail();
	}

	public void setClienteEmail(String email) {
		model.setEmail(email);
	}

	public String getClienteData_Nascimento() {
		return model.getData_nascimento();
	}

	public void setClienteDataNascimento(String data_nascimento) {
		model.setData_nascimento(data_nascimento);
	}

}
