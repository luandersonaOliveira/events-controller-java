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

    // CONTAINERS

    private static final Evento eventoList = new Evento("", 0, 0, "", 0);
    private static final EventosContainer eventosList = new EventosContainer();
    private static final UsuariosContainer usuarios = new UsuariosContainer();

    // METODOS

    public static void main(String[] args) {
        
        // OPÇÕES DO MENU
        do {
            menuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
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
                    cadastraUserNoEvento();
                    break;
                case 8:
                    checarUsersNoEvento();
                    break;
                case 9:
                    deletarAlgo();
                    break;
                case 0:
                    sair = true;
            }
        } while (!sair);
    }

    // MENU
    public static void menuPrincipal() {
        System.out.println("==========================");
        System.out.println("SELECIONE SUA OPÇÃO");
        System.out.print("| 1 para criar evento |");
        System.out.print(" 2 para checar eventos |");
        System.out.print(" 3 para editar um evento |");
        System.out.print("\n--------------------------------");
        System.out.print("\n| 4 para cadastrar usuário |");
        System.out.print(" 5 para ver usuarios cadastrados |");
        System.out.print(" 6 para editar um usuário |");
        System.out.print("\n--------------------------------");
        System.out.print("\n| 7 para cadastrar usuário em um evento |");
        System.out.print(" 8 para checar usuários em um evento |");
        System.out.print(" 9 para deletar algo |");
        System.out.print("\n--------------------------------");
        System.out.print("\n0 para sair do menu");
        System.out.println("\n===========================");
        System.out.print("Opção: ");
    }

    //CRIA EVENTOS
    public static void criarEvento() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data: ");
        String data = scanner.nextLine();
        System.out.print("Valor: ");
        int valor = scanner.nextInt();
        System.out.print("Vagas: ");
        int vagas = scanner.nextInt();
        System.out.print("Idade Mínima: ");
        int idadeMin = scanner.nextInt();
        Evento evento = new Evento(nome, vagas, valor, data, idadeMin);
        eventosList.adicionarEvento(evento);
    }

    // LISTA DE EVENTOS
    public static void checarEventos() {
        eventosList.mostrarInfosEventos();
    }

    // EDITAR EVENTOS
    public static void editarEvento() {
        System.out.print("\nInsira o índice do evento à editar: ");
        int ind = scanner.nextInt();
        eventosList.editarEvento(ind);
    }

    // CRIA USER
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

    // LISTA USER
    public static void checarUsers() {
        usuarios.mostrarUsuarios();
    }

    // EDITAR USER
    public static void editarUser() {
        System.out.println("Insira o índice do usuário à editar: ");
        int ind = scanner.nextInt();
        usuarios.editarUser(ind);
    }

    // CADASTRA USERS NOS EVENTOS
    public static void cadastraUserNoEvento() {
        System.out.print("Índice do User: ");
        int userIndice = scanner.nextInt();
        System.out.print("Índice do Evento: ");
        int eventoIndice = scanner.nextInt();
        User userSelected = usuarios.usuariosCadastrados.get(userIndice);
        Evento eventoSelecionado = eventosList.Eventos.get(eventoIndice);
        eventoList.cadastrarUser(userSelected, eventoSelecionado, userIndice);
    }

    // LISTA DE USERS NOS EVENTOS
    public static void checarUsersNoEvento() {
        System.out.print("Índice do Evento: ");
        int eventoIndice = scanner.nextInt();
        Evento evento = eventosList.Eventos.get(eventoIndice);
        evento.listarParticipantes(evento);
    }

    // DELETA EVENTOS OU USERS
    public static void deletarAlgo() {
        System.out.println("===========================");
        System.out.println("SELECIONE SUA OPÇÃO PARA DELETAR");
        System.out.print("| 1 Evento | 2 Usuário |");
        System.out.println("\n===========================");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.print("Insira o índice do evento à deletar: ");
            int ind = scanner.nextInt();
            eventosList.deletarEvento(ind);
        } else if (opcao == 2) {
            System.out.println("Insira o índice do usuário à deletar: ");
            int ind = scanner.nextInt();
            usuarios.deletarUsuario(ind);
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }
}
