package application;

import entities.BonsMeninos;
import entities.Materias;
import entities.Noel;
import entities.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa noelTeste = new Noel("Vitor", "109.876.543-21", "biscoitos com leite", 6, 50);


        Pessoa testeMeninoBom = new BonsMeninos("Estela", "123.456.789-10", "amo meu irmão");

        String acao1 = "Dei um PS5 pro meu irmão lindo";
        String acao2 = "Dei um MAC Mini para meu irmão lindo";
        String acao3 = "Dei um carro para meu irmão lindo";


        Materias geografiaEstela = new Materias("Geografia", 10.0, 7.0, 6.0);
        Materias historiaEstela = new Materias("Historia", 8.5, 6.0, 7.0);
        Materias matematicaEstela = new Materias("Geografia", 10.0, 8.0, 5.0);

        testeMeninoBom.adicionarBoasAcoes(acao1);
        testeMeninoBom.adicionarBoasAcoes(acao2);
        testeMeninoBom.adicionarBoasAcoes(acao3);

        testeMeninoBom.adicionarNotas(geografiaEstela);
        testeMeninoBom.adicionarNotas(historiaEstela);
        testeMeninoBom.adicionarNotas(matematicaEstela);



        System.out.println(noelTeste);
        System.out.println(testeMeninoBom);


    }
}