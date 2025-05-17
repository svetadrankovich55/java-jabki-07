public class Account {
    private final String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение на " + amount + " успешно выполнено.");
        } else {
            System.out.println("Сумма пополнения должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (getBalance()>= amount) {
             setBalance(getBalance()-amount);
                System.out.println("Снятие " + amount + " успешно выполнено.Остаток средств на счете: " +getBalance());
            } else {
                System.out.println("Недостаточно средств на счете.");
            }
        } else {
            System.out.println("Сумма снятия должна быть положительной.");
        }
    }

    public String getAccountInfo() {
        return "Информация по счету: \n" +
                "Номер счета: " + getAccountNumber() + "\n" +
                "Баланс: " + String.format("%.2f", getBalance()) + " руб.";

    }

    public void displayInfo() {
        System.out.println(getAccountInfo());
    }
}