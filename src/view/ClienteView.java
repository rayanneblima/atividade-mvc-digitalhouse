package view;

public class ClienteView {

	public void imprimiCliente(int id_cliente, String nome, String cpf, String email, String data_nascimento) {
		System.out.println("=============Cliente=============");
		System.out.println("Id: " + id_cliente);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Email: " + email);
		System.out.println("Data Nascimento: " + data_nascimento);
	}

}
