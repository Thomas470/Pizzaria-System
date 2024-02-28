import java.util.ArrayList;

public class Pedido {
	private ArrayList <Pizza> pedidos;
	private Pessoa pessoa;
	private Double valorPedido;
	private ArrayList <Pessoa> clientes;
	
	public Double calcularValorTotalPedido() {
		valorPedido = 0.0;
		for(int i = 0; i < pedidos.size(); i++) {
			valorPedido += pedidos.get(i).getPreco();
		}
		System.out.println("Valor pedido: R$ " + valorPedido);
		return valorPedido;
	}
	public void mostrarDados(){
    	System.out.println("**********Cliente*********");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println("Nome: " + clientes.get(i).getNome());
            System.out.println("Telefone: " + clientes.get(i).getTelefone());
            System.out.println("Endereco: " + clientes.get(i).getEndereco());
        }
        System.out.println("**********Pedido**********");
        for(int i = 0; i < pedidos.size(); i++){
            System.out.println("Sabor: " + pedidos.get(i).getSabor());
            System.out.println("Preco: R$" + pedidos.get(i).getPreco());
            System.out.println("Tamanho: " + pedidos.get(i).getTamanho());
            System.out.println("-------------------------------");
        }
    }
	
	public void addPizza(Pizza p) {this.pedidos.add(p);
	}
	public void addCliente(Pessoa p) {this.clientes.add(p);
	}

	public Pedido(Pessoa pessoa) {
		this.pedidos = new ArrayList<Pizza>();
		this.pessoa = pessoa;
		this.clientes = new ArrayList<Pessoa>();;
	}

	public ArrayList<Pizza> getPedidos() {return pedidos;
	}

	public void setPedidos(ArrayList<Pizza> pedidos) {this.pedidos = pedidos;
	}

	public Pessoa getPessoa() {return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {this.pessoa = pessoa;
	}

	public Double getValorPedido() {return valorPedido;
	}

	public void setValorPedido(Double valorPedido) {this.valorPedido = valorPedido;
	}

	public ArrayList<Pessoa> getClientes() {return clientes;
	}

	public void setClientes(ArrayList<Pessoa> clientes) {this.clientes = clientes;
	}
	
	
	
	
}
