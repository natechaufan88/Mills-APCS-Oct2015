/* Nathan Chau
 * October 1, 2015
 * ASCII Art: Pacman
 */

public class Pacman {
    public static final int DOTS = 5;
    
    public static void main(String[] args) {
        top();
        middle();
        bottom();
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
        dotEnds(DOTS);
    }
    
    public static void line8() {
        System.out.print("@");
        for (int i=1; i<=6; i++)
            System.out.print(",");
        for (int j=1; j<=3; j++)
            System.out.print("@");
        for (int k=1; k<=5; k++)
            System.out.print(" ");
        dotMiddle(DOTS);
    }
    
    public static void line9() {
        System.out.print("@");
        for (int i=1; i<=7; i++)
            System.out.print(",");
        for (int j=1; j<=3; j++)
            System.out.print("@");
        for (int k=1; k<=4; k++)
            System.out.print(" ");
        dotMiddle(DOTS);
    }
    
    public static void dotEnds(int num) {
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=5; j++)
                System.out.print(" ");
            for (int k=1; k<=3; k++)
                System.out.print("@");
            System.out.print(" ");
        }
        System.out.println();
    }
    
    public static void dotMiddle(int num) {
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=4; j++)
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
