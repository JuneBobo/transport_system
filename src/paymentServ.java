public interface paymentServ {
    void makePayment(double fare);

    void confirmTransactions();
    
    String getReceipt();
}
