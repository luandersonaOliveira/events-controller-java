import Containers.Evento;
import Entities.User;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean sair = false;
    private static final Evento eventolist = new Evento();

    public static void main(String[] args) {
        do {
            menuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 1) {
                criarEvento();
            } else if (opcao == 2) {
                checarEvento();
            } else if (opcao == 3) {
                cadastrarUser();
            } else {
                sair = true;
            }
        } while (!sair);
    }

    public static void menuPrincipal() {
        System.out.println("==========================");
        System.out.println("SELECIONE SUA OPÇÃO:");
        System.out.println("1 para criar evento");
        System.out.println("2 para checar eventos");
        System.out.println("3 para cadastrar usuário");
        System.out.println("0 para sair do menu");
        System.out.println("===========================");
    }

    public static void criarEvento() {

    }

    public static void checarEvento() {
        eventolist.checarEventos();
    }

    public static void cadastrarUser() {
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gênero: ");
        String genero = scanner.nextLine();
        System.out.println("Saldo: ");
        int saldo = scanner.nextInt();
        User user = new User(nome, idade, genero, saldo);
        eventolist.adicionarUser(user);
    }
}
