package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class Comandas {
    public List<List<cliente>> comandaAtiva = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Atendimento att = new Atendimento();
    public Comandas() {
    }

    public Comandas(List<List<cliente>> comandaAtiva) {
        this.comandaAtiva = comandaAtiva;
    }
}