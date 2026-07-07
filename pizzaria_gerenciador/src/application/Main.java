package application;
import java.util.Scanner;
// Nesta classe fica apenas o fluxo do programa
public class Main {
    public static void main(String[]args){
        System.out.println("bem-vindo a pizzaria ! ");
        System.out.println("o que deseja fazer: ");
        System.out.println("(1)Fazer pedidos (2) consultar comanda (3) alterar pedido (4) sair");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.nextLine();
        if (x == 1){
            System.out.println("helo");
        }

        scan.close();
    }
}
