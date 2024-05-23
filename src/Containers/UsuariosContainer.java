package Containers;

import Entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosContainer {
    public ArrayList<User> usuariosCadastrados = new ArrayList<User>();

    public void cadastrarUser(User user){
        usuariosCadastrados.add(user);
    }

    public void mostrarUsuarios(){
        for(int i = 0; i < usuariosCadastrados.size(); i++){
            usuariosCadastrados.get(i).status(i);
        }
    }

    public void editarUser(int ind){
        Scanner scanner = new Scanner(System.in);
        if(ind < 0 || ind >= usuariosCadastrados.size()){
            System.out.println("Índice Inválido, tente novamente");
            return;
        }
        User user = usuariosCadastrados.get(ind);
        System.out.println("Informações do usuário selecionado:");
        user.status(ind);
        System.out.println("\nDigite as novas informações do usuário: ");
        System.out.print("Nome: ");
        String novoNome = scanner.nextLine();
        System.out.print("Gênero: ");
        String novoGenero = scanner.nextLine();
        System.out.print("Idade: ");
        int novaIdade = scanner.nextInt();
        System.out.print("Saldo: ");
        int novoSaldo = scanner.nextInt();
        user.setNome(novoNome);
        user.setSaldo(novoSaldo);
        user.setGenero(novoGenero);
        user.setIdade(novaIdade);
        System.out.println("\nUsuário "+user.getNome()+" atualizado com sucesso!");
    }

    public void excluirUsuario(int ind) {
        if (ind < 0 || ind >= usuariosCadastrados.size()) {
            System.out.println("Índice inválido. Tente novamente.");
            return;
        }
        User user = usuariosCadastrados.get(ind);
        user.status(ind);
        usuariosCadastrados.remove(ind);
        System.out.println("\nUsuário " + user.getNome() + " deletado com sucesso!");
    }
}
