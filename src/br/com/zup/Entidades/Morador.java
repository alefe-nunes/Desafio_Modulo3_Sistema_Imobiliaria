package br.com.zup.Entidades;

public class Morador extends Pessoa {

    private String cpf;
    private int quantidadeDeMoradores;

    public Morador () {}

    public Morador(String nome, String cpf, int quantidadeDeMoradores) {
        super(nome);
        this.cpf = cpf;
        this.quantidadeDeMoradores = quantidadeDeMoradores;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQuantidadeDeMoradores() {
        return quantidadeDeMoradores;
    }

    public void setQuantidadeDeMoradores(int quantidadeDeMoradores) {
        this.quantidadeDeMoradores = quantidadeDeMoradores;
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
