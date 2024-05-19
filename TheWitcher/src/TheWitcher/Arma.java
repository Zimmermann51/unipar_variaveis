package TheWitcher;

public class Arma extends Item {
    private int dano;

    public Arma(String nome, String descricao, int dano) {
        super(nome, descricao);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }
}

