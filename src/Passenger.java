public class Passenger extends User implements paymentService, ReceiveFeedback{
      private String destination;
    public Passenger(String name, int id) {
        super(name, id);
    }
    public void setDestination(String destination){

    }
    public String getDestination(){
        return destination;
    }
    // method overriding
    public void doingRole(){
        System.out.println("Passenger" + getName() + "is using our Transport Services.");
    }

    public void requestBooking(String destination){    
     this.destination = destination;
     System.out.println(getName()+ "has requested for booking to" + destination);
    }
    public void makePayment(double fare){
        System.out.println(getName()+ " has paid ksh " + fare);

    }
    public void sendFeedback(String feedback){
      System.out.println("Feedback from" + getName() + ": " + feedback);
    }
    
}
