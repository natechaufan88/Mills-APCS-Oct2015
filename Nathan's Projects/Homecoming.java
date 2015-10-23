/* Nathan Chau
 * October 23, 2015
 * Chapter 3 Homecoming Project
 */

import java.util.*;

public class Homecoming {
    public static void main(String[] args) {
        Scanner userinput = new Scanner (System.in);
    }
    
    public static void getADate(Scanner userinput) {
        String name = "Nathan";
        System.out.println("Hi! My name is " + name + ".");
        System.out.println("What's your name?");
        String dateName = userinput.next();
        System.out.println("Nice to meet you " + dateName + ".");
        System.out.println("Would you like to go to Homecoming with me?");
        String response = userinput.next();
        System.out.println("Great! It'll be a magical night -- " + name + " and " + dateName +
            " going to the Mills Homecoming Dance 2015!");
    }
    
    public static void damage(Scanner userinput) {
        System.out.println("Let's figure out the damage for the evening.");
        System.out.println("What are your estimated costs?");
    }
    
    public static void pricing(String item) {
    }
}