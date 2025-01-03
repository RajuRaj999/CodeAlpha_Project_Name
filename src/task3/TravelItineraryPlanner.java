package task3;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Scanner;

	public class TravelItineraryPlanner {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Travel Itinerary Planner!");

	        // Collect user input for destinations and dates
	        List<String> destinations = getUserDestinations(scanner);
	        Map<String, String> dates = getUserDates(destinations, scanner);

	        // Generate and display the travel plan
	        generateTravelPlan(destinations, dates);

	        scanner.close();
	    }

	    private static List<String> getUserDestinations(Scanner scanner) {
	        List<String> destinations = new ArrayList<>();

	        System.out.print("Enter the number of destinations: ");
	        int numDestinations = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        for (int i = 0; i < numDestinations; i++) {
	            System.out.print("Enter destination " + (i + 1) + ": ");
	            destinations.add(scanner.next());
	        }

	        return destinations;
	    }

	    private static Map<String, String> getUserDates(List<String> destinations, Scanner scanner) {
	        Map<String, String> dates = new HashMap<>();

	        for (String destination : destinations) {
	            System.out.print("Enter the date for " + destination + " (e.g., MM/DD/YYYY): ");
	            String date = scanner.next();
	            dates.put(destination, date);
	        }

	        return dates;
	    }

	    private static void getMap(String destination) {
	        System.out.println("Fetching map for destination :" + destination);
	    }

	    private static void getWeather(String destination) {
	        String apiKey = "sca_esv=70";
	        String apiUrl = "https://www.google.com/search?q=weather+of"+destination+"&"+apiKey ;
	        System.out.println("Fetching weather information for " + destination + " from " + apiUrl);
	    }
	    private static void calBudget(String destination){
	        System.out.println("Calculating Budget for "+destination);
	    }
	    private static void generateTravelPlan(List<String> destinations, Map<String, String> dates) {
	        System.out.println("\nYour Travel Plan:");

	        for (String destination : destinations) {
	            System.out.println("Destination: " + destination);
	            System.out.println("Date: " + dates.get(destination));
	            getMap(destination);
	            getWeather(destination);
	            calBudget(destination);
	            System.out.println();
	        }
	    }
	}


