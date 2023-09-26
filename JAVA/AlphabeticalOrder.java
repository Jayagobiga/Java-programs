import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            System.out.print("Enter a name (or type 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }

        System.out.print("Order (A for Ascending, D for Descending): ");
        char order = scanner.nextLine().charAt(0);
        scanner.close();
        if (order == 'A' || order == 'a') {
            Collections.sort(names);
        } else if (order == 'D' || order == 'd') {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid choice. Please enter 'A' or 'D' for order.");
            return;
        }
        System.out.println("Sorted Names:");
        for (String sortedName : names) {
            System.out.println(sortedName);
        }
    }
}
