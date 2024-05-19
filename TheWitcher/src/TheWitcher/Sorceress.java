package TheWitcher;

public class Sorceress extends Personagem {
    private String feitiçoPrincipal;

    public Sorceress(String nome, int nivel, int vida, int forca, int agilidade, int inteligencia, String feitiçoPrincipal) {
        super(nome, nivel, vida, forca, agilidade, inteligencia);
        this.feitiçoPrincipal = feitiçoPrincipal;
    }

    public String getFeitiçoPrincipal() {
        return feitiçoPrincipal;
    }

    public void atacar(Entidade alvo) {
        int dano = getInteligencia() * 2;
        System.out.println(getNome() + " lança " + feitiçoPrincipal + " em " + alvo.getNome() + ", causando " + dano + " de dano.");
        if (alvo instanceof Personagem) {
            ((Personagem) alvo).receberDano(dano);
        }
    }
}
