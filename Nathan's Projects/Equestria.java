/* Nathan Chau
 * October 13, 2015
 * Equestria Programming Assignment
 */

public class Equestria {
    public static double distance(int x1, int y1, int x2, int y2) {
        int xDistance = Math.abs(x1 - x2);
        int yDistance = Math.abs(y1 - y2);
        double actualDistance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
        return actualDistance;
    }
    
    public static double roadTrip(double diameter) {
        double circumference = diameter * Math.PI;
        return circumference;
    }
    
    public static double threeStop(int x1, int y1, int x2, int y2, int x3, int y3) {
        double firstDistance = distance(x1, y2, x2, y2);
        double secondDistance = distance(x1, y1, x3, y3);
        double thirdDistance = distance(x2, y2, x3, y3);
        double firstAngle = Math.toDegrees(Math.acos((-(Math.pow(firstDistance, 2)) + 
            Math.pow(secondDistance, 2) +  Math.pow(thirdDistance, 2)) / (2 * secondDistance * thirdDistance)));
        double secondAngle = Math.toDegrees(Math.acos((-(Math.pow(secondDistance, 2)) + 
            Math.pow(firstDistance, 2) + Math.pow(thirdDistance, 2)) / (2 * firstDistance * thirdDistance)));
        double thirdAngle = Math.toDegrees(Math.acos((-(Math.pow(thirdDistance, 2)) + 
            Math.pow(secondDistance, 2) + Math.pow(firstDistance, 2)) / (2 * secondDistance * firstDistance)));
        return thirdAngle;
    }  
    
    public static double longestTrip(int x1, int y1, int x2, int y2, int x3, int y3) {
        double firstDistance = distance(x1, y1, x2, y2);
        double secondDistance = distance(x1, y1, x3, y3);
        double thirdDistance = distance(x2, y2, x3, y3);
        double longest = Math.max(Math.max(firstDistance, secondDistance), thirdDistance);
        return longest;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Equestria!");
    }
}