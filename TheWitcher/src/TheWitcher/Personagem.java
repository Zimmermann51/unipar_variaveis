package TheWitcher;

public abstract class Personagem extends Entidade {
    private int nivel;
    private int vida;
    private int forca;
    private int agilidade;
    private int inteligencia;

    public Personagem(String nome, int nivel, int vida, int forca, int agilidade, int inteligencia) {
        super(nome);
        this.nivel = nivel;
        this.vida = vida;
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public abstract void atacar(Entidade alvo);
}
