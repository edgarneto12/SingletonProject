package org.singletonproject;

public class Contato implements Comparable<Contato> {
    //Inicia as variáveis privadas
    private String nome;
    private String telefone;

    //Construtor de Contato
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //Getter de Nome
    public String getNome() {
        return nome;
    }

    //Setter de nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter de telefone
    public String getTelefone() {
        return telefone;
    }

    //Setter de telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Converte para string
    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + "]";
    }

    @Override
    public int compareTo(Contato outro) {
        return this.nome.compareTo(outro.nome);
    }
}