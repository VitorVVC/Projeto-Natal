package entities;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Noel extends Pessoa {

    // Fora os métodos já herdados da classe pessoa adiciona-se para o Noel a quantidade de renas e o tamanho de sua barba.
    private int quantidadeDeRenas;

    private double tamanhoBarba;

    // Fora duas listas de bons e maus meninos que ele terá
    ArrayList<Pessoa> bonsMeninos = new ArrayList<>();
    ArrayList<Pessoa> mausMeninos = new ArrayList<>();

    // Construtor que recebe atributos da classe mãe, renas e tamanho de barab
    public Noel(String name, String email, String cpf, String senha, int quantidadeDeRenas, double tamanhoBarba) {
        super(name, email, cpf, senha);
        this.quantidadeDeRenas = confereRenas(quantidadeDeRenas);
        this.tamanhoBarba = confereBarba(tamanhoBarba);
    }

    // No método de adicionar pessoa ai sim. E nessa situação precisará passar para o progama todas as informações em uma lista de pessoa
    public void adicionarBomMenino(Pessoa pessoa) {
        bonsMeninos.add(pessoa);
    }

    // No método de remoção de bons meninos pede-se o CPF pois podem exisitir N tipo de nomes similares, enquanto o CPF sempre é unico.
    public void removerBomMenino(String CPF) {
        for (int i = 0; i < bonsMeninos.size(); i++) {
            if (bonsMeninos.get(i).getCpf().equalsIgnoreCase(CPF)) {
                bonsMeninos.remove(bonsMeninos.get(i));
            } else {
                throw new RuntimeException("Forneça o CPF do usuário que deseja remover.");
            }
        }
    }
    // No método de adicionar pessoa ai sim. E nessa situação precisará passar para o progama todas as informações em uma lista de pessoa
    public void adicionarMauMenino(Pessoa pessoa) {
        mausMeninos.add(pessoa);
    }

    // No método de remoção de bons meninos pede-se o CPF pois podem exisitir N tipo de nomes similares, enquanto o CPF sempre é unico.
    public void removerMauMenino(String CPF) {
        for (int i = 0; i < mausMeninos.size(); i++) {
            if (mausMeninos.get(i).getCpf().equalsIgnoreCase(CPF)) {
                mausMeninos.remove(mausMeninos.get(i));
            } else {
                throw new RuntimeException("Forneça o CPF do usuário que deseja remover.");
            }
        }
    }

    // Método confere Renas para garantir que tenha ao menos duas renas
    private int confereRenas(int quantidadeDeRenas) {
        if (quantidadeDeRenas < 2) {
            throw new InputMismatchException("Você não pode ter esse valor de renas.");
        }
        return quantidadeDeRenas;
    }

    // Método para conferir a barba do papai noel e garantir que ele terá barba o bastante para ser noel
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

    // Método para printas informações relevantes do noel
    @Override
    public String toString() {
        System.out.println("===========================================");
        return String.format("O papai noel chama-se: %s%nPossue em seu treno %d renas para leva-lo ao mundo inteiro%nE também possue incriveis %.2f centimetros de barba !!", getName(), quantidadeDeRenas, tamanhoBarba);
    }


    // Gets & Setters do noel
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
