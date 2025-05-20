public class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 1000) {
            System.out.println("Превышен лимит снятия в 1000 ед.");
        } else {
            super.withdraw(amount);
        }
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
    }

    @Override
    public void displayInfo() {
        System.out.println(getAccountInfo() + "\n" +
                "Процентная ставка: " +
                String.format("%.2f", interestRate) + "%");
    }
}