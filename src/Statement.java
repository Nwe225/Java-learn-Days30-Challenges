import java.util.Scanner;
public class Statement{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your age: ");
        age=scanner.nextInt();

        System.out.print("Enter your name: ");
        name=scanner.nextLine();

        System.out.print("Are you student(true/false): ");
        isStudent=scanner.nextBoolean();

        if(name.isEmpty){
            System.out.println("You didnot enter your name! ");
        }
        else{
            System.out.println("Hello"+name+"1");
        }

        if(isStudent){
            System.out.println("You are a student! ");
        }
        else {
            System.out.println("You are NOT a student! ");
        }
        scanner.close();
    }
}