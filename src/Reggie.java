import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = "";
        String mNum = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your Social Security Number","\\d{3}-\\d{2}-\\d{4}");
        mNum = SafeInput.getRegExString(in, "Enter your UC M Number","(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Choose a menu choice [Open/Save/View/Quit]","[OoSsVvQq]");

        System.out.println("Your SSN is: " + SSN);
        System.out.println("Your M Number is: " + mNum);
        System.out.println("Your Menu choice is: " + menuChoice);
    }
}
