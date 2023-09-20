package src;

public abstract class Transaction {
    private final double amount;
    private final String description;

    public Transaction(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public abstract void process();

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
