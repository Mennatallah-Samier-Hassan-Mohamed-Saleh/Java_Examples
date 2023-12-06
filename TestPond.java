import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestPond {
    public static void main(String[] args) throws FileNotFoundException{

        Fly flyOne =  new Fly(1 , 19);
        flyOne.grow(19);
        System.out.println(flyOne);

        Frog frogOne = new Frog("Peepo",10,5);
        frogOne.grow(4);
        System.out.println(frogOne);


        Frog frogOne2 = new Frog("Peepo",25,10);
        frogOne2.grow(10);
        System.out.println(frogOne2);

        File text = new File("Menna");
        Scanner filScan = null;
        File file = new File("example.txt");
        try{
            filScan = new Scanner(text);
            if(filScan.hasNextLine() == false){
               // System.out.println("The input file was empty");
                throw new BadFileException();
            }
        }catch(BadFileException ex){
            //System.out.println("The input file was empty");
            return;
        }
        AttendanceTaker test = new AttendanceTaker("Menna","Supply.java");
        test.takeAttendance();


    }
    
}
