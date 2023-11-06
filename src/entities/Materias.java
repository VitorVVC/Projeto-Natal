package entities;

import entitiesEnum.MateriasEnum;
import entitiesEnum.Status;

import static entities.Pessoa.validarDouble;

public class Materias {
    // Classe materias que são materias escolares.
    // Recebendo uma classe enum de máterias até o 4 ano do fundamental, notas da primeira, segunda, terceira prova e uma classe enum de status
    private MateriasEnum materias;
    private double av1;
    private double av2;
    private double av3;
    private Status status;

    // Construtor que recebe uma materia e suas notas do semestre
    public Materias(MateriasEnum materias, double av1, double av2, double av3) {
        this.materias = materias;
        // Valida as duas primeiras notas
        this.av1 = validarDouble(av1);
        this.av2 = validarDouble(av2);
        // Se for possivel ir para a av3. Atribuir o status aprovado e que a nota e a nota de av3 antes  escrita
        if (podeIrParaAv3(av1, av2)) {
            this.av3 = validarDouble(av3);
            this.status = Status.APROVADO;
        } else {
            this.status = Status.RECUPERACAO;
        }
    }

    // Calculo de sim ou não para retornar se o aluno esta apto para ir ou não à prova final
    public boolean podeIrParaAv3(double av1, double av2) {
        if ((av1 + av2) / 2 < 7.0) {
            return false;
        }
        return true;
    }

    // Método para "fazer" a recuperação
    public boolean recuperacao(double av4) {
        validarDouble(av4);
        if (podeIrParaAv3(getAv1(), getAv2())) {
            throw new RuntimeException("Você já passou, não precisa ir para recuperação");
        } else {
            if (av4 >= 7 && av4 <= 10) {
                this.status = Status.APROVADO;
                return true;
            } else {
                this.status = Status.REPROVADO;
                return false;
            }
        }
    }

    // Gets e sets
    public MateriasEnum getMaterias() {
        return materias;
    }

    public void setMaterias(MateriasEnum materias) {
        this.materias = materias;
    }

    public double getAv1() {
        return av1;
    }

    public void setAv1(double av1) {
        this.av1 = av1;
    }

    public double getAv2() {
        return av2;
    }

    public void setAv2(double av2) {
        this.av2 = av2;
    }

    public double getAv3() {
        return av3;
    }

    public void setAv3(double av3) {
        this.av3 = av3;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
