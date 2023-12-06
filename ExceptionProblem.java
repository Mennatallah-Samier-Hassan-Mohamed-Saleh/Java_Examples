import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
public class ExceptionProblem {
    /* 
    public static void main(String[] args) {
        Random rand = null;
        rand.nextInt();
    }
    public class FileTest {
        */
    public static void main(String args[]) throws FileNotFoundException{
        File text = new File("question.txt");
        Scanner scan = new Scanner(text);
        //read and print lines
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
    }
}
//}
