package br.com.zup.Entidades;

public class Morador extends Pessoa {


   private String CPF;

    public Morador(String nome, String CPF) {
        super(nome);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }




}
