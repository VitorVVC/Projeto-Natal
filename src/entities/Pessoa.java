package entities;

import java.util.ArrayList;

import static entities.BonsMeninos.*;

public abstract class Pessoa {

    protected String name;

    protected String email;
    protected String cpf;
    protected String senha;

    protected ArrayList<String> presentes = new ArrayList<>();

    public Pessoa(String name, String email, String cpf, String senha) {
        this.name = name;
        this.email = email;
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
                for (int j = 0; j < presentes.size(); j++) {
                    if (presentes.get(j).equalsIgnoreCase(presente)) {
                        presentes.remove(presente);
                    }
                }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPresentes(ArrayList<String> presentes) {
        this.presentes = presentes;
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
