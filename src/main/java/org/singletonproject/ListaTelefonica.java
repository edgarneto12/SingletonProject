package org.singletonproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTelefonica {

    //Define as variáveis privadas
    private static volatile ListaTelefonica instance;
    private final List<Contato> contatos;
    private ListaTelefonica() {
        this.contatos = new ArrayList<>();
    }

    //Método global para usar o Singleton
    public static ListaTelefonica getInstance() {
        if (instance == null) {
            synchronized (ListaTelefonica.class) {
                if (instance == null) {
                    instance = new ListaTelefonica();
                }
            }
        }
        return instance;
    }

    //Método para adicionar um novo contato
    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    //Método para remover um contado escolhido pelo usuário
    public void removerContato(int aRemove){

        //Transforma remove em index
        int remove = aRemove - 1;
        //Remove o contato
        if (remove >= 0 && remove < contatos.size()) {
            contatos.remove(remove);
        } else {
            System.out.println("Número não está na lista.");
        }
        System.out.println("Contato removido!");
        exibirContatos();
    }

    //Método para exibir todos os contatos
    public void exibirContatos() {
        Collections.sort(contatos);
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato registrado");
        } else {
            System.out.println("Contatos registrados : ");
            for (Contato contato : this.contatos) {
                System.out.println((contatos.indexOf(contato) + 1) + "° " + contato);
            }
        }
    }
}
