package br.com.zup.Entidades;

public class Funcionario extends Pessoa{


    private String numeroDeMatricula;

    public Funcionario () {}


    public Funcionario(String nome, String numeroDeMatricula) {
        super(nome);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("\n_____________________________");
        string.append("\nO nome do funcionário responsável pelo atendimento é: " + getNome());
        string.append("\nO número de matrícula dele é: " + numeroDeMatricula);
        return string.toString();

    }
}
