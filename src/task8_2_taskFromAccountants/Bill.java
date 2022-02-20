package task8_2_taskFromAccountants;

import task8_2_taskFromAccountants.taxType.TaxType;

public class Bill {
  // Класс счета
    private double amount; // сумма
    private TaxType taxType; // Тип налога
    private TaxService taxService; // налоговая служба
    
    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

   public void payTaxes() {
        // считаем размер налога исходя из TaxType
        double taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}
