package application;
import java.util.Scanner;

import services.Atendimento;
import services.Comandas;
import services.Comandas.*;
// Nesta classe fica apenas o fluxo do programa
public class Main {
    public static void main(String[]args){
        Comandas com2 = new Comandas();
        Atendimento att = new Atendimento();
        System.out.println("bem-vindo a pizzaria ! ");
        System.out.println("o que deseja fazer: ");
        System.out.println("(1)Fazer pedidos (2) consultar comanda (3) alterar pedido (4) sair");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.nextLine();
        if (x == 1){
            att.Att2Cliente();
        } else if (x == 2) {

        }

        scan.close();
    }
}
