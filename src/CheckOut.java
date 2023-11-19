import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double totalPrice = 0.0;
        double itemPrice = 0.0;
        boolean newItem = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item: ", .50, 10.00);
            totalPrice = totalPrice + itemPrice;
            newItem = SafeInput.getYNConfirm(in, "Do you have another item? [Y/N]: ");

        }
        while (newItem);
        System.out.printf("The total price of all item(s) is: $%.2f%n", + totalPrice);
    }
}
