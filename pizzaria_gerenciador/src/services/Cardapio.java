package services;

import java.util.Scanner;

public class Cardapio {
     private String[] sabores = {
            "null",
            "Calabresa",
            "Mussarela",
            "Frango com Catupiry",
            "Portuguesa",
            "Marguerita",
            "Quatro Queijos",
            "Palmito",
            "Napolitana",
            "Baiana",
            "Brocolis com Bacon"
    };
     private  String[] tipoPizza = {
             "null",
             "Pizza pequena",
             "Pizza Média",
             "Pizza Grande",
             "P-Tamanho Familia"
     };
    public Atendimento att = new Atendimento();
    public void Exibir_Sabores() {
        for (int i = 1; i < sabores.length; i++) {
            System.out.println("(" + i + ")" + sabores[i]);
        }
    }
    public String pesquisaSabor(int codigoDoSabor ) { // consulta item com base no codigo fornecido
        String busca = sabores[codigoDoSabor];
        return busca;
}
    public void Tipo_de_Pizza(){
        for (int i= 1; i< tipoPizza.length;i++){
            System.out.println("("+i+") "+tipoPizza[i]);
        }
    }
    public void EscolhaDaPizza(int escolha){
        String busca2 = tipoPizza[escolha];
        return busca2;
    }
}

