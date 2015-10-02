/* Nathan Chau
 * October 1, 2015
 * ASCII Art: Pacman
 * This program will print out pacman with the desired amount of dots for pacman to eat.
 */

public class Pacman_Test {
    //change the variable PACDOTS below to the number of pacdots you want pacman to eat.
    public static final int PACDOTS = 2;
    
    public static void main(String[] args) {
        for (int i=0; i<=PACDOTS; i++) {
            for (int j=1; j<=(15*i); j++) {
                System.out.print(" ");
            }
                        
            top();
            middle();
            bottom();
        }
    }
    
    public static void top() {
        line1or16();
        for (int line=1; line<=4; line++) {
            for (int i=1; i<=(5-line); i++)
                System.out.print(" ");
            System.out.print("@");
            for (int j=1; j<=(2*line+4); j++)
                System.out.print(",");
            System.out.println("@");
        }
        line6or11();
    }
    
    public static void line1or16() {
        for (int i=1; i<=5; i++)
            System.out.print(" ");
        System.out.print("+");
        for (int j=1; j<=4; j++)
            System.out.print("@");
        System.out.println("+");
    }
    
    public static void line6or11() {
        System.out.print("@");
        for (int i=1; i<=13; i++)
            System.out.print(",");
        System.out.println("@");
    }
    
    public static void middle() {
        line7or10();
        line8();
        line9();
        line7or10();
    }
    
    public static void line7or10() {
        System.out.print("@");
        for (int i=1; i<=10; i++)
            System.out.print(",");
        for (int j=1; j<=3; j++)
            System.out.print("@");
        for (int k=1; k<=1; k++)
            System.out.print(" ");
        dotEnds(PACDOTS);
    }
    
    public static void line8() {
        System.out.print("@");
        for (int i=1; i<=6; i++)
            System.out.print(",");
        for (int j=1; j<=3; j++)
            System.out.print("@");
        for (int k=1; k<=5; k++)
            System.out.print(" ");
        dotMiddle(PACDOTS);
    }
    
    public static void line9() {
        System.out.print("@");
        for (int i=1; i<=7; i++)
            System.out.print(",");
        for (int j=1; j<=3; j++)
            System.out.print("@");
        for (int k=1; k<=4; k++)
            System.out.print(" ");
        dotMiddle(PACDOTS);
    }
    
    public static void dotEnds(int num) {
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=6; j++)
                System.out.print(" ");
            for (int k=1; k<=3; k++)
                System.out.print("@");
            System.out.print(" ");
        }
        System.out.println();
    }
    
    public static void dotMiddle(int num) {
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=5; j++)
                System.out.print(" ");
            for (int k=1; k<=5; k++)
                System.out.print("@");
        }
        System.out.println();
    }
    
    public static void bottom() {
        line6or11();
        for (int line=1; line<=4; line++) {
            for (int i=1; i<=line; i++)
                System.out.print(" ");
            System.out.print("@");
            for (int j=1; j<=(14-2*line); j++)
                System.out.print(",");
            System.out.println("@");
        }
        line1or16();
    }
}
