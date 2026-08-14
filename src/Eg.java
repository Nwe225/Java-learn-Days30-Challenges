public class Eg {
    public static void main(String[] args) {
        String pizza = "Pepperoni";
        System.out.println(pizza);
    }
    static String backPizza(String bread) {
        return bread + " Pizza";
    }
    static String backPizza(String bread, String cheese) {
        return bread + " Pizza with " + cheese;
    }

    static String backPizza(String bread,String cheese,String topping){
        return topping+" "+cheese+" "+bread+" Pizza";
    }
}