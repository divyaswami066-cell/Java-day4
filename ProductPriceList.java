
import java.util.ArrayList;
import java.util.Collections;

public class ProductPriceList {
    public static void main(String[] args) {

        // 1. Store at least 10 product prices
        ArrayList<Double> prices = new ArrayList<>();

        prices.add(250.0);
        prices.add(1200.0);
        prices.add(450.0);
        prices.add(800.0);
        prices.add(150.0);
        prices.add(2000.0);
        prices.add(650.0);
        prices.add(300.0);
        prices.add(950.0);
        prices.add(500.0);

        // 2. Display all prices
        System.out.println("Product Prices: " + prices);

        // 3. Update the price at a given index
        prices.set(2, 550.0);
        System.out.println("After Updating Index 2: " + prices);

        // 4. Find the highest and lowest prices
        System.out.println("Highest Price: " + Collections.max(prices));
        System.out.println("Lowest Price: " + Collections.min(prices));

        // 5. Calculate the average price
        double sum = 0;

        for (double price : prices) {
            sum = sum + price;
        }

        double average = sum / prices.size();
        System.out.println("Average Price: " + average);

        // 6. Sort prices in ascending order
        Collections.sort(prices);
        System.out.println("Prices in Ascending Order: " + prices);

        // 7. Display prices within a given range
        double minPrice = 300.0;
        double maxPrice = 800.0;

        System.out.println("Prices between " + minPrice
                + " and " + maxPrice + ":");

        for (double price : prices) {
            if (price >= minPrice && price <= maxPrice) {
                System.out.println(price);
            }
        }
    }
}
