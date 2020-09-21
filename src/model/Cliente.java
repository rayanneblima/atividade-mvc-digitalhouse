package model;

public class Cliente {
	private int id_cliente;
	private String nome;
	private String cpf;
	private String email;
	private String data_nascimento;

	public int getId() {
		return id_cliente;
	}

	public void setId(int id) {
		this.id_cliente = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

}
