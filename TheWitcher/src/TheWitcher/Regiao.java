package TheWitcher;

public abstract class Regiao {
    private String nome;
    private String clima;

    public Regiao(String nome, String clima) {
        this.nome = nome;
        this.clima = clima;
    }

    public String getNome() {
        return nome;
    }

    public String getClima() {
        return clima;
    }
}

