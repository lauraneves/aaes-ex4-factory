package src;

public class WithdrawTransactionFactory extends TransactionFactory {
    @Override
    public Transaction createTransaction(double amount, String description) {
        return new WithdrawTransaction(amount, description);
    }
}
