    package services;
    import entities.*;

    import java.util.Scanner;

    public class Atendimento {
        public void AttCliente(){
            Scanner scan = new Scanner(System.in);
            Cardapio card = new Cardapio();
            System.out.println("nome: ");
            String nome = scan.nextLine();

            System.out.println("o que deseja: ");
            String tamanho = " ";
            String tipoPizza[] = {"null","Pizza pequena","Pizza Média","Pizza Grande","P-Tamanho Familia"};
            for (int i = 1 ; i<5 ;i++){
                System.out.println("("+i+")"+tipoPizza[i]);
            }
            int escolha = scan.nextInt();
            tamanho = tipoPizza[escolha];

            System.out.println("qual sabor você deseja: ");
            System.out.println("Até 4 sabores permitidos");
            card.Exibir_Sabores();

            String sabor1 = " ";
            String sabor2 = " ";
            String sabor3 = " ";
            String sabor4 = " ";
            String escolhasDoUsuário[] = new String[4];
            int numeroDoSabor[] = new int[4];
            for (int i = 0; i < 4;i++){
                numeroDoSabor[i] = scan.nextInt(); // coleta o dado
                card.pesquisaSabor(numeroDoSabor[i]);// consulta

                escolhasDoUsuário[i] = card.pesquisaSabor(numeroDoSabor[i]  ); // guarda os resultados
                scan.nextLine();
            }
            sabor1 = escolhasDoUsuário[0];
            sabor2 = escolhasDoUsuário[1];
            sabor3 = escolhasDoUsuário[2];
            sabor4 = escolhasDoUsuário[3];

            System.out.println("Deseja que o pedido seja entrgue? y/n");
            char res = scan.nextLine().charAt(0);

            String endereco = " ";
            String destinoFinal = " ";
            if (res =='y'){
                String enderecos = scan.nextLine();
                endereco = enderecos;
                destinoFinal = "Entregue via Motoboy";
            }else{
                destinoFinal = "Recolhido pelo cliente em loja";
            }
            System.out.println(nome+" \n"+tamanho+" \n"+ sabor1+" \n"+ sabor2+" \n"+sabor3+" \n"+sabor4+" \n"+endereco
            +" \n"+destinoFinal+" \n");





        }
    }
