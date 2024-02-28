import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu(); 
        Pedido pedido = new Pedido(null);
        do {
        	
            System.out.println("***********Menu***********"); System.out.println("1 - Cadastrar um Pedido");System.out.println("2 - Adicionar Pizza");System.out.println("3 - Calcular Valor total do Pedido");System.out.println("4 - Mostrar dados");System.out.println("5 - Sair");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                 pedido = menu.cadastrarCliente();
                break;
                case 2:
                Pizza pizza = menu.adicionarPizza();
                pedido.addPizza(pizza);
                break;
                case 3:
                pedido.calcularValorTotalPedido();
                break;
                case 4:
                pedido.mostrarDados();
                pedido.calcularValorTotalPedido();	
                    break;
                default:
                 System.out.println("Obrigado e volte sempre!!");
                    break;
            }
        } while (opcao != 5);
        scanner.close();
    }
}	
