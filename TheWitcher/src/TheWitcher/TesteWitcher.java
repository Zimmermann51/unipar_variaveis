package TheWitcher;

public class TesteWitcher {
    public static void main(String[] args) {
        Arma espada = new Arma("Espada de Prata", "Boa para monstros", 50);
        Witcher geralt = new Witcher("Geralt de Rivia", 20, 500, 80, 70, 50, espada);

        Monstro grifo = new Monstro("Grifo", 15, 60);
        Humano bandido = new Humano("Bandido", 10, espada);

        geralt.atacar(grifo);
        grifo.atacar(geralt);

        geralt.atacar(bandido);
        bandido.atacar(geralt);

        Pocao pocaoVida = new Pocao("Poção de Vida", "Recupera vida", "Recuperar 100 de vida");
        System.out.println("Poção: " + pocaoVida.getNome() + ", Efeito: " + pocaoVida.getEfeito());
    }
}

