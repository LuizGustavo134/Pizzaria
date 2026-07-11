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
    public Atendimento att = new Atendimento();
    public void Exibir_Sabores() {
        for (int i = 1; i < sabores.length; i++) {
            System.out.println("(" + i + ")" + sabores[i]);
        }
    }
    public String pesquisaSabor(int codigoDoSabor ) {
        String busca = sabores[codigoDoSabor];
        return busca;
}}

