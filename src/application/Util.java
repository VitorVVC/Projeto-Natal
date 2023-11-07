package application;

import entities.*;
import entitiesEnum.Etapa;
import entitiesEnum.MateriasEnum;

import java.util.Scanner;

public class Util {
    // Clase destinada a aplicar métodos extensos que desejo usar na Main porém para "encutar" eu posso faze-la aqui
    // Servindo assim como uma classe suporte para principal
    public static Scanner sc = new Scanner(System.in);

    public static void teste() {

        // Criando um teste de papai noel.
        Pessoa noelTeste = new Noel("Vitor", "vitorvvc2005@gmail.com", "109.876.543-21", "biscoitos com leite", 6, 50);

        // Criando um teste de bom menino.
        Pessoa testeMeninoBom = new BonsMeninos("Estela", "estelaAmaOVitor@gmail.com", "123.456.789-10", "amo meu irmão");

        Acoes acao1 = new Acoes("Dei um PS5 para o meu irmão lindo");
        Acoes acao2 = new Acoes("Dei um MAC Mini para meu irmão lindo");
        Acoes acao3 = new Acoes("Dei um carro para o meu irmão lindo");

        Materias geoE1 = new Materias(MateriasEnum.GEOGRAFIA, Etapa.PRIMEIRA, 10.0, 9.0);
        Materias geoE2 = new Materias(MateriasEnum.GEOGRAFIA, Etapa.SEGUNDA, 9.0, 8.0);
        Materias geoE3 = new Materias(MateriasEnum.GEOGRAFIA, Etapa.TERCEIRA, 6.0, 6.0);
        Materias geoE4 = new Materias(MateriasEnum.GEOGRAFIA, Etapa.QUARTA, 7.5, 7.0);

        ((BonsMeninos) testeMeninoBom).adicionarBoasAcoes(acao1);
        ((BonsMeninos) testeMeninoBom).adicionarBoasAcoes(acao2);
        ((BonsMeninos) testeMeninoBom).adicionarBoasAcoes(acao3);

        ((BonsMeninos) testeMeninoBom).adicionarNotas(geoE1);
        ((BonsMeninos) testeMeninoBom).adicionarNotas(geoE2);
        ((BonsMeninos) testeMeninoBom).adicionarNotas(geoE3);
        ((BonsMeninos) testeMeninoBom).adicionarNotas(geoE4);

        // Criando um teste de mau menino.
        Pessoa testeMauMenino = new MausMeninos("Estela", "estelinha@gmail.com", "123.456.789-10", "odeio meu irmão");

        Acoes acoes01 = new Acoes("Não dei um PS5 para meu irmão lindo");
        Acoes acoes02 = new Acoes("Não dei um MAC Mini para meu irmão lindo");
        Acoes acoes03 = new Acoes("Não dei um carro para meu irmão lindo");

        Materias ingE1 = new Materias(MateriasEnum.INGLES, Etapa.PRIMEIRA, 5.0, 4.0);
        Materias ingE2 = new Materias(MateriasEnum.INGLES, Etapa.SEGUNDA, 7.0, 3.0);
        Materias ingE3 = new Materias(MateriasEnum.INGLES, Etapa.TERCEIRA, 1.0, 2.0);
        Materias ingE4 = new Materias(MateriasEnum.INGLES, Etapa.QUARTA, 5.0, 4.0);

        ((MausMeninos) testeMauMenino).adicionarMasAcoes(acoes01);
        ((MausMeninos) testeMauMenino).adicionarMasAcoes(acoes02);
        ((MausMeninos) testeMauMenino).adicionarMasAcoes(acoes03);

        ((MausMeninos) testeMauMenino).adicionarNotas(ingE1);
        ((MausMeninos) testeMauMenino).adicionarNotas(ingE2);
        ((MausMeninos) testeMauMenino).adicionarNotas(ingE3);
        ((MausMeninos) testeMauMenino).adicionarNotas(ingE4);


        // System.out.println(noelTeste);
        // System.out.println(testeMeninoBom);
        System.out.println(testeMauMenino);


    }

    public static void testeInterativo() {
        Noel papaiNoel = new Noel("São Nicolau", "papainoel@northpole.com", "969.300.800-25", "biscoitoComLeite", 8, 60.0);
        String resposta;

        System.out.println("===========================================");
        System.out.println("Olá querido usuário, me chamo São Nicolau.");
        System.out.println("Mais conhecido como Papai Noel !");
        System.out.println("===========================================");
        System.out.println("Se você está lendo estas mensagens você deve ser muito especial, pois este é meu aplicativo em fase de testes.");
        System.out.println("Quer saber umas curiosidades sobre mim? Hohohohoho");

        do {
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println(papaiNoel);
                System.out.println("Legal não é mesmo?! Hohohoho");
                System.out.println("Pois agora vamos prosseguir.");
            } else if (resposta.equalsIgnoreCase("não")) {
                System.out.println("Tudo bem meu jovem, vamos prosseguir então.");
            } else {
                System.out.println("Não entendi qual foi sua resposta, poderia repetir por favor?");
                System.out.print("Lembre-se que o Noel aqui tá caduco, só entendo Sim ou Não: ");
            }
        } while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não"));

        System.out.println("Pois bem meu jovem, você poderia fornecer-me seu nome?");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
    }


}
