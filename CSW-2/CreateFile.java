import java.io.File; 
import java.io.IOException; 

public class CreateFile {
  public static void main(String[] args) {
    // try {
    //   File myObj = new File("name.txt");
    //   if (myObj.createNewFile()) {
    //     System.out.println("File created: " + myObj.getName());
    //   } else {
    //     System.out.println("File already exists.");
    //   }
    // } catch (IOException e) {
    //   System.out.println("An error occurred.");
    //   e.printStackTrace();
    // }
    int a[]={1,2,3},b[]={4,5,6},c[]=new int[3];
        for (int i = 0; i < 3; i++) {
            c[i]=a[i]*b[i];
            System.out.println("At "+(i+1)+" position: "+c[i]);
        }
  }
}