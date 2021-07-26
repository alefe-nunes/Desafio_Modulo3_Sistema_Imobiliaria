package br.com.zup.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private String endereco;
    private String codigoDoImovel;
    private String valorDoAluguel;
    private static List<Morador> listaDeMoradores = new ArrayList<>();

    public Imovel() {
    }

    public Imovel(String endereco, String codigoDoImovel, String valorDoAluguel) {
        this.endereco = endereco;
        this.codigoDoImovel = codigoDoImovel;
        this.valorDoAluguel = valorDoAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigoDoImovel() {
        return codigoDoImovel;
    }

    public void setCodigoDoImovel(String codigoDoImovel) {
        this.codigoDoImovel = codigoDoImovel;
    }

    public String getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(String valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }


    public static void adicionarMorador(Morador moradores) {

        listaDeMoradores.add(moradores);
    }

    public static void exibirListaDeMoradores() {

        System.out.println("ESTA É A LISTA DE MORADORES");

        for (Morador elementoDaLista : listaDeMoradores) {

            System.out.println(elementoDaLista);
        }
    }


    public void excluirMoradorDoImovel(String cpf) {

        Morador moradorDeResposta = null;

        for (Morador elementoDaListaDeMoradores : listaDeMoradores) {

            if (elementoDaListaDeMoradores.getCpf().equals(cpf)) {

                moradorDeResposta = elementoDaListaDeMoradores;
            }
        }

        listaDeMoradores.remove(moradorDeResposta);
    }


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("\n_____________________________");
        string.append("\nO endereço do imóvel é: " + endereco);
        string.append("\nO código do imóvel é: " + codigoDoImovel);
        string.append("\nO valor do aluguel é: " + endereco);
        return string.toString();


    }

}
