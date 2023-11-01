package entities;

import java.util.ArrayList;

public class BonsMeninos extends Pessoa {

    static ArrayList<String> boasAcoes = new ArrayList<>();

    static ArrayList<Materias> notas = new ArrayList<>();

    public BonsMeninos(String name, String cpf, String senha) {
        super(name, cpf, senha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parabéns ");
        sb.append(getName());
        sb.append("!! Você foi uma criancinha fantástica este ano e para comprovar isso olhe suas notas: \n");
        for (int i = 0; i < notas.size(); i++) {
            sb.append("=======================\n");
            sb.append("Matéria: " + notas.get(i).getName() + "\n");
            sb.append("Primeira Nota: " + notas.get(i).getAv1() + "\n");
            sb.append("Segunda Nota: " + notas.get(i).getAv2() + "\n");
            sb.append("Terceira Nota: " + notas.get(i).getAv3() + "\n");
            sb.append("=======================\n");
        }
        return sb.toString();
    }
}
