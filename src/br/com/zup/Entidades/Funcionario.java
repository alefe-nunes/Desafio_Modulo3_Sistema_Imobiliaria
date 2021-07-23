package br.com.zup.Entidades;

public class Funcionario extends Pessoa{


    String matricula;

    public Funcionario(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


}
