package task10_1_CheckAccessExceptionAndStacktrace;

public class UserNotFoundException extends Exception {
    //Выбрасывать ошибку UserNotFoundException, если логин или пароль введены не верно
    public UserNotFoundException(String message) {
        super(message);

    }
}