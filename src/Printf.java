public class Printf{
    public static void main(String[] args){
        String name = "Win";
        char firstLetter='W';
        int age=30;
        double height=60.5;
        boolean isStudent=true;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name starts with a %c\n",firstLetter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("Your height is %.1f inches\n",height);
        System.out.printf("Are you a student? %b\n",isStudent);

    }
}