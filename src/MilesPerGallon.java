import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter traveled miles");
        double userMiles = input.nextDouble();

        System.out.println("Enter gallons");
        double userGallons = input.nextDouble();

        double userMileage = (userMiles/((double)userGallons));

        System.out.printf("The result is %.2f miles / gallon\n", userMileage);

    }
}
