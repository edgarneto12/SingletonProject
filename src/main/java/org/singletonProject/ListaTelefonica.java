package org.singletonProject;
import java.util.ArrayList;
import java.util.List;

public class ListaTelefonica {

    public void testContatos(){
        Contato a = new Contato("a","1");
        Contato b = new Contato("b","2");
        Contato c = new Contato("c","3");
        this.contatos.add(a);
        this.contatos.add(b);
        this.contatos.add(c);
        exibirContatos();
    }

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
    
    public void removerContato(String phoneNumber{



//        System.out.println('x');
//        System.out.println(phoneNumber);
//        for (Contato contato : contatos){
//            System.out.println(phoneNumber);
//            System.out.println(contato.getTelefone());
//            if (phoneNumber == contato.getTelefone() ){
//                System.out.println("r");
//            }
//        }
    }

    public void exibirContatos() {

        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato registrado");
        } else {
            System.out.println("Contatos registrados : ");
            for (Contato contato : this.contatos) {
                System.out.println(contato);
            }
        }
    }
}
