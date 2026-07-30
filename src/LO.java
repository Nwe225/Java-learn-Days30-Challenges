import java.util.Scanner;

public class LO {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String username;

        System.out.print("Enter your username: ");
        username=scanner.nextLine();

        if (username.length()<4 || username.length()>10){
            System.out.println("Invalid username length. It should be between 4 and 10 characters.");
        } else if (username.contains(" ") || username.contains("-")){
            System.out.println("Username must not contain space or undersores");

        } else if (username.equals("admin")){
            System.out.println("Welcome, admin!");
        }
        else{
            System.out.println("Welcome, " + username + "!");
        }
    }
}