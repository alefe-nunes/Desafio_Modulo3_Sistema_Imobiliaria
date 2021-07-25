package br.com.zup.Aplication;

import br.com.zup.Entidades.Catalogo;
import br.com.zup.Entidades.Funcionario;
import br.com.zup.Entidades.Imovel;
import br.com.zup.Entidades.Morador;


import java.util.ArrayList;
import java.util.List;

public class Sistema {


    public static void cadastrarImovel() {

        System.out.println("Agora vamos cadastrar um imóvel");

        System.out.println("Qual é o endereço do imóvel?");

        String endereco = IO.criaScanner().nextLine();

        System.out.println("Qual é o código do imóvel?");

        String codigoDoImovel = IO.criaScanner().nextLine();

        System.out.println("Qual é o valor do aluguel?");

        String valorDoAluguel = IO.criaScanner().nextLine();

        Imovel imovel = new Imovel(endereco, codigoDoImovel, valorDoAluguel);

        Catalogo.adicionarImovelAoCatalogo(imovel);


    }


    public static void cadastrarMorador() {

        List<Morador> listaDeMoradores = new ArrayList<>();

        System.out.println("Agora vamos cadastrar os moradores");

        System.out.println("Qual é o nome?");

        String nome = IO.criaScanner().nextLine();

        System.out.println("Qual é o CPF do morador?");

        String cpf = IO.criaScanner().nextLine();

        System.out.println("Você deseja cadastrar outro morador?");

        System.out.println("DIgite SIM ou NÃO");

        String opcao = IO.criaScanner().next();

        if (opcao.equals("SIM")) {


            Morador morador = new Morador(nome, cpf, listaDeMoradores.size());
            Imovel.adicionarMorador(morador);

            listaDeMoradores.add(morador);

        } else {


            menu();

        }


    }


    public static void cadastrarFuncionario() {

        System.out.println("Agora vamos cadastrar o funcionário que te atendeu");

        System.out.println("Qual é o nome dele?");

        String nome = IO.criaScanner().nextLine();

        System.out.println("Qual é o número de matricula dele?");

        String numeroDeMatricula = IO.criaScanner().nextLine();

        Funcionario funcionario = new Funcionario(nome, numeroDeMatricula);

        System.out.println(funcionario);

    }


    public static void menu() {

        System.out.println("SEJA BEM VINDO (a) À IMOBILIÁRIA");

        System.out.println("Digite 1 para cadastrar um imóvel: ");
        System.out.println("Digite 2 para cadastrar morador ");
        System.out.println("Digite 3 para cadastrar o funcionário responsável pelo atendimento: ");
        System.out.println("Digite 4 para exibir todos os dados: ");
        System.out.println("Digite 5 para sair do programa: ");
    }


    public static void executarSistema() {


        boolean executar = true;


        while (executar == true) {


            menu();

            String opcoesMenu = IO.criaScanner().nextLine();

            switch (opcoesMenu) {


                case "1":

                    cadastrarImovel();

                    break;

                case "2":

                    cadastrarMorador();

                    break;

                case "3":

                    cadastrarFuncionario();

                    break;

                case "4":

                    Catalogo.exibirCatalogo();
                    Imovel.exibirListaDeMoradores();

                    break;


                case "5":

                    executar = false;

                    System.out.println("PROGRAMA FINALIZADO");

                    break;
            }

        }

    }

}














