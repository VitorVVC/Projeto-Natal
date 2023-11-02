package entities;

import java.util.ArrayList;

public class MausMeninos extends Pessoa {


    ArrayList<Acoes> masAcoes = new ArrayList<>();

    ArrayList<Materias> notas = new ArrayList<>();

    public MausMeninos(String name, String cpf, String senha) {
        super(name, cpf, senha);
    }


    public void adicionarMasAcoes(Acoes acoes) {
        masAcoes.add(acoes);
    }

    public void removerBoasAcoes(String acoes) {
        for (int i = 0; i < masAcoes.size(); i++) {
            if (masAcoes.get(i).equals(acoes)) {
                masAcoes.remove(acoes);
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
        sb.append("Sinto muito ");
        sb.append(getName());
        sb.append(" mas você foi uma criança muito má este ano...");
        sb.append(" Para entender este recado do papai noel olhe as suas ações ao decorrer deste ano:  \n");
        for (int i = 0; i < masAcoes.size(); i++) {
            sb.append("=======================\n");
            sb.append("Má ação numero [ " + (i + 1) + " ]:" + "\n");
            sb.append(masAcoes.get(i).getAcao() + "\n");
        }
        sb.append("=======================\n");
        for (int j = 0; j < notas.size(); j++) {
            double tempAV1 = notas.get(j).getAv1();
            double tempAV2 = notas.get(j).getAv1();
            if (notas.get(j).podeIrParaAv3(tempAV1, tempAV2)) {
                sb.append("Que pena que mesmo com otimas notas em " + notas.get(j).getMaterias() + " você ainda assim não conseguiu ser uma boa criança\n");
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
