/* Nathan Chau
 * October 13, 2015
 * Equestria Programming Assignment
 */

public class Equestria {
    public static void main(String[] args) {
        System.out.println("Distance from Baltimare to Manehattan = " + distance(31, -16, 34, -9));
        System.out.println("Distance from Los Pegasus to Neighagra Falls = " + distance(7, -19, 22, -8));
        System.out.println("Distance from the Badlands to Ponyville = " + distance(25, -23, 16, -14));
        System.out.println();
        System.out.println("Distance of circular path = " + roadTrip(31, -16, 34, -9));
        System.out.println();
        System.out.println(threeStop(31, -16, 34, -9, 7, -19));
        System.out.println();
        System.out.println("Distance of longest trip = " + longestTrip(31, -16, 34, -9, 7, -19, 22, -8));
    }
    
    //Exercise 1
    public static double distance(int x1, int y1, int x2, int y2) {
        int xDistance = Math.abs(x1 - x2);
        int yDistance = Math.abs(y1 - y2);
        double actualDistance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
        actualDistance *= 100;
        actualDistance = (int) actualDistance;
        actualDistance /= 100;
        return actualDistance;
    }
    
    public static double roadTrip(int x1, int y1, int x2, int y2) {
        double circumference = distance(x1, y1, x2, y2) * Math.PI;
        circumference *= 100;
        circumference = (int) circumference;
        circumference /= 100;
        return circumference;
    }
    
    public static double threeStop(int x1, int y1, int x2, int y2, int x3, int y3) {
        double firstDistance = distance(x1, y1, x2, y2);
        double secondDistance = distance(x1, y1, x3, y3);
        double thirdDistance = distance(x2, y2, x3, y3);
        System.out.println(firstDistance);
        System.out.println(secondDistance);
        System.out.println(thirdDistance);
        /* double firstAngle = arccosine(firstDistance, secondDistance, thirdDistance);
        firstAngle *= 100;
        firstAngle = (int) firstDistance;
        firstAngle /= 100;
        double secondAngle = arccosine(secondDistance, firstDistance, thirdDistance);
        secondAngle *= 100;
        secondAngle = (int) secondAngle;
        secondAngle /= secondAngle;
        double thirdAngle = arccosine(thirdDistance, firstDistance, secondDistance);
        thirdAngle *= 100;
        thirdAngle = (int) thirdAngle;
        thirdAngle /= 100;
        System.out.println(firstAngle);
        System.out.println(secondAngle);
        System.out.println(thirdAngle);
        return firstDistance; */
        return firstDistance;
    }
    
    public static void arccosine(double firstDistance, double secondDistance, double thirdDistance){
        double arccosine = Math.toDegrees(Math.acos((-(Math.pow(firstDistance, 2)) + 
            Math.pow(secondDistance, 2) +  Math.pow(thirdDistance, 2)) / (2 * secondDistance * thirdDistance)));
    }
    
    public static double longestTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double firstDistance = distance(x1, y1, x2, y2);
        double secondDistance = distance(x1, y1, x3, y3);
        double thirdDistance = distance(x1, y1, x4, y4);
        double fourthDistance = distance(x2, y2, x3, y3);
        double fifthDistance = distance(x2, y2, x4, y4);
        double sixthDistance = distance(x3, y3, x4, y4);
        double longest = Math.max(Math.max(Math.max(Math.max(Math.max(firstDistance, secondDistance), 
            thirdDistance), fourthDistance), fifthDistance), sixthDistance);
        longest *= 100;
        longest = (int) longest;
        longest /= 100;
        return longest;
    }
}