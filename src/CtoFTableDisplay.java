import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%10s %12s%n", "Celsius", "Fahrenheit");
        System.out.println("------------------------");

        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);

            System.out.printf("%10d %12.2f%n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32.0;
    }
}
