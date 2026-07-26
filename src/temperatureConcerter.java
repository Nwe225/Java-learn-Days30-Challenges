import java.util.Scanner;
public class temperatureConcerter {
    public static void main(String[] args){
        double temp;
        double newtemp = 0;
        String unit;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the temperature:");
        temp=scanner.nextDouble();

        System.out.print("Convert to Celsuius to Fahreheit?(C or F):");
        unit=scanner.next().toUpperCase();

        System.out.println(temp);
        System.out.println(unit);

        newtemp = unit.equals("C") ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
        System.out.println("The new temperature is: "+newtemp);


        scanner.close();
    }
}