// I worked on the assignment alone, using only course-provided materials.

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;

public class TravelBuddy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.print("Welcome to Travel Buddy Service! Please enter your name here: ");
        String temp = input.next();
        String name = temp.toLowerCase();
        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1);

        System.out.println("The Hive - $6.00");
        System.out.println("Invention Studio - $7.50");
        System.out.println("Klaus - $6.90");
        System.out.println("CULC - $3.20");

        System.out.println("");

        System.out.println("Where would you like to go, " + formattedName + "?");
        input.nextLine();
        String choice = input.nextLine();
        System.out.println("");

        double total = 0.00;
        switch (choice) {
        case "The Hive":
            total = total + 6;
            System.out.println("Your current total is "
                        + currencyFormatter.format(Double.parseDouble(formatter.format(total))));
            break;

        case "Invention Studio":
            total = total + 7.50;
            System.out.println("Your current total is "
                        + currencyFormatter.format(Double.parseDouble(formatter.format(total))));
            break;

        case "Klaus":
            System.out.println("Would you like to stop by Chick-fil-a on the way (Yes/No)");
            String answer = input.next();
            if (answer.equals("Yes")) {
                total = 6.90 * 1.50;
            } else if (answer.equals("No")) {
                total = total + 6.90;
            } else {
                return;
            }
            System.out.println("Your current total is "
                        + currencyFormatter.format(Double.parseDouble(formatter.format(total))));
            break;

        case "CULC":

            System.out.println("Would you like to stop by Chick-fil-a on the way (Yes/No)");
            String answerTwo = input.next();
            if (answerTwo.equals("Yes")) {
                total = 3.20 * 1.5;
            } else if (answerTwo.equals("No")) {
                total = total + 3.20;
            } else {
                return;
            }
            System.out.println("Your current total is "
                        + currencyFormatter.format(Double.parseDouble(formatter.format(total))));
            break;

        default:
            System.out.println("That destination is invalid, goodbye!");
            return;
        }
        System.out.println("Do you have a discount? (Yes/No)");
        String menna = input.next();
        System.out.println("");
        if (menna.equals("Yes")) {
            System.out.println("What is the discount code?");
            String discount = input.next();
            System.out.println("");

            if (discount.equals("CS1331")) {
                System.out.println("You have received 25% off your ride!");
                double discountValue = 0.25 * total;
                total = total - discountValue;
            } else if (discount.equals("IKNOWTHEOWNER")) {
                System.out.println("How much would you like to take off?");
                String yourString = input.next();
                double substraction;
                try {
                    substraction = Double.parseDouble(yourString);
                } catch (NumberFormatException ex) {
                    substraction = -1;
                }
                System.out.println("");
                if (substraction <= 0) {

                    total = total - 1.00;
                    System.out.println("Taking off $1.00 from your total... \n");
                    System.out.println("");

                } else {

                    total = total - substraction;
                    System.out.println(
                            "Taking off " + currencyFormatter.format(Double.parseDouble(formatter.format(substraction)))
                                    + " from your total...");
                    System.out.println("");

                }
            } else {
                System.out.println("That discount does not exist! Better luck next time!");
            }
        }
        Double newTotal;
        if (total < 0.00) {
            newTotal = 0.00;
        } else {
            newTotal = total;
        }
        System.out.println("Thank you for riding with the Travel Buddy Service, " + formattedName + "! You are now "
                + currencyFormatter.format(Double.parseDouble(formatter.format(newTotal)))
                + " poorer!");
        System.out.println("We hope you ride with us again! :)");
    }
}
