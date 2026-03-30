import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("passenger.txt");
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}