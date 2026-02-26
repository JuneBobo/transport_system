public interface paymentService {
    void makePayment(double fare);

    void confirmTransactions();
    
    String getReceipt();
}
