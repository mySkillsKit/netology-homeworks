package task10_2_ValidationOfReadEventsExceptionAndStacktrace;

import java.util.Arrays;

public class Main {

    public static Movie[] getMovies () {
        return new Movie[] {
                new Movie("Начало", 2010, 16),
               // new Movie("Дюна", 2011, 18),
                new Movie(null, 2011, 18),
                new Movie("Ну погоди", 2018, 3),
                new Movie("Приключения шурика", 2008, 16),
                new Movie("Хищник", 2018, 18)

        };
    }

    public static Theatre[] getTheatres () {
        return new Theatre[] {
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Руслан и Людмила", 2007, 18),
                new Theatre("Ревизор", 2012, 16),
                new Theatre("Евгений Онегин", 2021, 16)

        };
    }

    public static void main(String[] args) throws RuntimeException {
        System.out.println("Задача 2. Валидация прочитанных событий\n" +
                "<Исключения и stacktrace>");
        System.out.println(Arrays.toString(getMovies()));
        System.out.println(Arrays.toString(getTheatres()));

        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");

    }

    //Если хоть одно из полей не заполнено, нужно выбросить исключение throw new RuntimeException
    public static void validEvent(Event event) throws RuntimeException {

        if (event.getTitle() == null || event.getReleaseYear() == 0 ||event.getAge() == 0) {
            throw new RuntimeException();
        }

    }

}











