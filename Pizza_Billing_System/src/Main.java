public class Main {
    public static void main(String[] args) {

        Pizza p = new Pizza(true);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeaway();
        System.out.println(p.getBill());


        Pizza p1 = new Pizza(true,new BillGeneratorGST());
        p1.addExtraCheese();
        p1.addExtraToppings();
        p1.addTakeaway();
        System.out.println(p1.getBill());
    }
}