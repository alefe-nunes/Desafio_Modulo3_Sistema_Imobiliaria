package br.com.zup.Entidades;

public class Morador extends Pessoa {


    private String cpf;
    private String quantidadeDeMoradores;

    public Morador(String nome, String CPF , String quantidadeDeMoradores) {
        super(nome);
        this.cpf = cpf;
        this.quantidadeDeMoradores = quantidadeDeMoradores;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("\n_____________________________");
        string.append("\nO nome do morador é: " + getNome());
        string.append("\nO CPF do morador é : " + cpf);
        return string.toString();

    }

}
