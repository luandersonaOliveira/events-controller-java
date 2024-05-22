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
    ArrayList<Evento> evento = new ArrayList<>();

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
        evento.add(eventoIndice);
    }

    public void listarParticipantes() {

        if (participantes.isEmpty()) {
            System.out.println("\nParticipantes vazio");
            System.out.println("Limite de vagas: " + this.getLimiteVagas());
            System.out.println("Tamanho da lista de participantes: " + participantes.size());
            System.out.println("evento.size()" + evento.size());
            System.out.println("evento.isEmpty()" + evento.isEmpty());
        } else if (this.getLimiteVagas() <= evento.size()) {
            System.out.println("this.getLimiteVagas()" + this.getLimiteVagas());
            System.out.println("evento.size()" + evento.size());
            System.out.println("Limite máximo atingido");
        } else {
            this.setLimiteVagas(getLimiteVagas() - 1);
            System.out.println("Vaga preenchida. Restam " + getLimiteVagas() + " vagas.");
        }
        /*
         * System.out.println(participantes.size()); // NÃO MOSTRA OS PARTICIPANTES, SÓ
         * FINALIZA O CÓDIGO
         * return;
         */
    }

    public void listarParticipante() {
        evento.get(limiteVagas);
        if (participantes.isEmpty()) { // Verifica se participantes esta vazio(True)
            System.out.println("Participantes vazio");
            System.out.println("Limite de vagas: " + this.getLimiteVagas());
            System.out.println("Tamanho da lista de participantes: " + participantes.size());
            // Verifica o tamanho da lista

        } else if (this.getLimiteVagas() <= evento.size()) { // Verifica se o limiteVagas for igual e menor do que 0
            System.out.println("Limite máximo atingido");

        } else { // O limiteVagas vai reduzindo
            this.setLimiteVagas(getLimiteVagas() - 1);
            System.out.println("Vaga preenchida. Restam " + getLimiteVagas() + " vagas.");
        }
    }
}
