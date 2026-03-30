import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("passenger.txt");
        
        try {
            FileWriter fr = new FileWriter(file);
            
            fr.write("Loch");
            fr.write("Hawi");
            fr.write(String.valueOf(1234));
            fr.write(String.valueOf(5679));
            
            fr.close();
            System.out.println("File saved successfully!!");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}