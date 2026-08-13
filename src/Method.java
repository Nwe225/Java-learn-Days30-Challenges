public class Method {
    public static void main(String[] args){
        String name="Bro";
        int age=25;

        happyBirthday(name,age);

}
    static void happyBirthday(String name,int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n",name);
        System.out.printf("Happy Birthday to you! You are %d years old now!\n",age);

    }
}