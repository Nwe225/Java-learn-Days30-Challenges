import java.util.Scanner;
public class RandomNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of random numbers to generate: ");
        int n = scanner.nextInt();
        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

        System.out.println("Random numbers:");
        for (int i = 0; i < n; i++) {
            int randomNum = (int)(Math.random() * (max - min + 1)) + min;
            System.out.println(randomNum);
        }
    }
}