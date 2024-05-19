package TheWitcher;

public abstract class Item extends Entidade {
    private String descricao;

    public Item(String nome, String descricao) {
        super(nome);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

