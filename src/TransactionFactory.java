package src;

public abstract class TransactionFactory {
    public abstract Transaction createTransaction(double amount, String description);
}

