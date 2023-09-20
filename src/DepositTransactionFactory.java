package src;

public class DepositTransactionFactory extends TransactionFactory {
    @Override
    public Transaction createTransaction(double amount, String description) {
        return new DepositTransaction(amount, description);
    }
}
