package org.singletonProject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        String name;
        String phoneNumber;

        Scanner scanner = new Scanner(System.in);
        ListaTelefonica listaTelefonica = ListaTelefonica.getInstance();



        while (option != 4) {
            System.out.println("\nSistema de Diretório Telefônico");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Exibir Contatos");
            System.out.println("4. Sair");
            System.out.print("Digite sua opção: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.print("Digite o número de telefone do contato: ");
                    phoneNumber = scanner.nextLine();

                    Contato contato = new Contato(name, phoneNumber);
                    listaTelefonica.adicionarContato(contato);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Digite o nome do contato: ");
                    name = scanner.nextLine();

                    System.out.print("Digite o número de telefone do contato: ");
                    phoneNumber = scanner.nextLine();

                    listaTelefonica.removerContato(name, phoneNumber);
                    break;
                case 3:
                    listaTelefonica.exibirContatos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                case 5:
                    listaTelefonica.testContatos();
                    break;
                default:
                    System.out.println("Opção inválida, por favor tente novamente.");
            }
        }

        scanner.close();
    }
}