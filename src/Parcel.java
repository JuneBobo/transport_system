public class Parcel extends Transport {
    private double weight;
    private boolean confirmed;

    public Parcel(String companyName, double price, double weight){
        this.weight = weight;
        super(companyName, price);
    }
    public void moving(){
        System.out.println("Parcel delvery that is" + weight + "kg" );
    }
    public void makePayment(){
       System.out.println();
    }
    
    public void confirmParcel() {
        this.confirmed = true;
        System.out.println("Your parcel delvery confrmed uccessfully.");
    }
    
}
