package br.com.zup.Entidades;

public class Funcionario extends Pessoa{


    private String numeroDeMatricula;


    public Funcionario(String nome, String numeroDeMatricula) {
        super(nome);
        this.numeroDeMatricula = numeroDeMatricula;
    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("\n_____________________________");
        string.append("\nO número de matrícula do funcionário responsável pelo atendimento é: " + numeroDeMatricula);
        return string.toString();

    }
}
