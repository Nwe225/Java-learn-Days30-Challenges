import java.util.Random;
public class Rno {
    public static void main(String[] args){

        Random random=new Random();

        int number1;
        int number2;
        int number3;
        boolean isHeads;


        int number1 =random.nextInt(1,6);
        int number2 =random.nextInt(2,7);
        int nubmer3=random.nextInt(0,0);

        if(isHeads){
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
        System.out.println("number1:"+number1);
    }
}