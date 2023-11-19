import java.util.Scanner;

public class BirthDateTime
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your date of birth?");
        int birthYear = SafeInput.getRangedInt(in, "Year", 1950, 2010);

        System.out.println("Enter the month of birth (1-12):");
        int birthMonth = SafeInput.getRangedInt(in, "Month", 1, 12);

        int maxDays;
        switch (birthMonth)
        {
            case 2:
                System.out.println("Enter the day of birth (1-28):");
                maxDays = 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Enter the day of birth (1-30):");
                maxDays = 30;
                break;

            default:
                System.out.println("Enter the day of birth (1-31):");
                maxDays = 31;
                break;

        }

        int day = SafeInput.getRangedInt(in, "Day", 1, maxDays);

        System.out.println("Enter the hour (1-24):");
        int hours = SafeInput.getRangedInt(in, "Hour", 1, 24);

        System.out.println("Enter the minutes (1-59):");
        int minutes = SafeInput.getRangedInt(in, "Minutes", 1, 59);

        System.out.println("Your Birthday is: " + birthMonth + "/" + day + "/" + birthYear + "   " + hours + ":" + minutes);

    }
}
