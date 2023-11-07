package entities;

import java.util.ArrayList;

public class MausMeninos extends Pessoa {
    // Classe mausMeninos que fora herdar os métodos de uma pessoa normal tem uma lista de boas masAcoes e de notas. Para comprovar ser um crianca ma
    ArrayList<Acoes> masAcoes = new ArrayList<>();

    ArrayList<Materias> notas = new ArrayList<>();

    // Construtor padrão
    public MausMeninos(String name, String email, String cpf, String senha) {
        super(name, email, cpf, senha);
    }

    // Método para adicionar masAções
    public void adicionarMasAcoes(Acoes acoes) {
        masAcoes.add(acoes);
    }

    // Método para remover ações ruins
    public void removerBoasAcoes(Acoes acoes) {
        for (int i = 0; i < masAcoes.size(); i++) {
            if (masAcoes.get(i).getAcao().equalsIgnoreCase(acoes.getAcao())) {
                masAcoes.remove(acoes);
            }
        }
    }

    // Método para adicionar notas
    public void adicionarNotas(Materias materia) {
        notas.add(materia);
    }

    // Método para remover notas
    public void removerNotas(Materias materia) {
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).getMaterias().equals(materia.getMaterias())) {
                notas.remove(materia);
            }
        }
    }

    // Método para sobrescrever o print padrão e personaliza-lo para mau menino
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
            double tempAV1 = notas.get(j).getParcial();
            double tempAV2 = notas.get(j).getParcial();
            if (notas.get(j).podeIrParaAv3(tempAV1, tempAV2)) {
                sb.append("Que pena que mesmo com otimas notas em " + notas.get(j).getMaterias() + " você ainda assim não conseguiu ser uma boa criança\n");
                sb.append("=======================\n");
                sb.append("Matéria: " + notas.get(j).getMaterias() + "\n");
                sb.append("Nota Parcial: " + notas.get(j).getParcial() + "\n");
                sb.append("Nota Global: " + notas.get(j).getGlobal() + "\n");
                if (notas.get(j).getAvFinal()!= null) {
                    sb.append("Nota da Avaliação Final: " + notas.get(j).getAvFinal() + "\n");
                }
                sb.append("Status Para Ultima: " + notas.get(j).getStatus() + "\n");
                sb.append("=======================\n");
            } else {
                sb.append("Um dos motivos para ter sido classificada como uma criança má foi suas notas em " + notas.get(j).getMaterias() + "...\n");
                sb.append("=======================\n");
                sb.append("Matéria: " + notas.get(j).getMaterias() + "\n");
                sb.append("Nota Parcial: " + notas.get(j).getParcial() + "\n");
                sb.append("Nota Global: " + notas.get(j).getGlobal() + "\n");
                if (notas.get(j).getAvFinal()!= null) {
                    sb.append("Nota da Avaliação Final: " + notas.get(j).getAvFinal() + "\n");
                }
                sb.append("Status Para Ultima: " + notas.get(j).getStatus() + "\n");
                sb.append("=======================\n");
            }
        }
        return sb.toString();
    }

    // Get nas listas
    public ArrayList<Acoes> getMasAcoes() {
        return masAcoes;
    }

    public ArrayList<Materias> getNotas() {
        return notas;
    }
}
