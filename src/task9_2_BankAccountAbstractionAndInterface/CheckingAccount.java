package task9_2_BankAccountAbstractionAndInterface;

public class CheckingAccount extends Account {


    public CheckingAccount(int amount, String nameAcount) {
        super(amount, nameAcount);
    }
    //Расчетный счет может выполнять все три операции,
    // но не может уходить в минус.

    @Override
    public void pay(int amount) {

        totalAmount = (getAmount() - amount); // считаем баланс счета getAmount после оплаты amount

        if (totalAmount >= 0) {

            setAmount(totalAmount); // устанавливаем новый баланс счета после оплаты

            System.out.println("Оплата в размере " + amount +
                    "руб. с Расчетного счета прошла успешно!");

        } else {

            System.out.println("У Вас недостаточно средств на Расчетном счету. " +
                    "\n Сумма покупки " + amount + "руб. Пополните ваш баланс!");
        }

        System.out.println(toString());
        System.out.println();

    }

    @Override
    public void transfer(Account account, int amount) {
        totalAmount = (getAmount() - amount); // считаем баланс счета getAmount после перевода суммы amount

        if (totalAmount >= 0) {

            if (account.getClass().getSimpleName().equals("CreditAccount")) {
                // на кредитный счет нельзя переводить если сумма после перевода будет больше 0

                if ((account.getAmount() + amount) > 0) {

                    System.out.println("Отмена операции! На Кредитном счету Вы не может иметь положительный баланс.\n" +
                            "Сумма пополнения " + amount + "руб.\n Кредитный лимит "
                            + creditLimit + "руб. Уменьшите сумму!");

                } else {

                    setAmount(totalAmount); // устанавливаем новый баланс счета после перевода
                    // устанавливаем новый баланс счета на который делаем перевод amount
                    account.setAmount(account.getAmount() + amount);

                    System.out.println("Перевод средств в размере " + amount + "руб. с Расчетного счета  \n " +
                            "на " + account.getNameAcount() + " произведен успешно!");

                }

            } else {
                setAmount(totalAmount); // устанавливаем новый баланс счета после перевода
                // устанавливаем новый баланс счета на который делаем перевод amount
                account.setAmount(account.getAmount() + amount);

                System.out.println("Перевод средств в размере " + amount + "руб. с Расчетного счета  \n " +
                        "на " + account.getNameAcount() + " произведен успешно!");
            }

        } else {

            System.out.println("У Вас недостаточно средств на Расчетном счету. " +
                    "\n Сумма перевода " + amount + "руб. Пополните ваш баланс!");

        }

        System.out.println(account.toString());
        System.out.println(toString());
        System.out.println();

    }

    @Override
    public void addMoney(int amount) {

        totalAmount = (getAmount() + amount); // считаем баланс счета getAmount после пополнения счета
        setAmount(totalAmount); // устанавливаем новый баланс счета после пополнения счета

        System.out.println("Расчетный счет пополнен на сумму " + amount + "руб.");

        System.out.println(toString());
        System.out.println();

    }

    @Override
    public String toString() {
        return getNameAcount() + ". Баланс: " + getAmount() + "руб.";
    }

}

