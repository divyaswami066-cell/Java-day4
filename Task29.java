
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Order ID is the key and order status is the value
        LinkedHashMap<Integer, String> orders = new LinkedHashMap<>();

        int choice;

        do {
            System.out.println("\n===== FOOD DELIVERY ORDER TRACKING =====");
            System.out.println("1. Add New Order");
            System.out.println("2. Update Order Status");
            System.out.println("3. Search Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Display All Orders");
            System.out.println("6. Count Orders by Status");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {

                case 1:
                    System.out.print("Enter Order ID: ");
                    int orderId = Integer.parseInt(sc.nextLine().trim());

                    if (orders.containsKey(orderId)) {
                        System.out.println("Order ID already exists.");
                    } else {
                        orders.put(orderId, "Preparing");
                        System.out.println(
                            "Order added successfully. Status: Preparing"
                        );
                    }
                    break;

                case 2:
                    System.out.print("Enter Order ID: ");
                    int updateId = Integer.parseInt(sc.nextLine().trim());

                    if (orders.containsKey(updateId)) {
                        System.out.println("Choose new status:");
                        System.out.println("1. Preparing");
                        System.out.println("2. Packed");
                        System.out.println("3. Out for Delivery");
                        System.out.println("4. Delivered");
                        System.out.print("Enter status choice: ");

                        int statusChoice =
                            Integer.parseInt(sc.nextLine().trim());

                        String newStatus;

                        switch (statusChoice) {
                            case 1:
                                newStatus = "Preparing";
                                break;
                            case 2:
                                newStatus = "Packed";
                                break;
                            case 3:
                                newStatus = "Out for Delivery";
                                break;
                            case 4:
                                newStatus = "Delivered";
                                break;
                            default:
                                System.out.println("Invalid status choice.");
                                break;
                        }

                        if (statusChoice >= 1 && statusChoice <= 4) {
                            newStatus = getStatus(statusChoice);
                            orders.put(updateId, newStatus);
                            System.out.println("Order status updated to "
                                               + newStatus);
                        }
                    } else {
                        System.out.println("Order not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Order ID to search: ");
                    int searchId = Integer.parseInt(sc.nextLine().trim());

                    String status = orders.get(searchId);

                    if (status != null) {
                        System.out.println("Order ID: " + searchId);
                        System.out.println("Status: " + status);
                    } else {
                        System.out.println("Order not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Order ID to cancel: ");
                    int cancelId = Integer.parseInt(sc.nextLine().trim());

                    if (orders.containsKey(cancelId)) {
                        orders.remove(cancelId);
                        System.out.println("Order cancelled successfully.");
                    } else {
                        System.out.println("Order not found.");
                    }
                    break;

                case 5:
                    if (orders.isEmpty()) {
                        System.out.println("No active orders.");
                    } else {
                        System.out.println("\nOrders in Received Order:");
                        for (Map.Entry<Integer, String> entry
                                : orders.entrySet()) {
                            System.out.println(
                                "Order ID: " + entry.getKey()
                                + " | Status: " + entry.getValue()
                            );
                        }
                    }
                    break;

                case 6:
                    LinkedHashMap<String, Integer> statusCounts =
                        new LinkedHashMap<>();

                    statusCounts.put("Preparing", 0);
                    statusCounts.put("Packed", 0);
                    statusCounts.put("Out for Delivery", 0);
                    statusCounts.put("Delivered", 0);

                    for (String orderStatus : orders.values()) {
                        statusCounts.put(
                            orderStatus,
                            statusCounts.getOrDefault(orderStatus, 0) + 1
                        );
                    }

                    System.out.println("\n===== ORDER STATUS COUNTS =====");
                    for (Map.Entry<String, Integer> entry
                            : statusCounts.entrySet()) {
                        System.out.println(
                            entry.getKey() + " : " + entry.getValue()
                        );
                    }
                    break;

                case 7:
                    System.out.println("Exiting Order Tracking System.");
                    break;

                default:
                    System.out.println("Invalid choice. Select 1 to 7.");
            }

        } while (choice != 7);

        sc.close();
    }

    // Return the selected order status
    public static String getStatus(int choice) {
        switch (choice) {
            case 1:
                return "Preparing";
            case 2:
                return "Packed";
            case 3:
                return "Out for Delivery";
            case 4:
                return "Delivered";
            default:
                return "Unknown";
        }
    }
}
