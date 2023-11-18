package application;

import com.sun.jdi.event.ExceptionEvent;
import entities.*;
import entitiesEnum.Etapa;
import entitiesEnum.MateriasEnum;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
    // Clase destinada a aplicar métodos extensos que desejo usar na Main porém para "encutar" eu posso faze-la aqui
    // Servindo assim como uma classe suporte para principal
    public static Scanner sc = new Scanner(System.in);
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Data: 'dd/MM/yyyy 'Hora: 'HH:mm:ss");

    public static Double validarDouble(Double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Não aceitamos valor negativo nesta entrada");
        }
        return valor;
    }

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
        LocalDateTime agora = ZonedDateTime.now(ZoneOffset.UTC).toLocalDateTime();
        ZonedDateTime poloNorteZonedDateTime = ZonedDateTime.of(agora, ZoneOffset.UTC);
        LocalDateTime poloNorte = poloNorteZonedDateTime.toLocalDateTime();

        System.out.println("===========================================");
        System.out.println("Olá querido usuário, me chamo São Nicolau.");
        System.out.println("Mais conhecido como Papai Noel !");
        System.out.println("===========================================");
        System.out.println("Se você está lendo estas mensagens você deve ser muito especial, pois este é meu aplicativo em fase de testes.");
        System.out.println("Quer saber umas curiosidades sobre mim? Hohohohoho");
        // Para o primeiro if, na questão se a criança gostaria ou não de saber curiosidades sobre o papai noel
        String resposta;
        // Variaveis para quando formos pedir informações que formam uma boa ou má criança
        String sOuN; // Armazenar respostas
        ArrayList<Acoes> acoesBoas = new ArrayList<>(); // Armazenar boas acoes
        ArrayList<Acoes> acoesRuins = new ArrayList<>(); // Armazenarc más acoes
        ArrayList<Materias> listMaterias = new ArrayList<>(); // Armazenar materias

        do {
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println(papaiNoel);
                System.out.println("E agora no polo norte são exatamente: " + formatter.format(poloNorte));
                System.out.println("Legal não é mesmo?! Hohohoho");
                System.out.println("Pois agora vamos prosseguir.");
            } else if (resposta.equalsIgnoreCase("não")) {
                System.out.println("Tudo bem, vamos prosseguir então.");
            } else {
                System.out.println("Não entendi qual foi sua resposta, poderia repetir por favor?");
                System.out.print("Lembre-se que o Noel aqui tá caduco, só entendo Sim ou Não: ");
            }
        } while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não"));

        System.out.println("===========================================");
        System.out.println("Pois bem meu jovem, você poderia fornecer-me seu nome?");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("É um prazer te conhecer " + nome + " você se comportou bem esse ano (Sim OU Não): ");
        do {
            sOuN = sc.nextLine();
            System.out.println("===========================================");
            if (sOuN.equalsIgnoreCase("sim")) {
                System.out.println("Já que você se considera uma boa criança por favor liste para mim duas ações favoritas este ano");
                System.out.print("Ação UM: ");
                Acoes acaoUm = new Acoes(sc.nextLine());
                System.out.print("Ação DOIS: ");
                Acoes acaoDois = new Acoes(sc.nextLine());
                acoesBoas.add(acaoUm);
                acoesBoas.add(acaoDois);
                System.out.println("===========================================");
                System.out.printf("Que bacana %s, vamos seguir com o ultimo pedido so pra garantir que você foi mesmo uma ótima criança ok ?%nEscreva para o papai noel os seguintes pedidos: %nSuas duas matérias prediletas%nAs etapas em que elas foram mais divertidas%nE claro as suas notas nelas%nSe forem incriveis mesmo você pode ganhar um presente extra%n", nome);
                System.out.println("===========================================");
                // Pedir a primeira mateira
                pedindoMateria(nome, 1, listMaterias);
                // Pedir a segunda materia
                pedindoMateria(nome, 2, listMaterias);

                System.out.println("Nossa.. que incrivel! Realmente você foi fantástico(a) esse ano.Pois bem vamos seguir adiante em nosso bate-papo");
                break;
                // Para maus meninos
            } else if (sOuN.equalsIgnoreCase("não")) {
                System.out.println("Poxa que pena que você não foi muito bem esse ano, mas ei não se desanime ok? Proximo ano você pode tentar novamente");
                System.out.println("Porém você reconhecer isso é uma ótima atitude, meus sinceros parabéns!");
                System.out.println("Agora por favor, me liste duas de suas más ações");
                System.out.print("Ação UM: ");
                Acoes acaoUm = new Acoes(sc.nextLine());
                System.out.print("Ação DOIS: ");
                Acoes acaoDois = new Acoes(sc.nextLine());
                acoesBoas.add(acaoUm);
                acoesBoas.add(acaoDois);
                System.out.println("===========================================");
                System.out.printf("Que bacana %s, vamos seguir com o ultimo pedido para quando você for uma boa criança lembrar deste mmomento feliz,ok?%nEscreva para o papai noel os seguintes pedidos: %nSuas duas matérias prediletas%nAs etapas em que elas foram mais divertidas%nE claro as suas notas nelas%n", nome);
                System.out.println("===========================================");


            } else {
                System.out.print("Tente novamente (Sim ou Não): ");
            }
        } while (!sOuN.equalsIgnoreCase("sim") && !sOuN.equalsIgnoreCase("não"));
    }

    // Método para pedir as matérias
    // Pede o nome do usuário pois precisamos saber desse dado para exibir em alguns métodos
    // Pede materia pois existem materia um ou dois então criamos mensagens personalizadas para ambas resposta e fazemos um tratamento de excessão para caso não seja uma dessas variaveis
    // Lista de materias do progama para podermos ir adicionando as materias
    public static void pedindoMateria(String nome, int materia, ArrayList<Materias> listMaterias) {
        try {
            if (materia == 1) {
                // Variaveis para matéria UM
                MateriasEnum materiaUm = null;
                Double parcialUm = null;
                Double globalUm = null;
                Etapa etapaUm = null;

                System.out.print("Nome da matéria: ");
                try {
                    materiaUm = MateriasEnum.valueOf(sc.nextLine().toUpperCase());
                } catch (Exception exception) {
                    throw new RuntimeException("Não foi possivel identificar a materia em questão: " + exception.getMessage());
                }
                System.out.print("Etapa favorita da materia (Primeira,Segunda..): ");
                try {
                    etapaUm = Etapa.valueOf(sc.nextLine().toUpperCase());
                } catch (Exception exception) {
                    throw new RuntimeException("Erro na leitura da etapa: " + exception.getMessage());
                }
                System.out.printf("Ótimo %s vamos seguir adiante%n", nome);
                System.out.println("Informe a sua nota parcial de " + materiaUm);
                System.out.print("Nota parcial: ");
                try {
                    // Ele converte oque for escrito para um Double, primeira vez utilizando tal método por isso julgo este comentário como essencial
                    parcialUm = validarDouble(Double.parseDouble(sc.nextLine()));
                } catch (Exception exception) {
                    throw new RuntimeException("Erro na leitura da nota parcial: " + exception.getMessage());
                }
                System.out.println("Informe a sua nota global de " + materiaUm);
                System.out.print("Nota global: ");
                try {
                    globalUm = validarDouble(Double.parseDouble(sc.nextLine()));
                } catch (Exception exception) {
                    throw new RuntimeException("Erro na leitura da nota parcial: " + exception.getMessage());
                } finally {
                    System.out.println("Fim do pedido de nota UM...");
                }
                Materias materiasUm = new Materias(materiaUm, etapaUm, parcialUm, globalUm);
                listMaterias.add(materiasUm);
            } else if (materia == 2) {
                // Variaveis para matéria DOIS
                MateriasEnum materiaDois = null;
                Double parcialDois = null;
                Double globalDois = null;
                Etapa etapaDois = null;


                System.out.print("Nome da matéria: ");
                try {
                    materiaDois = MateriasEnum.valueOf(sc.nextLine().toUpperCase());
                } catch (Exception exception) {
                    throw new RuntimeException("Não foi possivel identificar a materia em questão: " + exception.getMessage());
                }
                System.out.print("Etapa favorita da materia (Primeira,Segunda..): ");
                try {
                    etapaDois = Etapa.valueOf(sc.nextLine().toUpperCase());
                } catch (Exception exception) {
                    throw new RuntimeException("Erro na leitura da etapa: " + exception.getMessage());
                }
                System.out.printf("Ótimo %s vamos seguir adiante%n", nome);
                System.out.println("Informe a sua nota parcial de " + materiaDois);
                System.out.print("Nota parcial: ");
                try {
                    // Ele converte oque for escrito para um Double, primeira vez utilizando tal método por isso julgo este comentário como essencial
                    parcialDois = validarDouble(Double.parseDouble(sc.nextLine()));
                } catch (Exception exception) {
                    throw new RuntimeException("Erro na leitura da nota parcial: " + exception.getMessage());
                }
                System.out.println("Informe a sua nota global de " + materiaDois);
                System.out.print("Nota global: ");
                sc.nextLine();
                try {
                    globalDois = validarDouble(Double.parseDouble(sc.nextLine()));
                } catch (Exception exception) {
                    throw new RuntimeException("Erro na leitura da nota parcial: " + exception.getMessage());
                }finally {
                    System.out.println("Fim do pedido de nota DOIS...");
                }
                Materias materiasDois = new Materias(materiaDois, etapaDois, parcialDois, globalDois);
                listMaterias.add(materiasDois);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro no reconhecimento da escrita ! " + e.getMessage());
            e.getStackTrace();
        }
    }


}
