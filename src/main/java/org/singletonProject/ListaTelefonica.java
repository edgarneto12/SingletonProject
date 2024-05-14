package org.singletonProject;
import java.util.ArrayList;
import java.util.List;

public class ListaTelefonica {

    public void testContatos(){
        Contato a = new Contato("a","001");
        Contato b = new Contato("b","002");
        Contato c = new Contato("c","003");
        this.contatos.add(a);
        this.contatos.add(b);
        this.contatos.add(c);
        exibirContatos();
    }

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
    
    public void removerContato(String value) {
        for (Contato x : contatos){
            if(x.getTelefone() == value){
            }
        }
    }

    public void exibirContatos() {

        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato registrado");
        } else {
            for (Contato contato : this.contatos) {
                System.out.println(contato);
            }
        }
    }
}
