import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double total = 0.0;
        boolean more;

        do {
            double price = SafeInput.getRangedDouble(in, "Enter item price", 0.5, 10.00);

            total += price;

            more = SafeInput.getYNConfirm(in, "Do you have another item?");
        }
        while (more);
        System.out.printf("Total price: $%.2f%n", total);
    }
}
