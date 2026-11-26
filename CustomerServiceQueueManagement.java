
import java.util.LinkedList;

public class CustomerServiceQueueManagement {
    public static void main(String[] args) {

        // 1. Add customers to the service queue
        LinkedList<String> queue = new LinkedList<>();

        queue.addLast("Amit");
        queue.addLast("Priya");
        queue.addLast("Rahul");
        queue.addLast("Sneha");

        // 2. Add an emergency customer at the beginning
        queue.addFirst("Emergency Customer");

        // 3. Display all waiting customers
        System.out.println("Waiting Customers: " + queue);

        // 4. Serve the first customer
        String served = queue.poll();
        System.out.println("\nServed Customer: " + served);

        // 5. Display the next customer
        System.out.println("Next Customer: " + queue.peek());

        // 6. Remove a particular customer
        queue.remove("Rahul");
        System.out.println("\nRahul removed from the queue.");

        // 7. Display the total number of waiting customers
        System.out.println("Waiting Customer Count: " + queue.size());

        // Display the updated queue
        System.out.println("Updated Queue: " + queue);

        // 8. Continue serving until the queue becomes empty
        System.out.println("\nServing Remaining Customers:");

        while (!queue.isEmpty()) {
            String customer = queue.poll();
            System.out.println("Serving: " + customer);
        }

        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }
}
