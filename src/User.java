public abstract class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
// Encapsulation setters and getters
    public void setName( String name) {

    }
    public void setName(int id){

    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
     
}
