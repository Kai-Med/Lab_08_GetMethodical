import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter you SSN (123-45-6789)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M number", "^[Mm]\\d{8}$");
        String choice = SafeInput.getRegExString(in, "Menu choice: Open, Save, View, Quit", "^[OoSsVvQq]$");
        System.out.println ("SSN: " + ssn);
        System.out.println ("M Number: " + mNumber);
        System.out.println ("Menu choice: " + choice);
    }
}
