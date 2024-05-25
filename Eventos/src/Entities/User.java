package Entities;

import java.util.Random;

public class User extends Pessoa {

    Random idRandom = new Random();
    int identidade = idRandom.nextInt(999);

    // ATRIBUTOS

    private float saldo;
    private boolean temBebida;
    private boolean temArma;

    // CONSTRUCTOR

    public User(String nome, int idade, String genero, float saldo) {
        this.setId(identidade);
        this.setIsAdm("Não");
        this.setNome(nome);
        this.setIdade(idade);
        this.setGenero(genero);
        this.setSaldo(saldo);
        this.setTemArma();
    }

    // MÉTODOS

    public void status() {
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Tem arma: " + this.getTemArma());
        System.out.println("Tem bebida: " + this.getTemBebida());
        System.out.println("====================================");
    }

    // SETTERS

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTemBebida(String temBebida) {
        if (temBebida.equals("Sim")) {
            this.temBebida = true;
        } else if (temBebida.equals("Não")) {
            this.temBebida = false;
        } else {
            System.out.println("Inválido");
        }
    }

    public void setTemArma() {
        if (identidade < 499) {
            this.temBebida = false;
            this.temArma = false;
        } else {
            this.temBebida = true;
            this.temArma = true;
        }
    }

    // GETTERS

    public float getSaldo(){
        return saldo;
    }

    public boolean getTemBebida() {
        return temBebida;
    }

    public boolean getTemArma() {
        return temArma;
    }
}
