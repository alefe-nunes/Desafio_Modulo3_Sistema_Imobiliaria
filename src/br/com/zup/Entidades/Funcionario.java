package br.com.zup.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {


    private String numeroDeMatricula;
    private static List<Funcionario> listaDeFuncionarios = new ArrayList<>();

    public Funcionario() {
    }


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


    public  static void adicionarFuncionario(Funcionario funcionario) {

        listaDeFuncionarios.add(funcionario);
    }

    public static void exibirListaDeFuncionarios() {

        System.out.println("ESTE É O FUNCIONÁRIO QUE TE ATENDEU");

        for (Funcionario funcionarioDaLista : listaDeFuncionarios) {

            System.out.println(funcionarioDaLista);
        }
    }


    @Override
    public String toString() {
        StringBuilder exibir = new StringBuilder();
        exibir.append("\n_____________________________");
        exibir.append("\nO nome do funcionário responsável pelo atendimento é: " + getNome());
        exibir.append("\nO número de matrícula dele é: " + numeroDeMatricula);
        exibir.append("\n_____________________________");
        return exibir.toString();

    }
}

// Métodos para exibir o funcionário cadastrado