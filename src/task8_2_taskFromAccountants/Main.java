package task8_2_taskFromAccountants;

import task8_2_taskFromAccountants.taxType.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Задача 2. Задача от бухгалтеров \n → Создание нескольких счетов и расчет налогов для них.");

    TaxService taxService = new TaxService();
    Bill[] payments = new Bill[] {
        // TODO создать платежи с различным типами налогообложения
            new Bill(12000.44,new IncomeTaxType(), new TaxService()),
            new Bill(234000.77,new TaxType(), new TaxService()),
            new Bill(234000.04,new VATaxType(), new TaxService()),
            new Bill(200700.40,new ProgressiveTaxType(), new TaxService()),
            new Bill(123000.24,new IncomeTaxType(), new TaxService()),
            new Bill(334000.47,new TaxType(), new TaxService()),
            new Bill(4000.14,new VATaxType(), new TaxService()),
            new Bill(26700.30,new ProgressiveTaxType(), new TaxService()),
    };

    for (int i = 0; i < payments.length; ++i) {
        Bill bill = payments[i];
        bill.payTaxes();
    }
  }
}