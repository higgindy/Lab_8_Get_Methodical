import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favInt;
        double favDouble;

        favInt = SafeInput.getInt(in,"What is your favorite Integer? ");
        favDouble = SafeInput.getDouble(in, "What is your favorite double? ");
        System.out.println("Your favorite integer is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);
    }


}
