import java.util.Scanner;

public class SafeInput
{
    /**
     * Gets a non-empty string
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString;
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }
        while (retString.length() == 0);

        return retString;
    }

    /**
     * Gets any integer
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int value;

        while (true) {
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                return value;
            }
            else
            {
                System.out.print("Invalid input, please enter a integer.");
            }
        }
    }

    /**
     * Gets any double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double value;
        while (true) {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                return value;
            }
            else {
                System.out.print("Invalid input, please enter a number.");
            }
        }
    }

    /**
     * Gets an integer within an inclusive range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
       int value;
       do {
           value = getInt(pipe, prompt + " [" + low + " - " + high + "]");

           if (value < low || value > high) {
               System.out.print("Invalid input, input must be between " + low + " and " + high + ".");
           }
       }
       while (value < low || value > high);

       return value;
    }

    /**
     * Gets a double within an inclusive range
     */

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double value;
        do {
            value = getDouble(pipe, prompt + " [" + low + " - " + high + "]");
            if  (value < low || value > high) {
                System.out.print("Invalid input, input must be between " + low + " and " + high + ".");
            }
        }
        while (value < low || value > high);

        return value;
    }

    /**
     * Gets a yes/no answer
     */

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String answer;
        do {
            System.out.print("\n" + prompt + ": ");
            answer = pipe.nextLine().trim();

            if (answer.equalsIgnoreCase("Y"))
            {
                return true;
            }
                else if (answer.equalsIgnoreCase("N"))
                {
                return false;
            }
                else
            {
             System.out.print("Invalid input, please enter Y or N");
            }
        }
        while (true);
    }

    /**
     * Gets a string matching a regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String value;

        do
        {
          System.out.print("\n" + prompt + ": ");
          value = pipe.nextLine();

          if (!value.matches(regEx))
          {
              System.out.print("Invalid input, please enter a valid regular expression.");
          }
        }
        while (!value.matches(regEx));

        return value;
    }

    /**
     * Prints a centered 60 character wide header
     */
    public static void prettyHeader(String msg)
    {
        final int WIDTH = 60;

        for (int i = 0; i < WIDTH; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        int spaces = WIDTH - 6 - msg.length();
        int leftSpaces = spaces / 2;
        int rightSpaces = spaces - leftSpaces;

        System.out.print("***");

        for (int i = 0; i < leftSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.print("***");
        System.out.println();

        for (int i = 0; i < WIDTH; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}