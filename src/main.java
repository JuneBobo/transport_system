public class main {
    public static void main(String[] args) {
        // Object creation
        Passenger passenger = new Passenger("keesha", 3543);
        // calling the methods
        passenger.doingRole();
        passenger.requestBooking("Migori");
        passenger.makePayment(1500);
        passenger.sendFeedback("The bus was comfortable.");

        //object creation
        Driver driver = new Driver("Kamau", 134678, "DL09876", 1704 );
        driver.doingRole();
        driver.viewPayroll();
        driver.acceptParcel(20);
        
        // object creation
        Parcel parcel = new Parcel("Enigma Travellers" ,1500, 20);
        parcel.moving();
        parcel.confirmParcel();
        parcel.makePayment();


        // object creation
        Payment payment = new Payment();
        payment.processPayment();
        payment.confirmTransactions();
        payment.getReceipt();

        }

    
}
