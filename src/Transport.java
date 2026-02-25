public abstract class Transport {
    private String companyName;
    private double price;

    public Transport (String companyName, double price){
        this.companyName = companyName;
        this.price = price;
    }

    public void setCompanyName(String companyName){

    }
    public void setPrice(double price){

    }
    public String getCompanyName(){
        return companyName;
    }
    public double getPrice(){
        return price;
    }
}
