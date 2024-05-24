package Entities;

import Containers.Evento;

public class Ingresso {
    private Evento evento;
    private double preço;
    private String dataCompra;

    // CONSTRUCTOR
    public Ingresso(Evento evento, double preço, String dataCompra) {
        this.evento = evento;
        this.preço = preço;
        this.dataCompra = dataCompra;
    }

    // MÉTODOS

    public void comprarIngresso(Evento evnto){

    }

    public void comprarIngresso(Ingresso ingresso){

    }

    // SETTERS

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    // GETTERS

    public Evento getEvento() {
        return evento;
    }

    public double getPreço() {
        return preço;
    }

    public String getDataCompra() {
        return dataCompra;
    }

}
