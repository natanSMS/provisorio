public class Usuario {
    private String nome;
    private int idade;

    public usuario(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return this.nome
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if(!nome.isblank()) {
            this.nome = nome;
        } else {
            throws new NomeInvalidoException();
        }
    }

    public int getIdade() {
        return this.idade
    }

    public void setIdade(int idade) throws IdadeInvalidaException {
        if(idade >= 0) {
            this.idade = idade;
        } else {
            throws new IdadeInvalidaException();
        }
    }
}
