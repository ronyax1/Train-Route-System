import java.util.Scanner;

public class TrainRouteSystem {
    public static void main(String[] args) {
        // Train data
        String[][] trains = {
            {"Humsafar Express", "Kolkata", "Delhi", "2300"},
            {"Tejas Express", "Mumbai", "Goa", "1700"},
            {"Jan Shatabdi", "Chennai", "Hyderabad", "1400"},
            {"Uday Express", "Bangalore", "Hyderabad", "1600"},
            {"Vande Bharat", "Delhi", "Varanasi", "2800"}
        };

        Scanner scanner = new Scanner(System.in);

        // Unique heading
        System.out.println("=== Indian Rail Route Finder ===");
        System.out.print("Enter starting city: ");
        String source = scanner.nextLine();

        System.out.print("Enter destination city: ");
        String destination = scanner.nextLine();

        System.out.println("\nChecking available trains between " + source + " and " + destination + "...\n");

        boolean found = false;

        for (int i = 0; i < trains.length; i++) {
            if (trains[i][1].equalsIgnoreCase(source) && trains[i][2].equalsIgnoreCase(destination)) {
                System.out.println("Train Available:");
                System.out.println("→ " + trains[i][0]);
                System.out.println("Fare: Rs." + trains[i][3]);
                System.out.println("---------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No direct trains found for this route.");
            System.out.println("Try checking nearby cities.");
        }

        scanner.close();
    }
}