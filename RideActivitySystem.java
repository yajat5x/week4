import java.util.Scanner;

class Ride {
    int rideNumber;
    String rideName;

    Ride(int rideNumber, String rideName) {
        this.rideNumber = rideNumber;
        this.rideName = rideName;
    }

    void displayPattern() {
        System.out.print(rideName + " : ");

        for (int i = 1; i <= rideNumber; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

public class RideActivitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ride[] rides = new Ride[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Ride " + (i + 1) + " Name: ");
            String name = sc.nextLine();

            rides[i] = new Ride(i + 1, name);
        }

        System.out.println("\n===== RIDE ACTIVITY =====");

        for (int i = 0; i < 5; i++) {
            rides[i].displayPattern();
        }

        sc.close();
    }
}