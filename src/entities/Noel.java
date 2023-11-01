package entities;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Noel extends Pessoa {

    private int quantidadeDeRenas;

    private double tamanhoBarba;

    ArrayList<Pessoa> bonsMeninos = new ArrayList<>();
    ArrayList<Pessoa> mausMeninos = new ArrayList<>();


    public Noel(String name, String cpf, String senha, int quantidadeDeRenas, double tamanhoBarba) {
        super(name, cpf, senha);
        this.quantidadeDeRenas = confereRenas(quantidadeDeRenas);
        this.tamanhoBarba = confereBarba(tamanhoBarba);
    }

    public void adicionarBomMenino(Pessoa pessoa) {
        bonsMeninos.add(pessoa);
    }

    public void removerBomMenino(String CPF) {
        for (int i = 0; i < bonsMeninos.size(); i++) {
            if (bonsMeninos.get(i).getCpf().equalsIgnoreCase(CPF)) {
                bonsMeninos.remove(bonsMeninos.get(i));
            }
        }
    }

    private int confereRenas(int quantidadeDeRenas) {
        if (quantidadeDeRenas < 0) {
            throw new InputMismatchException("Você não pode ter esse valor de renas.");
        }
        return quantidadeDeRenas;
    }

    private double confereBarba(double barba) {
        if (barba <= 0) {
            throw new InputMismatchException("Você não pode ser papai noel com nenhuma barba");
        } else if (barba < 40) {
            throw new InputMismatchException("Você ainda não é digno de ser papai noel.");
        } else {
            this.tamanhoBarba = barba;
        }
        return tamanhoBarba;
    }

    @Override
    public String toString() {
        return String.format("O papai noel chama-se: %s%nPossue em seu treno %d renas para leva-lo ao mundo inteiro%nE também possue incriveis %.2f centimetros de barba !!",getName(),quantidadeDeRenas,tamanhoBarba);
    }


    public int getQuantidadeDeRenas() {
        return quantidadeDeRenas;
    }

    public void setQuantidadeDeRenas(int quantidadeDeRenas) {
        this.quantidadeDeRenas = quantidadeDeRenas;
    }

    public double getTamanhoBarba() {
        return tamanhoBarba;
    }

    public void setTamanhoBarba(double tamanhoBarba) {
        this.tamanhoBarba = tamanhoBarba;
    }

    public ArrayList<Pessoa> getBonsMeninos() {
        return bonsMeninos;
    }

    public ArrayList<Pessoa> getMausMeninos() {
        return mausMeninos;
    }
}
