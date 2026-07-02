import java.util.Scanner;
public class Main{
    public static void main{
        int age=25;
        if(age>=18){
            System.out.println("You are an adult.");
        }
        else{
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
            System.out.println("You are a chlild!");
        }
        scanner.close();
    }
}