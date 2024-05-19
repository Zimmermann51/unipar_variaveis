package TheWitcher;

public class Humano extends Inimigo {
    private Arma arma;

    public Humano(String nome, int nivel, Arma arma) {
        super(nome, nivel);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void atacar(Personagem personagem) {
        int dano = arma.getDano();
        System.out.println(getNome() + " ataca " + personagem.getNome() + " com " + arma.getNome() + ", causando " + dano + " de dano.");
        personagem.receberDano(dano);
    }
}
