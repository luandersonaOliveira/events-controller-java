package Entities;

abstract class Pessoa {
    private int id;
    private boolean isAdm;
    private String nome;
    private int idade;
    private String genero;

    // SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setIsAdm(String isAdm) {
        if (isAdm.equals("Sim")) {
            this.isAdm = true;
        } else if (isAdm.equals("Não")) {
            this.isAdm = false;
        } else {
            System.out.println("Iválido");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // GETTERS

    public int getId() {
        return id;
    }

    public boolean isAdm() {
        return isAdm;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }
}