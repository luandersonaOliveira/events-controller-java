package Containers;

import java.util.ArrayList;
import java.util.Scanner;

public class EventosContainer {
    public ArrayList<Evento> Eventos = new ArrayList<Evento>();

    public void adicionarEvento(Evento evento){
        Eventos.add(evento);
    }

    public void mostrarInfosEventos(){
        for (int i = 0; i < Eventos.size(); i++) {
            Eventos.get(i).eventoInfos(i);
        }
    }

    public void editarEvento(int ind){
        Scanner scanner = new Scanner(System.in);

        if (ind < 0 || ind >= Eventos.size()){
            System.out.println("Índice inválido. Tente novamente.");
            return;
        }

        Evento evento = Eventos.get(ind);

        // Exibir informações do evento atual
        System.out.println("Informações do evento selecionado:");
        evento.eventoInfos(ind);

        // Solicitar novas informações do evento
        System.out.println("\nDigite as novas informações do evento:");
        System.out.print("Nome: ");
        String novoNome = scanner.nextLine();
        System.out.print("Data: ");
        String novaData = scanner.nextLine();
        System.out.print("Valor: ");
        int novoValor = scanner.nextInt();
        System.out.print("Vagas: ");
        int novasVagas = scanner.nextInt();

        // Atualizar o evento com as novas informações
        evento.setNome(novoNome);
        evento.setData(novaData);
        evento.setValor(novasVagas);
        evento.setValor(novoValor);

        System.out.println("\nEvento "+evento.getNome()+" atualizado com sucesso!");
    }

    public void excluirEvento(int ind) {
        if (ind < 0 || ind >= Eventos.size()) {
            System.out.println("Índice inválido. Tente novamente.");
            return;
        }
        Evento evento = Eventos.get(ind);
        evento.eventoInfos(ind);
        Eventos.remove(ind);
        System.out.println("\nEvento " + evento.getNome() + " deletado com sucesso!");
    }
}