package Entities;

import java.util.Random;

public class User extends Pessoa{

    Random idRandom = new Random();
    int identidade = idRandom.nextInt(999);

    // ATRIBUTOS

    private int saldo;
    private boolean temBebida;
    private boolean temArma;


    // CONSTRUCTOR

    public User(String nome, int idade, String genero, int saldo){
        this.setId(identidade);
        this.setIsAdm("Não");
        this.setNome(nome);
        this.setIdade(idade);
        this.setGenero(genero);
        this.setSaldo(saldo);
        this.setTemArma();
    }

    // MÉTODOS

    public void status(int indice) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Usuário "+indice+"\n");
        System.out.print("| Nome: " + this.getNome());
        System.out.print(" | Idade: " + this.getIdade());
        System.out.print(" | Genero: "+this.getGenero());
        System.out.print(" | Saldo: "+this.getSaldo());
        System.out.print(" | Tem arma: "+(this.getTemArma()?"Sim":"Não"));
        System.out.print(" | Tem bebida: "+(this.getTemBebida()?"Sim |":"Não |"));
        System.out.println("\n-------------------------------------------------------------------------------");
    }

    // SETTERS


    public int setSaldo(int saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public void setTemArma(){
        if(identidade<499){
            this.temBebida = false;
            this.temArma = false;
        }
        else{
            this.temBebida = true;
            this.temArma = true;
        }
    }

    // GETTERS

    public boolean getTemBebida() {
        return this.temBebida;
    }
    public boolean getTemArma() {
        return this.temArma;
    }
    public int getSaldo() { return this.saldo; }
}
