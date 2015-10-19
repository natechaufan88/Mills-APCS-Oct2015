/* Nathan Chau
 * October 13, 2015
 * Equestria Programming Assignment
 */

public class Equestria {
    // To change the outputs in the terminal window, change the parameters of the methods in the main method.
    public static void main(String[] args) {
        System.out.println("Distance from Baltimare to Manehattan = " + distance(31, -16, 34, -9));
        System.out.println("Distance from Los Pegasus to Neighagra Falls = " + distance(7, -19, 22, -8));
        System.out.println("Distance from the Badlands to Ponyville = " + distance(25, -23, 16, -14));
        System.out.println();
        System.out.println("Distance of circular path = " + roadTrip(31, -16, 34, -9));
        System.out.println();
        threeStop(31, -16, 34, -9, 7, -19);
        System.out.println();
        directions(31, -16, 34, -9, 7, -19);
        System.out.println();
        System.out.println("Distance of longest trip = " + longestTrip(31, -16, 34, -9, 7, -19, 22, -8));
    }
    
    // This method rounds all outputs to the hundredths place.
    public static double truncate(double num) {
        num *= 100;
        num = (int) num;
        num /= 100;
        return num;
    }
    
    // Exercise 1
    public static double distance(int x1, int y1, int x2, int y2) {
        int xDistance = x1 - x2;
        int yDistance = y1 - y2;
        // Pythagorean Theorem
        double actualDistance = truncate(Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2)));
        return actualDistance;
    }
    
    // Exercise 2
    public static double roadTrip(int x1, int y1, int x2, int y2) {
        // C = diameter * pi
        double circumference = truncate(distance(x1, y1, x2, y2) * Math.PI);
        return circumference;
    }
    
    // Exercise 3
    public static void threeStop(int x1, int y1, int x2, int y2, int x3, int y3) {
        double firstDistance = distance(x1, y1, x2, y2);
        double secondDistance = distance(x1, y1, x3, y3);
        double thirdDistance = distance(x2, y2, x3, y3);
        System.out.println("Distance between City A and City B = " + firstDistance);
        System.out.println("Distance between City A and City C = " + secondDistance);
        System.out.println("Distance between City B and City C = " + thirdDistance);
        double firstAngle = arccosine(firstDistance, secondDistance, thirdDistance);
        System.out.println("Angle between City A and City B from City C = " + truncate(firstAngle));
        double secondAngle = arccosine(secondDistance, firstDistance, thirdDistance);
        System.out.println("Angle between City A and City C from City B = " + truncate(secondAngle));
        double thirdAngle = arccosine(thirdDistance, firstDistance, secondDistance);
        System.out.println("Angle between City B and City C from City A = " + truncate(thirdAngle));
    }
    
    public static double arccosine(double firstDistance, double secondDistance, double thirdDistance){
        // Law of Cosines
        double arccosine = Math.toDegrees(Math.acos((-(Math.pow(firstDistance, 2)) + 
            Math.pow(secondDistance, 2) +  Math.pow(thirdDistance, 2)) / (2 * secondDistance * thirdDistance)));
        return arccosine;
    }
    
    // Exercise 3 EC
    public static void directions(int x1, int y1, int x2, int y2, int x3, int y3) {
        double firstDistance = distance(x1, y1, x2, y2);
        double secondDistance = distance(x1, y1, x3, y3);
        double thirdDistance = distance(x2, y2, x3, y3);
        double firstAngle = truncate(arccosine(firstDistance, secondDistance, thirdDistance));
        double secondAngle = truncate(arccosine(secondDistance, firstDistance, thirdDistance));
        double thirdAngle = truncate(arccosine(thirdDistance, firstDistance, secondDistance));
        System.out.println("From City A, turn " + firstAngle + " degrees and walk " + firstDistance +
            " miles to reach City B.");
        System.out.println("From City B, turn " + secondAngle + " degrees to your right and walk " + 
            secondDistance + " miles to reach City C.");
        System.out.println("From City C, turn " + thirdAngle + " degrees to your right and walk " + 
            thirdDistance + " miles to reach City A.");
    }
    
    // Exercise 4 & Exercise 4 EC
    public static double longestTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // Six possible distances between four total points
        double firstDistance = distance(x1, y1, x2, y2);
        double secondDistance = distance(x1, y1, x3, y3);
        double thirdDistance = distance(x1, y1, x4, y4);
        double fourthDistance = distance(x2, y2, x3, y3);
        double fifthDistance = distance(x2, y2, x4, y4);
        double sixthDistance = distance(x3, y3, x4, y4);
        // Nested Math.max objects
        double longest = truncate(Math.max(Math.max(Math.max(Math.max(Math.max(firstDistance, secondDistance), 
            thirdDistance), fourthDistance), fifthDistance), sixthDistance));
        return longest;
    }
}