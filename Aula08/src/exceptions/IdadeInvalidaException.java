package exceptions;

public class IdadeInvalidaException extends Exception{
    public IdadeInvalidaException() {
        super("Idade nao pode ser negativa");
    }

}
