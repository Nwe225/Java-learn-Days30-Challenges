import java.util.Scanner;
public class Inter {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        System.out.print("How many second to countdown from?: ");
        int start=scanner.nextInt();
        for (int i=0;i>0;i--)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("HAPPY NEW YEAR! ");
        scanner.close();
    }
}