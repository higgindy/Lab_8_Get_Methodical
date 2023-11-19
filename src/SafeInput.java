import java.util.Scanner;

public class SafeInput
{
    /**
     * returns a String input by the user that must be at least one character
     * @param pipe the scanner to use or hte inout
     * @param prompt the msg for the user telling them what to input
     * @return a string of at least on character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";
        do {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();

            if (response.length() > 0)
                done = true;
            else
                System.out.println("\nYou must enter at least one character\n");


        } while (!done);

        return response;


    }

    /**
     * gets an int val from the user with no constraints
     * @param pipe Scanner to use for the input
     * @param prompt msg to the user for what to enter
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {

        boolean done = false;
        String trash = "";
        int value = 0;

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {

                value = pipe.nextInt();
                pipe.nextLine(); // Clears the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered\n" + trash);
            }

        }while(!done);

        return value;

    }

    /**
     * returns an unconstrained double value
     * @param pipe scanner to use for input
     * @param prompt msg to tell user what to input
     * @return an unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {

        boolean done = false;
        String trash = "";
        double value = 0;

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {

                value = pipe.nextDouble();
                pipe.nextLine(); // Clears the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered\n" + trash);
            }

        }while(!done);

        return value;

    }

    /**
     * gets an int val from the user with no constraints
     * @param pipe Scanner to use for the input
     * @param prompt msg to the user for what to enter
     * @param low the bottom value for the inclusive range
     * @param high the top value for the inclusive range
     * @return any valid int
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {

        boolean done = false;
        String trash = "";
        int value = 0;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {

                value = pipe.nextInt();
                pipe.nextLine(); // Clears the buffer

                if(value >= low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: " + value);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered\n" + trash);
            }

        }while(!done);

        return value;

    }

    /**
     * Gets a double value within an inclusive range
     * @param pipe Scanner to use for input
     * @param prompt msg to user about what to enter
     * @param low low bound of inclusive range
     * @param high high bound of inclusive range
     * @return a double within the inclusive range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {

        boolean done = false;
        String trash = "";
        double value = 0;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {

                value = pipe.nextDouble();
                pipe.nextLine(); // Clears the buffer

                if(value >= low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: " + value);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered\n" + trash);
            }

        }while(!done);

        return value;

    }

    /**
     * Returns a True False value for yes or no input [YN]
     * @param pipe scanner to read the input
     * @param prompt msg to tell the user what to input
     * @return a boolean true or false for yes or no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean done = false;
        boolean retVal = false;
        String response = "";
        do
        {
            System.out.print(prompt + "[YyNn]: ");
            response = pipe.nextLine();

            if (response.toUpperCase().matches("[YN]"))
            {
                done = true;
                if (response.equalsIgnoreCase("Y"))
                {
                    retVal = true;
                } else // N
                {
                    retVal = false;
                }
            } else
            {
                System.out.println("\nYou must enter a [y/n]! \n");
            }

        } while (!done);

        return retVal;
    }

    /**
     * takes a regEx String and returns a valid match from the user
     * @param pipe scanner to use for input
     * @param prompt msg to user telling them what is needed for input
     * @param regEx a String that represents a Regular expression to use for the test
     * @return a String value that matches the Regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false;
        String response = "";
        do
        {
            System.out.print(prompt + " " + regEx + ": ");
            response = pipe.nextLine();

            if(response.matches(regEx))
                done = true;
            else
                System.out.println("\nYou must enter a string that matches the pattern" + regEx + "!\n");


        }while (!done);

        return response;

    }

    public static String prettyHeader(String msg)
    {
        String header = "";
        System.out.println("\n" + msg + ": ");

        for (int i = 0; i < 1; i++)
        {

            for (int f = 0; f <= 60; f++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = 0; i < 1; i++)
        {

            System.out.print("***");
            for (int f = 0; f <= 20; f++)
            {
                System.out.print(" ");
            }
            System.out.print(msg);
            for (int f = 0; f <= 20; f++)
            {
                System.out.print(" ");
            }
            System.out.print("***");
        }
        for (int i = 0; i < 1; i++)
        {

            System.out.println(" ");
            for (int f = 0; f <= 60; f++)
            {
                System.out.print("*");
            }
            System.out.println("");


        }
        return header;
    }










}
