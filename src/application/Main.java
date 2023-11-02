package application;

import entities.*;
import entitiesEnum.MateriasEnum;

public class Main {
    public static void main(String[] args) {

        // Criando um teste de papai noel.
        Pessoa noelTeste = new Noel("Vitor", "109.876.543-21", "biscoitos com leite", 6, 50);


        // Criando um teste de bom menino.
        Pessoa testeMeninoBom = new BonsMeninos("Estela", "123.456.789-10", "amo meu irmão");

        Acoes acao1 = new Acoes("Dei um PS5 para o meu irmão lindo");
        Acoes acao2 = new Acoes("Dei um MAC Mini para meu irmão lindo");
        Acoes acao3 = new Acoes("Dei um carro para o meu irmão lindo");

        Materias geografiaEstela = new Materias(MateriasEnum.GEOGRAFIA, 10.0, 7.0, 6.0);
        Materias historiaEstela = new Materias(MateriasEnum.MATEMATICA, 8.5, 6.0, 7.0);
        Materias matematicaEstela = new Materias(MateriasEnum.CIENCIA, 10.0, 8.0, 5.0);

        ((BonsMeninos) testeMeninoBom).adicionarBoasAcoes(acao1);
        ((BonsMeninos) testeMeninoBom).adicionarBoasAcoes(acao2);
        ((BonsMeninos) testeMeninoBom).adicionarBoasAcoes(acao3);

        ((BonsMeninos) testeMeninoBom).adicionarNotas(geografiaEstela);
        ((BonsMeninos) testeMeninoBom).adicionarNotas(historiaEstela);
        ((BonsMeninos) testeMeninoBom).adicionarNotas(matematicaEstela);

        // Criando um teste de mau menino.
        Pessoa testeMauMenino = new MausMeninos("Estela", "123.456.789-10", "odeio meu irmão");

        Acoes acoes01 = new Acoes("Não dei um PS5 para meu irmão lindo");
        Acoes acoes02 = new Acoes("Não dei um MAC Mini para meu irmão lindo");
        Acoes acoes03 = new Acoes("Não dei um carro para meu irmão lindo");

        Materias inglesEstela = new Materias(MateriasEnum.INGLES, 5.0, 4.0, 6.0);
        Materias portuguesEstela = new Materias(MateriasEnum.PORTUGUES, 6.5, 6.0, 5.0);
        Materias redacaoEstela = new Materias(MateriasEnum.REDACAO, 7.0, 8.0, 4.0);

        ((MausMeninos) testeMauMenino).adicionarMasAcoes(acoes01);
        ((MausMeninos) testeMauMenino).adicionarMasAcoes(acoes02);
        ((MausMeninos) testeMauMenino).adicionarMasAcoes(acoes03);

        ((MausMeninos) testeMauMenino).adicionarNotas(inglesEstela);
        ((MausMeninos) testeMauMenino).adicionarNotas(portuguesEstela);
        ((MausMeninos) testeMauMenino).adicionarNotas(redacaoEstela);



        //System.out.println(noelTeste);
        //System.out.println(testeMeninoBom);
        System.out.println(testeMauMenino);


    }
}