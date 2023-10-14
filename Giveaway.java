
// I worked on the assignment alone, using only course-provided materials.
import java.util.Scanner;

public class Giveaway {
    public static void main(String[] args) {
        String[][] inventory = {{"x", "x", "StuffedPython", "x", "CSalt"},
            {"hAIrspray", "x", "x", "x", "x"},
            {"x", "x", "x", "JavaBeans", "x"},
            {"x", "RustedMetal", "SwiftShoes", "x", "x"},
            {"FuRniture", "x", "x", "GroovyGear", "RadiantRuby"}};

        System.out.println("Welcome to the 1331 Giveaway!");
        Scanner input = new Scanner(System.in);
        while (!isArrayEmpty(inventory)) {
            System.out.println("");
            System.out.println("Would you like to take an item? [Y]es,[N]o, or [E]xit");
            String answer = input.next();
            if (answer.equals("N")) {
                System.out.println("Next person in line!");
                System.out.println("");
            } else if (answer.equals("E")) {
                System.out.println("Have a good day!");
                return;
            } else if (answer.equals("Y")) {
                printArray(inventory);
                int flagTwo = 0;
                do {
                    System.out.println("What item are you interested in taking?");
                    int row = input.nextInt();
                    int col = input.nextInt();
                    System.out.println("");
                    if ((0 <= row) && (row < inventory.length)) {
                        if ((0 <= col) && (col < inventory[row].length)) {
                            if (inventory[row][col].equals("x")) {
                                System.out.println("There is no item in this location.");
                                System.out.println("");
                            } else {
                                System.out.println("You successfully took the " + inventory[row][col] + "!");
                                inventory[row][col] = "x";
                                printArray(inventory);
                                flagTwo = 1;
                            }
                        } else {
                            System.out.println("Location does not exist.");
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Location does not exist.");
                        System.out.println("");
                    }
                } while (flagTwo != 1);
            } else {
                System.out.println("");
                System.out.println("Please input ‘Y’, ‘N’, or ‘E’");
            }

        }
        System.out.println("Sorry, we have no more items!");
        return;
    }

    public static void printArray(String[][] array) {
        System.out.println("");

        for (int row = 0; row < array.length; row++) {
            System.out.print("|");
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]);
                System.out.print("|");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static boolean isArrayEmpty(String[][] array) {
        boolean result = false;
        int count = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col].equals("x")) {
                    count = count + 1;
                }

            }
        }
        if (count == 25) {
            result = true;
        }
        return result;
    }
}