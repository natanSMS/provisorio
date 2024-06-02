package carta;

public abstract class Carta {
    protected String nome;
    protected boolean revelada;

    public Carta(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println(String.format(
            """
            Nome: %s,
            Revelada: %s,
            """,
            nome,
            revelada
        ));
    }

    public abstract void realizarAcao();
}
