public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extraToppings = false;
    private Boolean extraCheese = false;
    private int basePrice;
    private int cheesePrice;
    private int vegToppingPrice;
    private int nonVegToppingPrice;
    private int bagPrice;
    private Boolean bagAdded;
    private Boolean billGenerated;
    private BillGenerator billGenerator;

    public Boolean getVeg() {
        return isVeg;
    }

    public Boolean getExtraToppings() {
        return extraToppings;
    }

    public Boolean getExtraCheese() {
        return extraCheese;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getCheesePrice() {
        return cheesePrice;
    }

    public int getVegToppingPrice() {
        return vegToppingPrice;
    }

    public int getNonVegToppingPrice() {
        return nonVegToppingPrice;
    }

    public int getBagPrice() {
        return bagPrice;
    }

    public Boolean getBagAdded() {
        return bagAdded;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";
        this.price = 0;
        this.cheesePrice=80;
        this.vegToppingPrice=70;
        this.nonVegToppingPrice=120;
        this.bagPrice = 20;
        this.bagAdded = false;
        this.billGenerated = false;
        this.billGenerator = new BillGeneratorImpl();
        // your code goes here

        if(this.isVeg){
            this.basePrice = 300;
            this.price += basePrice;
        }else{
            this.basePrice = 400;
            this.price += basePrice;
        }
    }

    public Pizza(Boolean isVeg,BillGenerator billGenerator){

        this.isVeg = isVeg;
        this.bill = "";
        this.price = 0;
        this.cheesePrice=80;
        this.vegToppingPrice=70;
        this.nonVegToppingPrice=120;
        this.bagPrice = 20;
        this.bagAdded = false;
        this.billGenerated = false;
        this.billGenerator = billGenerator;
        // your code goes here

        if(this.isVeg){
            this.basePrice = 300;
            this.price += basePrice;
        }else{
            this.basePrice = 400;
            this.price += basePrice;
        }
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int pr){
        this.price = pr;
    }

    public void addExtraCheese() {

        if(Boolean.TRUE.equals(this.extraCheese)) return;

        this.extraCheese = true;
        this.price += this.cheesePrice;
    }

    public void addExtraToppings(){

        if(Boolean.TRUE.equals(this.extraToppings)) return;

        this.extraToppings = true;
        if(this.isVeg){
            // add toppings acc to veg pizza price
            this.price += vegToppingPrice;
        }else{ // add toppings acc to non veg pizza price
            this.price += nonVegToppingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.bagAdded = true;
        this.price += this.bagPrice;
    }

    public String getBill(){

        // your code goes here

        String tempBill = billGenerator.getBill(this);
        this.bill = tempBill;

        return this.bill;
    }
}