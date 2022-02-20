package task9_2_BankAccountAbstractionAndInterface;

public abstract class Account {
// абстрактный класс Account с тремя методами: заплатить, перевести, пополнить
    // TODO (pay(int amount), transfer(Account account, int amount), addMoney(int amount))
    public int totalAmount;
    public int creditLimit = -100000;

    private int amount;
    private String nameAcount;




    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getNameAcount() {
        return nameAcount;
    }


    public Account(int amount, String nameAcount) {
        this.amount = amount;
        this.nameAcount = nameAcount;
    }

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);


    @Override
    public String toString() {
        return nameAcount + ". Баланс: " + amount + "руб.";
    }
}
