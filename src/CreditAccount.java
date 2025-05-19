public class CreditAccount extends Account {
    public double creditLimit;

    public CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        if (creditLimit < 0) {
            throw new IllegalArgumentException("Кредитный лимит не может быть отрицательным");
        }
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= -getCreditLimit()) {
            super.withdraw(amount);
            System.out.println("Доступный кредитный лимит: " + (creditLimit + getBalance()));
        } else {
            System.out.println("Превышен кредитный лимит.");
        }
    }
}