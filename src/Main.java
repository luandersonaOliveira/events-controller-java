import Containers.Evento;
import Containers.EventosContainer;
import Containers.UsuariosContainer;
import Entities.User;
import jdk.jfr.Event;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean sair = false;

    //CONTAINERS

    private static final Evento eventolist = new Evento("", 0, 0, "");
    private static final EventosContainer eventosList = new EventosContainer();
    private static final UsuariosContainer usuarios = new UsuariosContainer();

    public static void main(String[] args) {
        do {
            menuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    criarEvento();
                    break;
                case 2:
                    checarEventos();
                    break;
                case 3:
                    editarEvento();
                    break;
                case 4:
                    cadastrarUser();
                    break;
                case 5:
                    checarUsers();
                    break;
                case 6:
                    editarUser();
                    break;
                case 7:
                    // CRIAR FUNÇÃO PARA CADASTRAR USUÁRIO EM UM EVENTO
                    break;
                case 8:
                    // CRIAR FUNÇÃO PARA DELETAR EVENTOU OU USUÁRIO
                case 0:
                    sair = true;
            }
        } while (!sair);
    }

    public static void menuPrincipal() {
        System.out.println("==========================");
        System.out.println("SELECIONE SUA OPÇÃO");
        System.out.println("1 para criar evento");
        System.out.println("2 para checar eventos");
        System.out.println("3 para editar um evento");
        System.out.println("4 para cadastrar usuário");
        System.out.println("5 para ver usuarios cadastrados");
        System.out.println("6 para editar um usuário");
        System.out.println("7 para cadastrar usuário em um evento");
        System.out.println("8 para apagar algo");
        System.out.println("0 para sair do menu");
        System.out.println("===========================");
        System.out.print("Opção: ");
    }

    public static void criarEvento() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data: ");
        String data = scanner.nextLine();
        System.out.print("Valor: ");
        int valor = scanner.nextInt();
        System.out.print("Vagas: ");
        int vagas = scanner.nextInt();
        Evento evento = new Evento(nome, vagas, valor, data);
        eventosList.adicionarEvento(evento);

    }

    public static void checarEventos() {
        eventosList.mostrarInfosEventos();
    }

    public static void editarEvento(){
        System.out.print("Insira o índice do evento à editar: ");
        int ind = scanner.nextInt();
        eventosList.editarEvento(ind);
    }

    public static void cadastrarUser() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Gênero: ");
        String genero = scanner.nextLine();
        System.out.print("Saldo: ");
        int saldo = scanner.nextInt();
        User user = new User(nome, idade, genero, saldo);
        usuarios.cadastrarUser(user);
    }

    public static void checarUsers(){
        usuarios.mostrarUsuarios();
    }

    public static void editarUser(){
        System.out.println("Insira o índice do usuário à editar: ");
        int ind = scanner.nextInt();
        usuarios.editarUser(ind);
    }
}
