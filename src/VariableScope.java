public class VariableScope {
    public static void main(String[] args){
        int x=1;
        System.out.println(x);
        doSomething();
    }

    static void doSomething() {
        // Method implementation
        int x=2;
        System.out.println(x);
    }
}