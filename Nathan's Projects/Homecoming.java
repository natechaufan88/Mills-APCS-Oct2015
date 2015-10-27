/* Nathan Chau
 * October 23, 2015
 * Chapter 3 Homecoming Project
 */

import java.util.*;

public class Homecoming {
    // define own name to be able to be called on in all methods
    public static final String NAME = "Nathan";
    
    // main method to call all 3 Exercise methods with spaces in between each of them
    public static void main(String[] args) {
        Scanner userinput = new Scanner (System.in);
        String name = getADate(userinput);
        System.out.println();
        System.out.println();
        damage(userinput, name);
    }
    
    // Exercise 1
    public static String getADate(Scanner userinput) {
        System.out.println("Hi! My name is " + NAME + ".");
        System.out.print("What's your name? ");
        String dateName = userinput.nextLine();
        System.out.println("Nice to meet you, " + dateName + ".");
        System.out.print("Would you like to go to Homecoming with me? ");
        String response = userinput.nextLine();
        System.out.println("Great! It'll be a magical night -- " + NAME + " and " + dateName +
            " going to the Mills Homecoming Dance 2015!");
        return dateName;
    }

    // Exercise 2
    public static void damage(Scanner userinput, String name) {
        System.out.println("Let's figure out the damage for the evening.");
        System.out.println("What are your estimated costs?");
        System.out.print("Tickets (each): $");
        double tickets = userinput.nextDouble();
        System.out.print("Flowers (for both): $");
        double flowers = userinput.nextDouble();
        System.out.print("Pictures: $");
        double pictures = userinput.nextDouble();
        System.out.print("Dinner (per meal): $");
        double dinner = userinput.nextDouble();
        System.out.print("New clothes: $");
        double clothes = userinput.nextDouble();
        System.out.print("Other expenses: $");
        double other = userinput.nextDouble();
        double total = round(tickets + flowers + pictures + dinner * 1.0825 + clothes * 1.0825 + other);
        System.out.println("So, you should expect to spend, including tax, $" + total);
        double totalHalf = round(total / 2);
        System.out.println("If you split the costs with your date, each will pay: $" + totalHalf);
        System.out.println();
        System.out.println();
        statsTable(tickets, flowers, pictures, dinner, clothes, other, name);
    }
    
    // method used to round prices to the hundredths place
    public static double round(double total) {
        total *= 100;
        total = Math.round(total);
        total /= 100;
        return total;
    }
    
    // Exercise 3
    public static void statsTable(double tickets, double flowers, double pictures, double dinner,
        double clothes, double other, String name) {
        System.out.println("MHS Homecoming 2015");
        System.out.println(NAME + " and " + name);
        System.out.println();
        System.out.println("Tickets (total): \t$" + tickets * 2);
        System.out.println("Flowers (for both): \t$" + flowers);
        System.out.println("Pictures: \t\t$" + pictures);
        System.out.println("Dinner (for two): \t$" + dinner * 2);
        System.out.println("New clothes: \t\t$" + clothes);
        System.out.println("Any other expenses: \t$" + other);
        double subtotal = tickets + flowers + pictures + dinner + clothes + other;
        System.out.println("\tSubtotal\t$" + subtotal);
        double tax = round(subtotal * 0.0825);
        System.out.println("\tSales tax\t$" + tax);
        double total = subtotal + tax;
        System.out.println("\tTotal\t\t$" + total);
    }
}