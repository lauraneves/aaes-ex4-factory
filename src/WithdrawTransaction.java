package src;

public class WithdrawTransaction extends Transaction {
    public WithdrawTransaction(double amount, String description) {
        super(amount, description);
    }

    @Override
    public void process() {
        // todo: logic to process a withdraw
        System.out.println("Processando saque de " + getAmount() + " reais: " + getDescription());
    }
}
