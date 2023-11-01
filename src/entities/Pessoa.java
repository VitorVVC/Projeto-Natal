package entities;

import java.util.ArrayList;

import static entities.BonsMeninos.*;

public abstract class Pessoa {

    private String name;
    private String cpf;
    private String senha;

    ArrayList<String> presentes = new ArrayList<>();

    public Pessoa(String name, String cpf, String senha) {
        this.name = name;
        this.cpf = cpf;
        this.senha = senha;
    }

    public abstract String toString();
    public void adicionarPresentes(String presente) {
        presentes.add(presente);
    }

    public void removerPresentes(String name, String presente) {
        for (int i = 0; i < presentes.size(); i++) {
            if (presentes.get(i).equalsIgnoreCase(name)) {
                for (int j = 0; j < presentes.size(); i++) {
                    if (presentes.get(j).equalsIgnoreCase(presente)) {
                        presentes.remove(presente);
                    }
                }
            }
        }
    }

    public void adicionarBoasAcoes(String acoes) {
        boasAcoes.add(acoes);
    }

    public void removerBoasAcoes(String acoes) {
        for (int i = 0; i < boasAcoes.size(); i++) {
            if (boasAcoes.get(i).equalsIgnoreCase(acoes)) {
                boasAcoes.remove(acoes);
            }
        }
    }

    public void adicionarNotas(Materias materia) {
        notas.add(materia);
    }

    public void removerNotas(Materias materia) {
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).getName().equalsIgnoreCase(materia.getName())) {
                boasAcoes.remove(materia);
            }
        }
    }
    public static double validarDouble(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Não pode instanciar este valor com numeros negativos.");
        }
        return valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<String> getPresentes() {
        return presentes;
    }
}
