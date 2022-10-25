package it.fi.itismeucci;

import java.util.ArrayList;

public class Classe {
    
    //ATTRIBUTI

    int numero = 5;
    String sezione = "BIA";
    String aula = "9-TW";
    ArrayList <Alunno> alunni = new ArrayList();

    //GETTER

    public int getNumero() {
        return numero;
    }

    public String getSezione() {
        return sezione;
    }

    public String getAula() {
        return aula;
    }

    public ArrayList<Alunno> getAlunni() {
        return alunni;
    }

    //SETTER

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setAlunni(ArrayList<Alunno> alunni) {
        this.alunni = alunni;
    }

    //COSTRUTTORE

    public Classe(){

    }

    //AGGIUNTA AD ARRAY

    public void aggiungi(Alunno a){
        alunni.add(a);
    }

    //RIMOZIONE DA ARRAY

    public void rimuovi(Alunno a){
        alunni.remove(a);
    }

}
