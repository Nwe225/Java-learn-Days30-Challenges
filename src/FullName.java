public class FullName {
    public static void main(String[] args) {
        System.out.println(square(2));
        int age = 21;
        if (age >= 21) {
            System.out.println("You may sign up!");
        }
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("Happy Birthday to you! You are %d years old now!\n", age);
    }

    static double square(double number) {
        return number * number;
    }

}