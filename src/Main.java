//import static javax.swing.text.html.HTML.Tag.S;

//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     int purchasePrice = 500;
     final double SALES_TAX = 0.05;
     double totalAmount = 0;
     double taxAmount;

               taxAmount = purchasePrice * SALES_TAX;
               totalAmount = taxAmount + purchasePrice;


             System.out.println("The total purchase price is " + totalAmount);
             System.out.println("The total tax amount is " + taxAmount);












    }
}