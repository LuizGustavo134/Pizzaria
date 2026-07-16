    package services;
    import java.util.Random;
    import java.util.Scanner;

    public class Atendimento {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        public Atendimento() {
        }
        /// /////////////////Coletando dados do cliente///////////////
        /*public void Att1Cliente(cliente novoCliente){
            System.out.println("nome: ");
            String nome = scan.nextLine();
            int id_cliente = random.nextInt(0,501);
            cliente clienteInfo = new cliente(nome,id_cliente);
        }*/

        public void Att2Cliente(){ //////Formulário da pizza///////
            String nome = "carlos";
            Cardapio card = new Cardapio();
            int id_cliente = random.nextInt(0,501);
            //////////////////////Tipo de pizza//////////////////////////////////////
            System.out.println("o que deseja: ");
            card.Tipo_de_Pizza();
            //////////////////////Escolha do Usuário 1///////////////////////////////
            String tamanho = " ";
            int escolha = scan.nextInt();
            card.EscolhaDaPizza(escolha);
            // atualizar o cardápio de tipo de pizza


            //////////////////////Escolha de Sabor///////////////////////////////////
            System.out.println("qual sabor você deseja: ");
            System.out.println("Até 4 sabores permitidos");
            card.Exibir_Sabores();

            String[] escolhaDoUsuário = new String[4]; // guarda o que o usuario pediu

            for (int i = 0; i < 4;i++) {
                System.out.println(i+1 +"° sabor:");
                int codigoDoSabor = scan.nextInt();// variavel enviada para cardapio
                scan.nextLine();

                escolhaDoUsuário[i] = card.pesquisaSabor(codigoDoSabor); // retorna o sabor por do codigo
            }
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
                        sabor4 = escolhaDoUsuário[i]; // coleta de sabores
                }
            }
            String endereco = " ";
            String entrega = " ";
            System.out.println("Deseja que o pedido seja entrgue? y/n");
            char res = scan.nextLine().charAt(0);
            scan.nextLine();
            if (res =='y'){
                String enderecos = scan.nextLine();
                entrega = "Entregue via Motoboy";
            }else{
                entrega = "Recolhido pelo cliente em loja";
            }
            /////////////////////Precificação////////////////////////////////////
            tabela_de_precos tabela = new tabela_de_precos();
            double preco = 0;
            int saborquantidade =0;
            do {
                for (int i = 0; i<escolhaDoUsuário.length; i++){
                    if (!(escolhaDoUsuário[i].isBlank())){ // verifica quantos sabores o usuário pediu
                        saborquantidade += 1;
                    }
                }

               // preco = tabela.precificando(saborquantidade);  tentativa de preco
            } while (preco == 0);

           ////////////////////////////////Finalização//////////////////////////////////////////////////
           /*
            === Vou concertar ao definir a classe de tabela de precos=====
            pedido pedidoInfo = new pedido(id_pedido,tamanho,preco,sabor1,sabor2,sabor3,sabor4);

            aqui vai ficar a criação do pedido

             */
            System.out.println(nome+" "+id_cliente+" "+tamanho+" "+" "+sabor1+" "+sabor2+" "+" "+sabor3+" "+sabor4+" \n"+endereco+" "+ entrega);
        }
    }
