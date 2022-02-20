package BigDecimalAndBigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalAndBigInteger {

    public static void main(String[] args) {

        double x = 0.1;
        double z = 0.2;
        System.out.println(x+z);

        //Создать BigDecimal из числа типа double просто:
        BigDecimal a = new BigDecimal(x);
        // Можно создать из строки:
        BigDecimal b = new BigDecimal("0.2");

        /* Чтобы задать количество цифр после запятой, используйте метод setScale().
         Хорошей практикой является одновременное указание вместе с масштабом
         режима округления с помощью setScale(scale, roundingMode).
         Режим округления задаёт правило округления числа. */

        //Log.i(TAG, a.setScale(0, BigDecimal.ROUND_HALF_EVEN).toString());// => 2



        // a.setScale(2);
        // bigDecimal2.setScale(2);



        // System.out.println(a);

// BigInteger
//Найти наибольшее число из двух при помощи метода max().
        BigInteger firstNumber, secondNumber, maxNumber;
        firstNumber = new BigInteger("900");
        secondNumber = new BigInteger("102");
        maxNumber = firstNumber.max(secondNumber);
        System.out.println("The maximum value between " + firstNumber + " and " + secondNumber + " is " + maxNumber);







    }
}
