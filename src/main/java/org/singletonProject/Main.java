package org.singletonProject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        ListaTelefonica listaTelefonica = ListaTelefonica.getInstance();

        while (option != 3) {
            System.out.println("\nSistema de Diretório Telefônico");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Exibir Contatos");
            System.out.println("3. Sair");
            System.out.print("Digite sua opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    System.out.print("Digite o número de telefone do contato: ");
                    String phoneNumber = scanner.nextLine();

                    Contato contato = new Contato(name, phoneNumber);
                    listaTelefonica.adicionarContato(contato);
                    break;
                case 2:
                    listaTelefonica.exibirContatos();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, por favor tente novamente.");
            }
        }

        scanner.close();
    }
}