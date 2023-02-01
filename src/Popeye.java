



import java.util.Scanner;

public class Popeye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance to travel in nautical miles: ");
        double distanceN = scanner.nextDouble();

        System.out.println("Enter the top speed of the boat in knots: ");
        double topSpeed = scanner.nextDouble();

        System.out.println("Enter the average speed of the boat in knots: ");
        double avSpeed = scanner.nextDouble();

        double distanceMiles= distanceN*1.1508;

        double topSpeedMph = topSpeed*1.1508;

        double avSpeedMph = avSpeed*1.1508;

        String userInfo = "The distance to travel in regular miles is: "+distanceMiles+" miles"+"\nThe best case travel time is: "+distanceMiles/topSpeedMph+" hours at "+topSpeed+"knots "+"\nThe average case travel time is: "+distanceMiles/avSpeedMph+" hours at "+avSpeed+" knots";
        System.out.println(userInfo);

}}
