package task14_1_MissedCallsTreeMapAndTreeSet;

import java.time.LocalDateTime;
import java.util.*;

public class MissedCalls {

    /*Для хранения пропущенных вызовов используем TreeMap,
    где ключ — время пропущенного вызова, а значение — номер телефона.
    Для хранения времени звонка тип данных LocalDateTime —
    у него уже определен метод compareTo для использования в коллекции TreeMap

*/
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(String inputMissedCall) {
        missedCalls.put(LocalDateTime.now(), inputMissedCall);

    }

    public void listMissedCalls(Map<String, Contact> contacts) {
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {


            if (!contacts.containsKey(entry.getValue())) {
                System.out.println(entry.getKey() + " --> " + entry.getValue());

            } else {
                System.out.println(entry.getKey() + " --> "
                        + entry.getValue() + " --> " + contacts.get(entry.getValue()));
            }

        }
    }


    public void cleanListMissedCalls() {
        missedCalls.clear();
        System.out.println("Пропущенные вызовы очищены: " + missedCalls);
    }

}

/*   Вывод всех пропущенных вызовов с указанием фамилии и имени.
Если контакта нет в списке контактов,
вывести только номер телефона;


 Нужно реализовать следующие public методы:

    Добавление пропущенного вызова.
    Возвращение списка пропущенных вызовов.
    Очистка списка пропущенных вызовов.*/