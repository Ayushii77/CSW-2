import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
public class q4{
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String s = myReader.nextLine();
        System.out.println(s);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred: ");
    
    }
  }
}