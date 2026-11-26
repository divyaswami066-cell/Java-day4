
import java.util.ArrayList;

public class ShoppingCartManagement {
    public static void main(String[] args) {

        // Create lists for products and quantities
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();

        // 1. Add products to the cart
        cart.add("Laptop");
        quantities.add(1);

        cart.add("Mouse");
        quantities.add(2);

        cart.add("Keyboard");
        quantities.add(1);

        cart.add("Headphones");
        quantities.add(3);

        // 2. Remove a product from the cart
        int index = cart.indexOf("Keyboard");
        if (index != -1) {
            cart.remove(index);
            quantities.remove(index);
        }

        // 3. Update quantity of a product
        index = cart.indexOf("Mouse");
        if (index != -1) {
            quantities.set(index, 5);
        }

        // 4. Display all cart products
        System.out.println("Shopping Cart:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i) + " - Quantity: "
                    + quantities.get(i));
        }

        // 5. Check whether a product exists
        if (cart.contains("Laptop")) {
            System.out.println("Laptop is available in the cart.");
        } else {
            System.out.println("Laptop is not in the cart.");
        }

        // 6. Calculate total number of products
        int total = 0;
        for (int quantity : quantities) {
            total += quantity;
        }
        System.out.println("Total number of items: " + total);

        // 7. Clear cart after checkout
        cart.clear();
        quantities.clear();

        System.out.println("Cart after checkout: " + cart);
        System.out.println("Total products after checkout: " + cart.size());
    }
}
