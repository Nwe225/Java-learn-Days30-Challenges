import java.awt.*;
import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double weight;
        double newweight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1:Convert lbs to kgs");
        System.out.println("2:Convert kgs to lbs");
        System.out.print("Enter an option: ");
        choice=scanner.nextInt();

        System.out.println(choice);
        if(choice==1){
            System.out.print("Enter weight in lbs: ");
            weight=scanner.nextDouble();
            newweight=weight*0.453592;
            System.out.println("Weight in kgs: "+newweight);

        }
        else{
            System.out.print("Enter weight in kgs: ");
            weight=scanner.nextDouble();
            newweight=weight*2.20462;
            System.out.println("Weight in lbs: "+newweight);
        }
        scanner.close();
    }

}