package Containers;

import Entities.User;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private int limiteVagas = 1000;
    private int valor;
    private String data;

    // CONTAINERS

    ArrayList<User> participantes = new ArrayList<User>();

    // CONSTRUTOR

    public Evento(String nome, int vagas, int valor, String data) {
        this.setNome(nome);
        this.setLimiteVagas(vagas);
        this.setValor(valor);
        this.setData(data);
    }

    // SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLimiteVagas(int limiteVagas) {
        this.limiteVagas = limiteVagas;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setData(String data) {
        this.data = data;
    }

    // GETTERS

    public String getNome() {
        return nome;
    }

    private int getLimiteVagas() {
        return limiteVagas;
    }

    private int getValor() {
        return valor;
    }

    private String getData() {
        return data;
    }

    // MÉTODOS

    public void eventoInfos(int indexEvento) {
        System.out.println("Evento " + indexEvento + ":");
        System.out.print("| Evento: " + this.getNome() + " | ");
        System.out.print("Data: " + this.getData() + " | ");
        System.out.print("Vagas: " + this.getLimiteVagas() + " | ");
        System.out.print("Valor: " + this.getValor() + " |\n");
        System.out.println("-------------------------------------------------------------------------");
    }
    // CADASTRAR USER NO EVENTO

    public void cadastrarUser(User user, Evento eventoIndice) {
        participantes.add(user); // POSSÍVEL ERRO
    }

    public void listarParticipantes() {

    }

    public void listarParticipante() {
        
    }
}
