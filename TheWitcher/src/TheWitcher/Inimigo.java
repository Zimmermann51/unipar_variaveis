package TheWitcher;

public abstract class Inimigo extends Entidade {
    private int nivel;

    public Inimigo(String nome, int nivel) {
        super(nome);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public abstract void atacar(Personagem personagem);
}

