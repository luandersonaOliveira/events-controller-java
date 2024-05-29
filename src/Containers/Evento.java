package Containers;

import Entities.User;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private int limiteVagas;
    private int valor;
    private String data;
    private int idadeMinima;
    private ArrayList<User> participantes;

    // CONSTRUTOR

    public Evento (String nome, int vagas, int valor, String data, int idadeMin) {
        this.setNome(nome);
        this.setLimiteVagas(vagas);
        this.setValor(valor);
        this.setData(data);
        this.setIdadeMinima(idadeMin);
        this.participantes = new ArrayList<>(this.limiteVagas);
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
    public void setIdadeMinima(int idadeMin){
        this.idadeMinima = idadeMin;
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
    private int getIdadeMinima(){
        return idadeMinima;
    }

    // MÉTODOS

    public void eventoInfos(int indexEvento){
        System.out.println("Evento "+indexEvento+": ");
        System.out.print("| Evento: "+this.getNome()+" | ");
        System.out.print("Data: "+this.getData()+" | ");
        System.out.print("Vagas: "+this.getLimiteVagas()+" | ");
        System.out.print("Valor: "+this.getValor()+" | ");
        System.out.print("Idade Mínima: "+this.getIdadeMinima()+" |\n");
        System.out.println("-------------------------------------------------------------------------");
    }

    public void listarParticipantes(Evento evento){
        for(int i = 0; i < evento.participantes.size(); i++){
            participantes.get(i).status(i);
        }
    }

    // CADASTRAR USER NO EVENTO
    public void cadastrarUser(User user, Evento evento, int userIndice){
        if(evento.getLimiteVagas()>0){
            if(evento.participantes.contains(user)){
                System.out.println(user.getNome()+" já está cadastrado em "+evento.getNome());
            }else{
                if(evento.getValor()<user.getSaldo()){
                    if(!user.getTemArma()||!user.getTemBebida()){
                        if(user.getIdade()>=evento.getIdadeMinima()){
                            evento.participantes.add(user);
                            System.out.println("-----------------------------------------------");
                            System.out.println(user.getNome()+" foi cadastrado em "+evento.getNome());
                            evento.setLimiteVagas(evento.getLimiteVagas()-1);
                            user.setSaldo(user.getSaldo()-evento.getValor());
                            System.out.println("Foi descontado "+evento.getValor()+" do saldo de "+user.getNome());
                            System.out.println("Inforações de "+user.getNome()+" atualizadas:");
                            user.status(userIndice);
                        }else{
                            System.out.println("Infelizmente "+user.getNome()+" não tem idade para entrar neste evento, que é de no mínimo: "+evento.getIdadeMinima());
                        }
                    }else{
                        System.out.println("Aparentemente "+user.getNome()+" tem armas ou bebidas, e não poderá entrar.");
                    }
                }else{
                    System.out.println("Infelizmente "+user.getNome()+" não possui saldo suficiente.");
                }
            }
        }else{
            System.out.println("Infelizmente "+evento.getNome()+" está cheio.");
        }
    }
}
