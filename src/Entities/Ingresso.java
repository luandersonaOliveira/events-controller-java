package Entities;

import Containers.Evento;

public class Ingresso extends Evento{

    public Ingresso(String nome, int vagas, int valor, String data, int idadeMin) {
        super(nome, vagas, valor, data, idadeMin);
        
    }

    // CONSTRUCTOR
    
    // SETTERS

    // GETTERS

    // MÉTODOS

    private void status(String nome, int vagas){

        System.out.println("Nome: " + nome);
        System.out.println("Vagas: " + vagas);

    }

    private void status(int valor, String data, int idadeMin){
        status("São joão", 1000);
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Idade minima: " + idadeMin);
    }

    public void status(){
        status(10, "25/06", 12);
        System.out.println("Este ingresso é invalido...");
    }
}
