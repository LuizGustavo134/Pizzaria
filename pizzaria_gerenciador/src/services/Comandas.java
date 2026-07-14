package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class Comandas {
    public List<List<pedido>> comandaAtiva = new ArrayList<>();
    public List<cliente> TotalDeClientes= new ArrayList<>();
    public List<pedido> pedidosfeitos = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Atendimento att = new Atendimento();
    public Comandas() {
    }

}