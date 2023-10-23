
package com.mycompany.pessoa;

public class Pessoa {

    private int codigo;
    private String nome;
    private String fone;
    private String email;
    
    //constructor

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, String fone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Pessoa(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
     
    //getters //setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
