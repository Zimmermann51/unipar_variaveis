package TheWitcher;

public class Pocao extends Item {
    private String efeito;

    public Pocao(String nome, String descricao, String efeito) {
        super(nome, descricao);
        this.efeito = efeito;
    }

    public String getEfeito() {
        return efeito;
    }
}

