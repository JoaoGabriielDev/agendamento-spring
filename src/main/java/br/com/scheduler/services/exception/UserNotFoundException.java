package br.com.scheduler.services.exception;

public class UserNotFoundException extends NotFoundException{
    public UserNotFoundException() {
        super("Usuário não encontrado");
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
