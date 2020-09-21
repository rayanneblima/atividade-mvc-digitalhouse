package main;

import controller.ClienteController;
import controller.EnderecoController;
import controller.PedidoController;
import controller.ProdutoController;
import controller.TelefoneController;
import model.Cliente;
import model.Endereco;
import model.Pedido;
import model.Produto;
import model.Telefone;
import view.ClienteView;
import view.EnderecoView;
import view.PedidoView;
import view.ProdutoView;
import view.TelefoneView;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		Telefone telefone = new Telefone();
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Pedido pedido = new Pedido();

		ClienteView clienteView = new ClienteView();
		EnderecoView enderecoView = new EnderecoView();
		TelefoneView telefoneView = new TelefoneView();
		ProdutoView produtoView1 = new ProdutoView();
		ProdutoView produtoView2 = new ProdutoView();
		PedidoView pedidoView = new PedidoView();

		ClienteController cli = new ClienteController(cliente, clienteView);
		EnderecoController end = new EnderecoController(endereco, enderecoView);
		TelefoneController tel = new TelefoneController(telefone, telefoneView);
		ProdutoController prod1 = new ProdutoController(produto1, produtoView1);
		ProdutoController prod2 = new ProdutoController(produto2, produtoView2);
		PedidoController ped = new PedidoController(pedido, pedidoView);

		cli.setClienteId(1);
		cli.setClienteNome("Fulano de Tal");
		cli.setClienteCpf("328.213.49-65");
		cli.setClienteEmail("fulano@gmail.com");
		cli.setClienteDataNascimento("08-02-1687");
		end.setEnderecoRua("Rua Tal");
		end.setEnderecoNumero("2");
		end.setEnderecoBairro("Bairro");
		end.setEnderecoCidade("Cidade");
		end.setEnderecoEstado("Estado");
		end.setEnderecoCep("123456");
		tel.setTelefoneDDD("11");
		tel.setTelefoneNumero("5236-4541");

		prod1.setProdutoId(1);
		prod1.setProdutoNome("1969 Harley Davidson Ultimate Chopper");
		prod1.setProdutoDescricao(
				"This replica features working kickstand, front suspension, gear-shift lever, footbrake lever, drive chain, wheels and steering. All parts are particularly delicate due to their precise scale and require special care and attention.");
		prod1.setProdutoEstoque(33);
		prod1.setProdutoPreco(22891.00);
		prod2.setProdutoId(2);
		prod2.setProdutoNome("1952 Alpine Renault 1300");
		prod2.setProdutoDescricao(
				"Turnable front wheels; steering function; detailed interior; detailed engine; opening hood; opening trunk; opening doors; and detailed chassis.");
		prod2.setProdutoEstoque(73);
		prod2.setProdutoPreco(21430.00);

		ped.setPedidoId(2020000001);
		ped.setPedidoDataSolicitacao("20-09-2020");
		ped.setPedidoValorTotal(22891.00);
		ped.setPedidoStatus("Concluído");

		cli.updateClienteView();
		end.updateEnderecoView();
		tel.updateTelefoneView();
		prod1.updateProdutoView();
		prod2.updateProdutoView();
		ped.updatePedidoView();

	}

}
