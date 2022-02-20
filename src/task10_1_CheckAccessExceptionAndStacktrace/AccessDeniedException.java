package task10_1_CheckAccessExceptionAndStacktrace;

public class AccessDeniedException extends Exception {
    //Выбрасывать ошибку AccessDeniedException, если возраст пользователя меньше 18 лет;
    public AccessDeniedException(String message) {
        super(message);
    }

}
