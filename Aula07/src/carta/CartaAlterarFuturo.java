package carta;

public final class CartaAlterarFuturo extends Carta {
    public void exibirInformacoes() {
        System.out.println(String.format(
            """
            Nome: %s,
            Revelada: %s,
            Funcao: alterar as 3 primeiras cartas do baralho
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
        System.out.println("3 proximas cartas alteradas!")
    }
}
