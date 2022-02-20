package task8_2_taskFromAccountants.taxType;

public class VATaxType extends TaxType {
   @Override //класс ндс 18процентов
   public double calculateTaxFor(double amount) {
        // считаем НДС = 18%
        return (amount * 0.18);
    }
}