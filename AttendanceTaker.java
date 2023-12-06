
// I worked on the assignment alone, using only course-provided materials.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * @author Mennatallah Saleh
 * @version 1.0
 *          This class is an example of a AttendanceTaker
 */
public class AttendanceTaker {
    private File inputFile;
    private File outputFile;

    public AttendanceTaker(File inputFile, File outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public AttendanceTaker(String inputFileName, String outputFileName) {
        this(new File(inputFileName), new File(outputFileName));
    }

    public void takeAttendance() throws FileNotFoundException {
        Scanner filScan = null;
        String line = null;
        String[] tokens = null;
        try {
            filScan = new Scanner(inputFile);
            if (filScan.hasNextLine()) {
                line = filScan.nextLine();
                System.out.println(line);
            } else {
                throw new BadFileException();
            }
        } catch (NoSuchElementException me) {
            throw new BadFileException();
        } catch (BadFileException ex) {
            System.out.println("The input file was empty");
            return;
        }
        try {
            System.out.println(line.length());
            int size = line.length();
            if (size < 6) {
                throw new BadFileException();
            } else {
                char c = line.charAt(0);
                boolean flag = false;
                if (c == '|') {
                    c = line.charAt(1);
                    if (c == '-') {
                        c = line.charAt(2);
                        if (c == '-') {
                            System.out.println("Hello");
                            c = line.charAt(size - 3);
                            if (c == '-') {
                                c = line.charAt(size - 2);
                                if (c == '-') {
                                    c = line.charAt(size - 1);
                                    if (c == '|') {

                                        flag = true;
                                        System.out.println("Correct");

                                    }

                                }

                            }

                        }
                    }
                }
                if (!flag) {
                    throw new BadFileException();
                } else {
                    System.out.println("File is valid");
                    String strNew = line.substring(3, line.length() - 4);
                    System.out.println(strNew);
                    tokens = strNew.split("---");
                    for (String x : tokens) {
                        System.out.println(x);
                    }
                }

            }

        } catch (BadFileException ex) {
            System.out.println("The file doesn't have correct beginning or end");
            return;
        } finally {
            if (filScan != null) {
                filScan.close();
            }
        }

        Scanner inputScanner = new Scanner(System.in);
        PrintWriter filePrint = new PrintWriter(outputFile);
        for (String i : tokens) {
            processStudentAttendance(i, inputScanner, filePrint);

        }

    }

    private void processStudentAttendance(String name, Scanner consoleScanner, PrintWriter printWriter) {
        try {
            if (!(name.equals(name.toUpperCase()))) {
                throw new InvalidNameFormatException("The name isn't uppercase only");
            }
            else{
                for (int i = 0; i < name.length(); i++) {
                    if (Character.isDigit(name.charAt(i))) {
                        throw new InvalidNameFormatException("The name has\n" + //
                                "a digit");
                    }
                }
            }

        } catch (InvalidNameFormatException e) {
            System.out.println("The name isn't uppercase only");
        } 

    }

}
