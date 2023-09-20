package src;

public class DepositTransaction extends Transaction {
    public DepositTransaction(double amount, String description) {
        super(amount, description);
    }

    @Override
    public void process() {
        // todo: logic to process a deposit
        System.out.println("Processando depósito de " + getAmount() + " reais: " + getDescription());
    }
}
