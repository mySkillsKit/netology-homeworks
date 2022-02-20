package task9_2_BankAccountAbstractionAndInterface;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 2. Банковские счета\n 'Абстракция'");

        //Создайте три переменные типа Account
        // и присвойте им три разных типа счетов.

        Account checkingAccount = new CheckingAccount(22000, "Расчетный счет");
        Account creditAccount = new CreditAccount(0, "Кредитный счет"); // -100000 от 0 руб
        Account savingsAccount = new SavingsAccount(360000, "Сберегательный счет");

        System.out.println("Баланс средств на счетах");
        System.out.println(checkingAccount);
        System.out.println(creditAccount);
        System.out.println(savingsAccount);
        System.out.println();

        //Транзакции

        checkingAccount.pay(2000);
        creditAccount.pay(20000);
        savingsAccount.pay(10000);

        checkingAccount.addMoney(150000);
        creditAccount.addMoney(3500);
        savingsAccount.addMoney(35000);


        checkingAccount.transfer(savingsAccount, 25000);
        creditAccount.transfer(savingsAccount, 50000);
        savingsAccount.transfer(checkingAccount, 5000);
        savingsAccount.transfer(creditAccount, 110000);
        savingsAccount.transfer(checkingAccount, 100000);
        checkingAccount.transfer(creditAccount, 25000);
        creditAccount.transfer(savingsAccount, 120000);


        System.out.println("Баланс средств на счетах после транзакций");
        System.out.println(checkingAccount);
        System.out.println(creditAccount);
        System.out.println(savingsAccount);
        System.out.println();


    }
}
