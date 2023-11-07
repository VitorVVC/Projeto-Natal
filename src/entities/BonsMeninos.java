package entities;

import java.util.ArrayList;

public class BonsMeninos extends Pessoa {
    // Classe bonsMeninos que fora herdar os métodos de uma pessoa normal tem uma lista de boas acoes e de notas. Para comprovar ser um bom menino

    ArrayList<Acoes> boasAcoes = new ArrayList<>();

    ArrayList<Materias> notas = new ArrayList<>();

    // Construtor padrão da classe mãe
    public BonsMeninos(String name, String email, String cpf, String senha) {
        super(name, email, cpf, senha);
    }
    // Método para adicionar boas acoes
    public void adicionarBoasAcoes(Acoes acoes) {
        boasAcoes.add(acoes);
    }
    // Método para remover ações boas
    public void removerBoasAcoes(Acoes acoes) {
        for (int i = 0; i < boasAcoes.size(); i++) {
            if (boasAcoes.get(i).getAcao().equalsIgnoreCase(acoes.getAcao())) {
                boasAcoes.remove(acoes);
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
    // Método sobrescrevendo o print padrão que possui personalização referente as notas do individuo e suas boas ações
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parabéns ");
        sb.append(getName());
        sb.append("!! Você foi uma criancinha fantástica este ano e para comprovar isso olhe suas notas: \n");
        for (int j = 0; j < notas.size(); j++) {
            double tempAV1 = notas.get(j).getParcial();
            double tempAV2 = notas.get(j).getParcial();
            if (notas.get(j).podeIrParaAv3(tempAV1, tempAV2)) {
                sb.append("Que incrivel observe suas otimas notas em " + notas.get(j).getMaterias() + "\n");
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
    public ArrayList<Acoes> getBoasAcoes() {
        return boasAcoes;
    }

    public ArrayList<Materias> getNotas() {
        return notas;
    }
}
