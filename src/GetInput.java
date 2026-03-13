import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);

        System.out.println ("Enter your name: ");
        String name = inputScanner.next();

        System.out.println("Enter tour ID: ");
        int id = inputScanner.nextInt();
        
        System.out.println("Enter your Destination: ");
        String destination = inputScanner.next();

        System.out.println ("Enter the amount Paid: ");
        double price = inputScanner.nextDouble();

        System.out.println("Enter Feedback:");
        String feedback = inputScanner.nextLine();

        System.out.println("Thankyou for choosing our services!");

        Passenger passenger = new Passenger(name, id);
        passenger.requestBooking(destination);
        passenger.makePayment(price);
        passenger.sendFeedback(feedback);

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Invalid Input");
        }
    }  
    }
    
