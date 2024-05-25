package Containers;

import Entities.User;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private ArrayList<User> participantes = new ArrayList<User>();
    private static List<Integer> vagaArraysList = new ArrayList<>();

    // ATRIBUTOS

    private String nome;
    private int limiteVagas;
    private int valor;
    private String data;

    // CONSTRUCTOR

    public Evento() {
        this.limiteVagas = 99;
    }

    // MÉTODOS

    public void adicionarUser(User user) {
        participantes.add(user);
    }

    public void checarEventos() {
        vagaArraysList.add(limiteVagas);
        for (Integer numeroVaga : vagaArraysList) {
            if (participantes.isEmpty()) { // Verifica se participantes esta vazio(True)
                System.out.println("Participantes vazio");
                System.out.println("Limite de vagas: " + this.getLimiteVagas());
                System.out.println("Tamanho da lista de participantes: " + participantes.size());
                // Verifica o tamanho da lista
                break;
            } else if (this.getLimiteVagas() <= 0) { // Verifica se o limiteVagas for igual e menor do que 0
                System.out.println("Limite máximo atingido");
                break;
            } else { // O limiteVagas vai reduzindo
                this.setLimiteVagas(this.getLimiteVagas() - 1);
                System.out.println("Vaga preenchida. Restam " + this.getLimiteVagas() + " vagas.");
                participantes.clear();
                break;
            }
        }
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

    public int getLimiteVagas() {
        return limiteVagas;
    }

    public int getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }
}
