import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("name.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                FileWriter myWriter = new FileWriter("ename.txt");
                myWriter.write("nothing");
                myWriter.close();
            } else {
                System.out.println("File already exists.");
                FileWriter myWriter = new FileWriter("name.txt");
                myWriter.write("nothing");
                myWriter.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}