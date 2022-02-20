package task8_2_taskFromAccountants.taxType;

public class IncomeTaxType extends TaxType {
   @Override //класс подоходный налог
   public double calculateTaxFor(double amount) {
        // считаем Подоходный налог, = 13%
        return (amount * 0.13);
    }
}