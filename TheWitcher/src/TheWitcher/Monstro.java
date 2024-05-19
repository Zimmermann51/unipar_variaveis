package TheWitcher;

public class Monstro extends Inimigo {
    private int forca;

    public Monstro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void atacar(Personagem personagem) {
        int dano = forca * 2;
        System.out.println(getNome() + " ataca " + personagem.getNome() + " com força bruta, causando " + dano + " de dano.");
        personagem.receberDano(dano);
    }
}

