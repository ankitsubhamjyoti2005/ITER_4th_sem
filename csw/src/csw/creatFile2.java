package csw;
import java.io.*;
import java.util.Scanner;

public class creatFile2 {
    public static void main(String[] args) {
        try {
            File myObj = new File("name.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    }
}
