import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {

    public static void main(String[] args) throws FileNotFoundException {
        String inputFileName = args[0];
        String word = args[1];

        File fileIn = new File(inputFileName);
        File fileOut = new File(word + "In" + inputFileName);

        Scanner filScan = null;
        PrintWriter filePrint = null;
        try {
            filScan = new Scanner(fileIn);
            filePrint = new PrintWriter(fileOut);

            int linCount = 0;
            filePrint.printf("Lines in %s containaing %s: \n", args[0], args[1]);
            System.out.printf("Lines in %s containaing %s: \n", args[0], args[1]);
            while (filScan.hasNextLine()) {
                String line = filScan.nextLine();
                if (line.contains(word)) {
                    System.out.println(linCount + ":" + line);
                    filePrint.println(linCount + ":" + line);
                }
                linCount++;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } finally {
            if (filScan != null) {
                filScan.close();
            }
            if (filePrint != null) {
                filePrint.close();
            }
        }

        filScan = new Scanner(fileIn);
        filePrint = new PrintWriter(fileOut);
        Helper()
    }

   

}
