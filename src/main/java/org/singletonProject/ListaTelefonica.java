package org.singletonProject;


public class ListaTelefonica {
    private static ListaTelefonica instance;

    private ListaTelefonica() {
        // Construtor privado para evitar instanciação direta
    }

    public static ListaTelefonica getInstance() {
        if (instance == null) {
            instance = new ListaTelefonica();
        }
        return instance;
    }

}
