import java.util.Scanner;

public class Menu {
    public Pedido cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.next();

        System.out.println("Telefone: ");
        String telefone = scanner.next();

        System.out.println("Endereço: ");
        String endereco = scanner.next();

        Pessoa cliente = new Pessoa(nome, telefone, endereco);

        Pedido pedido = new Pedido(cliente);
        pedido.addCliente(cliente);

        return pedido;
    }
    public Pizza adicionarPizza(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o sabor:");
        String sabor = scanner.nextLine();

        System.out.println("Digite o tamanho:");
        String tamanho = scanner.nextLine();

        System.out.println("Digite o preco:");
        String preco = scanner.nextLine();

        Double preco2 = Double.parseDouble(preco);

        Pizza pizza = new Pizza(tamanho, preco2, sabor);

        return pizza;
    }
}