package entities;

import entitiesEnum.Etapa;
import entitiesEnum.MateriasEnum;
import entitiesEnum.Status;

import static application.Util.sc;
import static entities.Pessoa.validarDouble;

public class Materias {
    // Classe materias que são materias escolares.
    // Comecei a reescrever a classe considerando o método avaliativo de onde minha irmã estuda ( 7 De Setembro )

    // Atributos "obrigatórios"
    private MateriasEnum materias;
    private Etapa etapa;
    private double parcial;
    private double global;

    // Atributos "extras"
    private Double avFinal;
    private Status status;

    // Construtor que recebe uma materia e suas notas do semestre
    public Materias(MateriasEnum materias, Etapa etapa, double parcial, double global) {
        this.materias = materias;
        this.parcial = validarDouble(parcial);
        this.global = validarDouble(global);
        this.etapa = etapa;
    }
    // Método para substituir uma nota caso a mesma seja abaixo de 7 - No colegio onde minha irmã estuda existe o calculo para saber se sua
    // nota na matéria é o bastante para passar. Aqui vai a sua formula ( E = Etapa ) - Nota da E = Parcial + Global
    // ( 1xE1 + 2xE2 + 3xE3 + 4xE4 ) / 10 > 7 == Aprovado; Se a condicao anterior for "false" é recuperação

    public double calculaFinal(Materias materia) {
        Double mediaFinal = null;

        Double resultadoEtapaUM = null;
        Double resultadoEtapaDOIS = null;
        Double resultadoEtapaTRES = null;
        Double resultadoEtapaQUATRO = null;

        if (materia.getEtapa().equals("PRIMEIRA")) {
            resultadoEtapaUM = (materia.getParcial() + materia.getGlobal()) * 1;
        } else if (materia.getEtapa().equals("SEGUNDA")) {
            resultadoEtapaDOIS = (materia.getParcial() + materia.getGlobal()) * 2;
        } else if (materia.getEtapa().equals("TERCEIRA")) {
            resultadoEtapaTRES = (materia.getParcial() + materia.getGlobal()) * 3;
        } else if (materia.getEtapa().equals("QUARTA")) {
            resultadoEtapaQUATRO = (materia.getParcial() + materia.getGlobal()) * 4;
        }
        mediaFinal = (resultadoEtapaUM + resultadoEtapaDOIS + resultadoEtapaTRES + resultadoEtapaQUATRO) / 10;
        try {
            if (mediaFinal >= 7) {
                this.status = Status.APROVADO;
            } else if (mediaFinal > 0 && mediaFinal < 7) {
                this.status = Status.RECUPERACAO;
                repondoNota(materia);
            }
        } catch (Exception exception) {
            System.out.println("ERROR: " + exception.getMessage());
        }

        return mediaFinal;
    }

    public void repondoNota(Materias materias) {
        if (status.equals("RECUPERACAO")) {
            if ((materias.getParcial() + materias.getGlobal()) / 2 < 7) {
                System.out.println("Você tera de repor a sua média na materia" + materias.getMaterias() + ", por favor a seguir informe qual a sua nota final após refazer os testes: ");
                System.out.println("Nota: ");
                Double novaMedia = validarDouble(sc.nextDouble());
            }
        }

    }


    // Calculo de sim ou não para retornar se o aluno esta apto para ir ou não à prova final
    public boolean podeIrParaAv3(double av1, double av2) {
        if ((av1 + av2) / 2 < 7.0) {
            return false;

        }
        return true;
    }

    // Gets e sets

    public MateriasEnum getMaterias() {
        return materias;
    }

    public void setMaterias(MateriasEnum materias) {
        this.materias = materias;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

    public double getParcial() {
        return parcial;
    }

    public void setParcial(double parcial) {
        this.parcial = parcial;
    }

    public double getGlobal() {
        return global;
    }

    public void setGlobal(double global) {
        this.global = global;
    }

    public Double getAvFinal() {
        return avFinal;
    }

    public void setAvFinal(Double avFinal) {
        this.avFinal = avFinal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
