package org.singletonproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Define variáveis globais
        int option = 0;
        String name;
        String phoneNumber;
        //Inicia o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in, "UTF-8");
        ListaTelefonica listaTelefonica = ListaTelefonica.getInstance();


        //Exibe o menu de opções para o usuário
        while (option != 4) {
            System.out.println("\nSistema de Lista Telefônica");
            System.out.println("1. Adicionar um Contato");
            System.out.println("2. Remover um Contato");
            System.out.println("3. Exibir os Contatos");
            System.out.println("4. Sair do sistema");
            System.out.print("Digite sua opção: ");

            //Inicia o Switch case
            option = scanner.nextInt();
            switch (option) {
                //Caso seja escolhido a opção 1 (Adicionar contato)
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    System.out.print("Digite o número de telefone do contato: ");
                    phoneNumber = scanner.nextLine();

                    Contato contato = new Contato(name, phoneNumber);
                    listaTelefonica.adicionarContato(contato);
                    break;
                //Caso seja escolhido a opção 2(Remover um contato)
                case 2:
                    listaTelefonica.exibirContatos();
                    scanner.nextLine();
                    System.out.print("Digite o número correspondente \nao contato que deseja apagar: ");
                    int aRemove = scanner.nextInt();

                    listaTelefonica.removerContato(aRemove);
                    break;
                //Caso seja escolhido a opção 3(Exibir os contatos)
                case 3:
                    listaTelefonica.exibirContatos();
                    break;
                //Caso seja escolhido a opção 4(Sair do sistema)
                case 4:
                    System.out.println("Saindo...");
                    break;
                //Caso seja escolhido uma opção inexistente
                default:
                    System.out.println("Opção inválida, por favor tente novamente.");
            }
        }

        scanner.close();
    }
}