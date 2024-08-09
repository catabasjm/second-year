import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BusRouteDetermination {

    public static void main(String[] args) {
        // Create a map to store bus routes
        Map<String, String[]> busRoutes = new HashMap<>();
        busRoutes.put("PlaceA", new String[]{"Route1", "Route2"});
        busRoutes.put("PlaceB", new String[]{"Route2", "Route3"});
        // Add more routes as needed

        // Get user input for the starting place and destination
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting place: ");
        String startPlace = scanner.nextLine();

        System.out.print("Enter the destination: ");
        String destination = scanner.nextLine();

        // Determine the bus routes
        String[] startRoutes = busRoutes.get(startPlace);
        String[] destinationRoutes = busRoutes.get(destination);

        if (startRoutes != null && destinationRoutes != null) {
            // Find common routes between starting place and destination
            String commonRoute = findCommonRoute(startRoutes, destinationRoutes);

            if (commonRoute != null) {
                System.out.println("Take bus route: " + commonRoute);
            } else {
                System.out.println("No direct bus route found. You may need to transfer between routes.");
            }
        } else {
            System.out.println("Invalid place entered. Please check your input.");
        }

        // Close the scanner
        scanner.close();
    }

    // Helper method to find common route between two arrays of routes
    private static String findCommonRoute(String[] array1, String[] array2) {
        for (String route1 : array1) {
            for (String route2 : array2) {
                if (route1.equals(route2)) {
                    return route1;
                }
            }
        }
        return null; // No common route found
    }
}