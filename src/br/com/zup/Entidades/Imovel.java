package br.com.zup.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    String endereco;
    String codigoDoImovel;
    String valorDoAluguel;
    List <Morador> listaDeMoradores= new ArrayList<>();

    public Imovel(String endereco, String codigoDoImovel, String valorDoAluguel, List<Morador> listaDeMoradores) {
        this.endereco = endereco;
        this.codigoDoImovel = codigoDoImovel;
        this.valorDoAluguel = valorDoAluguel;
        this.listaDeMoradores = listaDeMoradores;
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


}
