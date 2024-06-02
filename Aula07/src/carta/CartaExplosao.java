package carta;

public final class CartaExplosao extends Carta {
    public void exibirInformacoes() {
        System.out.println(String.format(
            """
            Nome: %s,
            Revelada: %s,
            Funcao: explodir jogador
            """,
            super.nome,
            super.revelada
        ));
    }

    public void exibirInformacoes(boolean chamarMae) {
        if(chamarMae) {
            super.exibirInformacoes();
        } else {
            this.exibirInformacoes();
        }
    }

    @Override
    public void realizarAcao() {
        System.out.println("O jogador explodiu!")
    }
}
