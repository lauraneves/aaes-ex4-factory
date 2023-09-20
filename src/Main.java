package src;

public class Main {
    public static void main(String[] args) {
        TransactionFactory depositFactory = new DepositTransactionFactory();
        TransactionFactory withdrawFactory = new WithdrawTransactionFactory();

        Transaction depositTransaction = depositFactory.createTransaction(1000.0, "Depósito mensal");
        Transaction withdrawTransaction = withdrawFactory.createTransaction(500.0, "Retirada de dinheiro");

        depositTransaction.process();
        withdrawTransaction.process();
    }
}
