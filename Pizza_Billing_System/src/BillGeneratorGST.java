public class BillGeneratorGST implements BillGenerator{

    private int gst;

    public int getGst() {
        return gst;
    }

    public void setGst(int price) {
        this.gst = (int) (price*.18);
    }

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

        this.setGst(pizza.getPrice());
        var += "GST added: " + this.getGst() + "\n";
        pizza.setPrice(pizza.getPrice()+this.gst);

        var += "Total Price: " + pizza.getPrice() + "\n";

        return var;
    }
}
