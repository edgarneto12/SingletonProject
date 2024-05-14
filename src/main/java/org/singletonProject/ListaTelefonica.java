package org.singletonProject;
import java.util.ArrayList;
import java.util.List;

public class ListaTelefonica {

    private static volatile ListaTelefonica instance;
    private List<Contato> contatos;

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

    public void exibirContatos() {
        for (Contato contato : this.contatos) {
            System.out.println(contato);
        }
    }
}
