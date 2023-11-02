package entities;

import java.util.ArrayList;

public class BonsMeninos extends Pessoa {

    ArrayList<Acoes> boasAcoes = new ArrayList<>();

    ArrayList<Materias> notas = new ArrayList<>();

    public BonsMeninos(String name, String cpf, String senha) {
        super(name, cpf, senha);
    }


    public void adicionarBoasAcoes(Acoes acoes) {
        boasAcoes.add(acoes);
    }

    public void removerBoasAcoes(Acoes acoes) {
        for (int i = 0; i < boasAcoes.size(); i++) {
            if (boasAcoes.get(i).getAcao().equalsIgnoreCase(acoes.getAcao())) {
                boasAcoes.remove(acoes);
            }
        }
    }

    public void adicionarNotas(Materias materia) {
        notas.add(materia);
    }

    public void removerNotas(Materias materia) {
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).getMaterias().equals(materia.getMaterias())) {
                notas.remove(materia);
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parabéns ");
        sb.append(getName());
        sb.append("!! Você foi uma criancinha fantástica este ano e para comprovar isso olhe suas notas: \n");
        for (int j = 0; j < notas.size(); j++) {
            double tempAV1 = notas.get(j).getAv1();
            double tempAV2 = notas.get(j).getAv1();
            if (notas.get(j).podeIrParaAv3(tempAV1, tempAV2)) {
                sb.append("Que incrivel observe suas otimas notas em " + notas.get(j).getMaterias() + "\n");
                sb.append("=======================\n");
                sb.append("Matéria: " + notas.get(j).getMaterias() + "\n");
                sb.append("Primeira Nota: " + notas.get(j).getAv1() + "\n");
                sb.append("Segunda Nota: " + notas.get(j).getAv2() + "\n");
                sb.append("Terceira Nota: " + notas.get(j).getAv3() + "\n");
                sb.append("Status Para Ultima: " + notas.get(j).getStatus() + "\n");
                sb.append("=======================\n");
            } else {
                sb.append("Um dos motivos para ter sido classificada como uma criança má foi suas notas em " + notas.get(j).getMaterias() + "...\n");
                sb.append("=======================\n");
                sb.append("Matéria: " + notas.get(j).getMaterias() + "\n");
                sb.append("Primeira Nota: " + notas.get(j).getAv1() + "\n");
                sb.append("Segunda Nota: " + notas.get(j).getAv2() + "\n");
                sb.append("Terceira Nota: " + notas.get(j).getAv3() + "\n");
                sb.append("Status Para Ultima: " + notas.get(j).getStatus() + "\n");
                sb.append("=======================\n");
            }
        }
        return sb.toString();
    }
}
