package br.com.zup.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private static List<Imovel> listaDeImoveis = new ArrayList<>();

    public static void adicionarImovelAoCatalogo(Imovel imovel) {

        listaDeImoveis.add(imovel);
    }


    public static void exibirCatalogo() {

        System.out.println("ESTE É O CATÁLOGO");

        System.out.println("IMÓVEIS DISPONÍVEIS");

        for (Imovel elementoDaLista : listaDeImoveis) {

            System.out.println(elementoDaLista);
        }

    }

}
