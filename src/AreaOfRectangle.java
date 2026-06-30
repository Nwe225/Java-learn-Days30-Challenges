import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        double length;
        double width;
        double area;

        System.out.print("Enter the length of the rectangle:");
        length=scanner.nextDouble();

        System.out.print("Enter the width of the rectangle :");
        width=scanner.nextDouble();

        area=length*width;

        System.out.println("The area of the rectangle is :"+area+"cm^2");

        scanner.close();


    }

}