package org.singletonProject;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTelefonica {

    private static volatile ListaTelefonica instance;
    private final List<Contato> contatos;

    private ListaTelefonica() {
        this.contatos = new ArrayList<>();
    }

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

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }
    
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
