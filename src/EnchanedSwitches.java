import java.util.Scanner;

public class EnchanedSwitches {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day=scanner.nextLine();
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday.");
            case "Saturday", "Sunday" -> System.out.println("It's a weekend.");
            default -> System.out.println("Invalid day of the week.");
        }

        scanner.close();
        }
    }
