    package services;
    import entities.*;

    import java.util.Scanner;

    public class Atendimento {
        public Atendimento() {
        }

        public void AttCliente(){
            //////////////////////Formulário de cadastro//////////////////////////////
            Scanner scan = new Scanner(System.in);
            Cardapio card = new Cardapio();

            System.out.println("nome: ");
            String nome = scan.nextLine();

            //////////////////////Tipo de pizza//////////////////////////////////////
            System.out.println("o que deseja: ");
            String tamanho = " ";
            String tipoPizza[] = {"null","Pizza pequena","Pizza Média","Pizza Grande","P-Tamanho Familia"};
            for (int i = 1 ; i<5 ;i++){ // menu de tamanho da pizza
                System.out.println("("+i+")"+tipoPizza[i]);
            }
            //////////////////////Escolha do Usuário 1///////////////////////////////
            int escolha = scan.nextInt();
            tamanho = tipoPizza[escolha];

            //////////////////////Escolha de Sabor///////////////////////////////////
            System.out.println("qual sabor você deseja: ");
            System.out.println("Até 4 sabores permitidos");
            card.Exibir_Sabores();

            String[] escolhaDoUsuário = new String[4]; // guarda o que o usuario pediu

            for (int i = 0; i < 4;i++) {
                System.out.println("sabor" + i + "° :");
                int codigoDoSabor = scan.nextInt();
                scan.nextLine();

                escolhaDoUsuário[i] = card.pesquisaSabor(codigoDoSabor);
            }// Pesquisa a escolha do usuario
            String sabor1=" ",sabor2=" ",sabor3=" ",sabor4= "";

            for (int i = 0 ; i< escolhaDoUsuário.length; i++){
                switch (i){
                    case 1:
                        sabor1 = escolhaDoUsuário[i];
                    case 2:
                        sabor2 = escolhaDoUsuário[i];
                    case 3:
                        sabor3 = escolhaDoUsuário[i];
                    case 4:
                        sabor4 = escolhaDoUsuário[i];
                }
            }

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
            ;




        }
    }
