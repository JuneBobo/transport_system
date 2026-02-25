public class Driver extends User {

    private String licenseNum;
    private long phoneNum;
    private double salary;
    public Driver (String name, int id, String licenseNum, int phoneNum) {
 //using the super keyword
        super (name , id);
// using this keyword
        this.licenseNum = licenseNum;
        this.phoneNum = phoneNum;
    }
      public void setLicenseNum(String licenseNum){

      }
      public void setPhoneNum(int phoneNum){

      }
      public void setSalary(double salary){

      }
      public String getLicenseNum(){
        return licenseNum;
      }
      public long getPhoneNum(){
        return phoneNum;
      }
      public double getSalary(){
        return salary;
      }
// method overriding
      public void doingRole(){
        System.out.println("Driver" + getName() + "is responsible for today's Transportation");
      }
    public void viewPayroll(){
        System.out.println("Monthly salary: ksh" + salary);
    }
    public void acceptParcel(double weight) {
        System.out.println("Driver"+ getName() + "has accepted the parcel of weight" + weight + "kg.");
    }
    
}
