package entities;

public class Acoes {

    // Classe ação que foi criada apenas para poder instanciar uma lista de ações de forma mais organizada
    private String acao;

    // Construtor
    public Acoes(String acao) {
        this.acao = acao;
    }

    // Get & Set
    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
}
