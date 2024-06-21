public class pizza {
    public static int genBill()
    {
        int labour_wage=30;
        int tax=19;
        int working=30;
        int general_base_sum=labour_wage+tax+working;
        return general_base_sum;
    }
    public static int type(String pizza_type)
    {
        int type_price;
        if(pizza_type.equalsIgnoreCase("veg"))
        {
            type_price=550;
        }
        else
        {
            type_price=600;
        }
        return type_price;
    }
    public static int Toppings(String topping)
    {
        int extra_topping_price;
        if(topping.equalsIgnoreCase("yes"))
            extra_topping_price=50;
        else    
            extra_topping_price=30;
        return extra_topping_price;
    }
    public static int total(String top,String pz_ty)
    {
        int total_bill_amount=Toppings(top)+type(pz_ty)+genBill();
        return total_bill_amount;
    }
}
