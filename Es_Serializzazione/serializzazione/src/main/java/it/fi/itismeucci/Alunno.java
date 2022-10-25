package it.fi.itismeucci;

import java.util.Date;

public class Alunno {
    
    //ATTRIBUTI

    String nome = null;
    String cognome = null;
    Date dataNascita = null;

    //GETTER

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public Date getDataNascita() {
        return dataNascita;
    }

    //SETTER

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    //COSTRUTTORE 

    public Alunno(String nome, String cognome, Date dataNascita){
        this.nome = nome;
        this.cognome = cognome;
        dataNascita = new Date();
    }
}
