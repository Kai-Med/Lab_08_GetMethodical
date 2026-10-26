import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Part A
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Username is: " + name);

        //Part B
        int number = SafeInput.getInt(in, "Enter an integer");
        System.out.println("Integer is: " + number);

        //Part C
        double decimal = SafeInput.getDouble(in, "Enter a double");
        System.out.println("Double is: " + decimal);

        //Part D
        int rangedInt = SafeInput.getRangedInt(in, "Enter a integer", 1, 10);
        System.out.println("Ranged integer is: " + rangedInt);

        //Part E
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a decimal", 0.5, 10.0);
        System.out.println("Ranged double is: " + rangedDouble);

        //Part F
        boolean confirmed = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("Confirmed: " + confirmed);

        //Part G
        String code = SafeInput.getRegExString(in, "Enter a 5-digit code", "^\\d{5}$");
        System.out.println("Code is: " + code);

        //Part H
        SafeInput.prettyHeader("Testing SafeInput");
    }
}
