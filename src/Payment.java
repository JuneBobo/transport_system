public interface Payment {
    void processPayment();
    void confirmTransactions();
    void getReceipt();
}