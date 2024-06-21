import java.util.*;
public class Main extends pizza
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the pizza type: Veg pizza or Non-veg pizza");
        String pizza_type= s.nextLine();
        System.out.println();
        // System.out.println("Do you want extra cheese?");
        // String extra_cheese=s.nextLine();
        System.out.println("Do you want extra toppings?");
        String extra_toppings=s.nextLine();
        pizza p=new pizza();
        int total_sum=p.total(extra_toppings,pizza_type);
        System.out.println("The total amount for the pizza is: "+total_sum);
    }
}