package entities;

import entitiesEnum.Etapa;
import entitiesEnum.MateriasEnum;
import entitiesEnum.Status;

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
    public Materias(MateriasEnum materias, double parcial, double global) {
        this.materias = materias;
        // Valida as duas primeiras notas
        this.parcial = validarDouble(parcial);
        this.global = validarDouble(global);
        // Se for possivel continuar o percusso pelo colégio ele está "aprovado"
        if (podeIrParaAv3(parcial, global)) {
            this.status = Status.APROVADO;
        } else {
            // Se não está em uma breve recuperacao, sujeito a um teste para repor sua menor nota pela nova nota "avfinal"
            this.status = Status.RECUPERACAO;
        }
    }
    // Método para substituir uma nota caso a mesma seja abaixo de 7 - No colegio onde minha irmã estuda existe o calculo para saber se sua
    // nota na matéria é o bastante para passar. Aqui vai a sua formula ( E = Etapa ) - Nota da E = Parcial + Global
    // ( 1xE1 + 2xE2 + 3xE3 + 4xE4 ) / 10 > 7 == Aprovado; Se a condicao anterior for "false" é recuperação


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
