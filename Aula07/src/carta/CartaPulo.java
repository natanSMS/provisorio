package carta;

public final class CartaPulo extends Carta {
    public void exibirInformacoes() {
        System.out.println(String.format(
            """
            Nome: %s,
            Revelada: %s,
            Funcao: pular a vez
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
        System.out.println("O jogador pulou a vez!")
    }
}
