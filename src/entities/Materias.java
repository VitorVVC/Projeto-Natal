package entities;

import java.util.InputMismatchException;

import static entities.Pessoa.validarDouble;

public class Materias {

    private String name;
    private double av1;
    private double av2;
    private double av3;

    public Materias(String name, double av1, double av2, double av3) {
        this.name = name;
        this.av1 = validarDouble(av1);
        this.av2 = validarDouble(av2);
        if (podeIrParaAv3(av1, av2)) {
            this.av3 = validarDouble(av3);
        }
    }

    private boolean podeIrParaAv3(double av1, double av2) {
        if ((av1 + av2) / 2 < 7.0) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
