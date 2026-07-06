import java.util.Scanner;

public class NestState {
    public static void Main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean isStudent=true;
        boolean isSenior=false;
        double price;

        System.out.print("Enter the price: ");
        price=scanner.nextDouble();


        if(isStudent){
            if (isSenior){
                System.out.println("You get a senior discount of 20%");
                price*=0.7;
            }
            else {
                System.out.println("You get a student discount of 10%");
                price*=0.9;
            }
        }else{
            price*=1;
        }
        System.out.println("The price of a ticket is:$"+price);

        scanner.close();
    }
}