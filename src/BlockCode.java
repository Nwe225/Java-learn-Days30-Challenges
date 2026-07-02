import java.util.Scanner;
public class BlockCode{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int age=25;
        if(age>=18){
            System.out.println("You are an adult.");
        }
        else if(age<=18){
            System.out.println("You are a minor.");
        }
        else if(age<0){
            System.out.println("You havenot been born yet.");
        }
        else if(age==0){
            System.out.println("You are a baby.");
        }
        else if (age>=65){
            System.out.println("You are a senior citizen.");
        }
        else {
            System.out.println("You are a child!");
        }
        scanner.close();
    }
}