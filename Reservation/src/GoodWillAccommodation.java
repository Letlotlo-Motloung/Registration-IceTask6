import java.util.Scanner;

public class GoodWillAccommodation {
    private static final int KING_SUITE_PRICE = 2500;
    private static final int STUDIO_PRICE = 1500;
    private static final int BUDGET_ROOM_PRICE = 800;
    private static int kingSuiteCount = 3;
    private static int studioCount = 5;
    private static int budgetRoomCount = 7;
    private static int totalReservations = 0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("Welcome to Good Will Accommodation (GWA)");
                System.out.println("1. Make a reservation");
                System.out.println("2. Check existing reservations");
                System.out.println("3. Exit");
                System.out.print("Please select an option: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        makeReservation(scanner);
                        break;
                    case 2:
                        System.out.println("Total reservations made: " + totalReservations);
                        break;
                    case 3:
                        System.out.println("Thank you for using GWA services. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (choice != 3);
        }
    }

    private static void makeReservation(Scanner scanner) {
        System.out.println("Available room types:");
        System.out.println("1. King Suite at R" + KING_SUITE_PRICE + " per night");
        System.out.println("2. Studio at R" + STUDIO_PRICE + " per night");
        System.out.println("3. Budget Room at R" + BUDGET_ROOM_PRICE + " per night");
        System.out.print("Please choose a room type: ");
        int roomType = scanner.nextInt();

        switch (roomType) {
            case 1:
                if (kingSuiteCount > 0) {
                    kingSuiteCount--;
                    totalReservations++;
                    System.out.println("King Suite reserved successfully.");
                } else {
                    System.out.println("King Suites are fully booked. Please choose another room type.");
                }
                break;
            case 2:
                if (studioCount > 0) {
                    studioCount--;
                    totalReservations++;
                    System.out.println("Studio reserved successfully.");
                } else {
                    System.out.println("Studios are fully booked. Please choose another room type.");
                }
                break;
            case 3:
                if (budgetRoomCount > 0) {
                    budgetRoomCount--;
                    totalReservations++;
                    System.out.println("Budget Room reserved successfully.");
                } else {
                    System.out.println("Budget Rooms are fully booked. Please choose another room type.");
                }
                break;
            default:
                System.out.println("Invalid room type selected. Please try again.");
        }
    }
}