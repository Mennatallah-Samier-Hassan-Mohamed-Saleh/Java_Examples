
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

    /**
     * This is a constructor that takes in 2 parameters
     * @param inputFile  first variable
     * @param outputFile second variable
     */
    public AttendanceTaker(File inputFile, File outputFile) throws FileNotFoundException {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    /**
     * This is a constructor that takes in 2 parameters
     * @param inputFileName  first variable
     * @param outputFileName second variable
     */
    public AttendanceTaker(String inputFileName, String outputFileName) throws FileNotFoundException {
        this(new File(inputFileName), new File(outputFileName));
    }

    /**
     * @throws FileNotFoundException exception
     */
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
                throw new BadFileException("The input file was empty");
            }
        } catch (NoSuchElementException me) {
            throw new BadFileException("");
        } catch (BadFileException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        try {
            System.out.println(line.length());
            int size = line.length();
            if (size < 6) {
                throw new BadFileException("The file doesn't have correct beginning or end”");
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
                if (flag) {

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
        inputScanner.close();
        if (filePrint != null) {
            filePrint.close();
        }

    }

    /**
     * @param name name
     * @param consoleScanner sacnner
     * @param printWriter writer
     * @throws FileNotFoundException exception
     */
    private static void processStudentAttendance(String name,
        Scanner consoleScanner, PrintWriter printWriter) throws FileNotFoundException {
        boolean flag = false;
        try {
            if (!(name.equals(name.toUpperCase()))) {
                throw new InvalidNameFormatException("The name isn't uppercase only");
            } else {
                for (int i = 0; i < name.length(); i++) {
                    if (Character.isDigit(name.charAt(i))) {
                        throw new InvalidNameFormatException("The name has a digit");
                    } else if ((name.charAt(i)) == '|') {
                        throw new InvalidNameFormatException("The name has a pipe character");
                    } else {

                        flag = true;
                    }
                }
            }
            if (flag) {
                System.out.println(name);
                String input = consoleScanner.nextLine();
                if (input.equals("")) {
                    throw new InvalidAttendanceInformationException("Attendance information missing");

                } else if (!(input.equals("A") || (input.equals("P")))) {
                    throw new InvalidAttendanceInformationException("Attendance information is not P or A”");
                } else {
                    printWriter.println(input);
                }

            }

        } catch (InvalidNameFormatException e) {
            printWriter.println("-");
            printWriter.println("Skipping " + name + " because of an invalid name format:"
                    + e.getMessage());
        } catch (InvalidAttendanceInformationException m) {
            printWriter.println("-");
            printWriter.println("Skipping " + name + " because of an invalid attendance information::"
                + m.getMessage());
        }

    }

    /**
     * @param args args
     * @throws FileNotFoundException exception
     */
    public static void main(String[] args) throws FileNotFoundException {
        AttendanceTaker taker = new AttendanceTaker(args[0], args[1]);
        taker.takeAttendance();
    }

}
