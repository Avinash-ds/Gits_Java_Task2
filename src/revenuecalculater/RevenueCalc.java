package revenuecalculater;

import java.util.Scanner;

public class RevenueCalc {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        // Getting price
        System.out.println("Enter the Price : ");
        int pricePerUnit = inputScanner.nextInt();

        // Getting Quantity from user
        System.out.println("Enter Quantity - ");
        int quantity = inputScanner.nextInt();

        double priceBeforeDiscount = pricePerUnit * quantity;

        double totalDiscount;
        if (quantity >= 120) {
            totalDiscount = 15;
        } else if (quantity >= 100 && quantity < 120) {
            totalDiscount = 10;
        } else {
            totalDiscount = 0;
        }
        ;

        double rateOfDiscount;
        double priceAfterDiscount;
        if (totalDiscount == 15) {
            rateOfDiscount = priceBeforeDiscount * 0.15;
            priceAfterDiscount = priceBeforeDiscount - rateOfDiscount;
        } else {
            rateOfDiscount = priceBeforeDiscount * 0.10;
            priceAfterDiscount = priceBeforeDiscount - rateOfDiscount;
        }

        System.out.println("Original price : " + priceBeforeDiscount + "$");
        System.out.println("Hurray! You got a discount of " + rateOfDiscount + "$ (" + totalDiscount + "%)");
        System.out.println("Total Amount : " + priceAfterDiscount + "$ Only!!");

        inputScanner.close();

    }

    //

}
