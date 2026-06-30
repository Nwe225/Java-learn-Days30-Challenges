
import java.util.Scanner;
public class userinput{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String name;
        int age;
        double gpa;
        boolean isStudent;

        System.out.print("Enter your name :");
        name=scanner.nextLine();

        System.out.print("Enter your age :");
        age=scanner.nextInt();

        System.out.print("Enter your GPA :");
        gpa=scanner.nextDouble();

        System.out.print("Are you a student (true/false) :");
        isStudent=scanner.nextBoolean();

        System.out.println("Hello"+name);
        System.out.println("You are"+age+"year old");

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are not enrolled as a student");
        }
        scanner.close();
    }
}

