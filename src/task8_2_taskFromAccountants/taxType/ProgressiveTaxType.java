package task8_2_taskFromAccountants.taxType;

public class ProgressiveTaxType extends TaxType {
   // класс Прогрессивный налог
   @Override
   public double calculateTaxFor(double amount) {
        // считаем Прогрессивный налог, до 100 тысяч = 10%, больше 100 тысяч = 15%
        return (amount < 100000.00 ? (amount * 0.10) : (amount * 0.15));
    }
}