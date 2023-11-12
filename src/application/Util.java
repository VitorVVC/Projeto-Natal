package application;

import entities.*;
import entitiesEnum.Etapa;
import entitiesEnum.MateriasEnum;

import java.util.ArrayList;
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

        System.out.println("===========================================");
        System.out.println("Olá querido usuário, me chamo São Nicolau.");
        System.out.println("Mais conhecido como Papai Noel !");
        System.out.println("===========================================");
        System.out.println("Se você está lendo estas mensagens você deve ser muito especial, pois este é meu aplicativo em fase de testes.");
        System.out.println("Quer saber umas curiosidades sobre mim? Hohohohoho");
        String resposta;

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
        System.out.print("É um prazer te conhecer " + nome + " você se comportou bem esse ano (Sim OU Não): ");
        String sOuN;
        ArrayList<Acoes> acoesBoas = new ArrayList<>();
        ArrayList<Acoes> acoesRuins = new ArrayList<>();
        do {
            sOuN = sc.nextLine();
            if (sOuN.equalsIgnoreCase("sim")) {
                System.out.println("Já que você se considera uma boa criança por favor liste para mim duas ações favoritas este ano");
                System.out.print("Ação UM: ");
                Acoes acaoUm = new Acoes(sc.nextLine());
                System.out.print("Ação DOIS: ");
                Acoes acaoDois = new Acoes(sc.nextLine());
                acoesBoas.add(acaoUm);
                acoesBoas.add(acaoDois);
                System.out.printf("Que bacana %s, vamos seguir com mais dois pedidos ok ?%n Escreva para o papai noel suas duas matérias prediletas, as etapas em que elas foram mais incrives e claro as suas notas nelas, se forem incriveis mesmo você pode ganhar um presente extra%n", nome);
                System.out.print("Nome da matéria: ");
                try {
                    MateriasEnum materiaUm = MateriasEnum.valueOf(sc.nextLine().toUpperCase());
                } catch (Exception exception) {
                    System.out.println("Erro na leitura da matéria: "+ exception.getMessage());
                }
                System.out.print("Etapa favorita da materia (Primeira,Segunda..):");

                System.out.println("Nossa.. que incrivel! Realmente você foi fantástico esse ano.Pois bem vamos seguir adiante em nosso bate-papo");
            } else if (sOuN.equalsIgnoreCase("não")) {
                System.out.println("Poxa que pena que você não foi muito bem esse ano, mas ei não se desanime ok? Proximo ano você pode tentar novamente");
                System.out.println("Porém você reconhecer isso é uma ótima atitude, meus sinceros parabéns!");
                System.out.println("Agora por favor, me liste duas de suas más ações");
                System.out.print("Ação UM: ");
                String acaoUM = sc.nextLine();
                System.out.print("Ação DOIS: ");
                String acaoDOIS = sc.nextLine();

            }
        } while (!sOuN.equalsIgnoreCase("sim") && !sOuN.equalsIgnoreCase("não"));
    }


}
