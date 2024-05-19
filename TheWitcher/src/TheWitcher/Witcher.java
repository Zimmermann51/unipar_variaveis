package TheWitcher;

public class Witcher extends Personagem {
    private Arma arma;

    public Witcher(String nome, int nivel, int vida, int forca, int agilidade, int inteligencia, Arma arma) {
        super(nome, nivel, vida, forca, agilidade, inteligencia);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void atacar(Entidade alvo) {
        int dano = getForca() + arma.getDano();
        System.out.println(getNome() + " ataca " + alvo.getNome() + " com " + arma.getNome() + " causando " + dano + " de dano.");
        if (alvo instanceof Personagem) {
            ((Personagem) alvo).receberDano(dano);
        }
    }
}

