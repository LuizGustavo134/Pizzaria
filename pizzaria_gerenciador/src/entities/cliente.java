package entities;

import services.Atendimento;
import services.Comandas;

public class cliente {
    public String nome;
    private int id_cliente;
    Comandas com1 = new Comandas();
    Atendimento att = new Atendimento();

    public cliente(){}
    public cliente(String nome, int id_cliente) {
        this.nome = nome;
        this.id_cliente = id_cliente;
    }
}
