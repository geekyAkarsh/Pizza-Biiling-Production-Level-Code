public class BillGeneratorImpl implements BillGenerator{
    @Override
    public String getBill(Pizza pizza) {

        String var = "";

        var += "Base Price Of The Pizza: " + pizza.getBasePrice()+"\n";
        if(Boolean.TRUE.equals(pizza.getExtraCheese())){
            var += "Extra Cheese Added: " + pizza.getCheesePrice()+"\n";
        }
        if(Boolean.TRUE.equals(pizza.getExtraToppings())){
            var += "Extra Toppings Added: ";
            if(Boolean.TRUE.equals(pizza.getVeg())){
                var += pizza.getVegToppingPrice() + "\n";
            }else{
                var += pizza.getNonVegToppingPrice() + "\n";
            }
        }
        if(Boolean.TRUE.equals(pizza.getBagAdded())){
            var += "Paperbag Added: " + pizza.getBagPrice() + "\n";
        }
        var += "Total Price: " + pizza.getPrice() + "\n";

        return var;
    }
}
