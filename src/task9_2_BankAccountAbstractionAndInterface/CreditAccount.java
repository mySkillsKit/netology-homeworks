package task9_2_BankAccountAbstractionAndInterface;

public class CreditAccount extends Account {

    public CreditAccount(int amount, String nameAcount) {
        super(amount, nameAcount);
    }
    //Кредитный не может иметь положительный баланс –
    // если платить с него, то уходит в минус,
    // чтобы вернуть в 0, надо пополнить его.

    @Override
    public void pay(int amount) {

        totalAmount = (getAmount() - amount); // считаем баланс счета getAmount после оплаты amount

        if (totalAmount <= 0 && totalAmount >= creditLimit) {

            setAmount(totalAmount); // устанавливаем новый баланс счета после оплаты

            System.out.println("Оплата в размере " + amount +
                    "руб. с Кредитного счета прошла успешно!");

        } else {

            System.out.println("У Вас недостаточно средств на Кредитном счету. " +
                    "Сумма перевода " + amount + "руб.\n " + " Превышен кредитный лимит "
                    + creditLimit);
        }

        System.out.println(toString());
        System.out.println();

    }

    @Override
    public void transfer(Account account, int amount) {

        totalAmount = (getAmount() - amount); // считаем баланс счета getAmount после перевода суммы amount

        if (totalAmount <= 0 && totalAmount >= creditLimit) {

            setAmount(totalAmount); // устанавливаем новый баланс счета после перевода
            // устанавливаем новый баланс счета на который делаем перевод amount
            account.setAmount(account.getAmount() + amount);

            System.out.println("Перевод средств в размере " + amount + "руб. с Кредитного счета \n " +
                    "на " + account.getNameAcount() + " произведен успешно!");

        } else {

            System.out.println("У Вас недостаточно средств на Кредитном счету. " +
                    "Сумма перевода " + amount + "руб.\n Пополните ваш баланс!");
        }

        System.out.println(account.toString());
        System.out.println(toString());
        System.out.println();

    }

    @Override
    public void addMoney(int amount) {

        totalAmount = (getAmount() + amount); // считаем баланс счета getAmount после пополнения счета

        if (totalAmount > 0) {
            System.out.println("Отмена операции! На Кредитном счету Вы не может иметь положительный баланс.\n" +
                    "Сумма пополнения " + amount + "руб.\n Кредитный лимит "
                    + creditLimit + "руб. Уменьшите сумму!");

        } else {

            setAmount(totalAmount); // устанавливаем новый баланс счета после пополнения счета

            System.out.println("Кредитный счет пополнен на сумму " + amount + "руб.");

        }
        System.out.println(toString());
        System.out.println();

    }

    @Override
    public String toString() {
        return getNameAcount() + ". Баланс: " + getAmount() + "руб.";
    }

}
