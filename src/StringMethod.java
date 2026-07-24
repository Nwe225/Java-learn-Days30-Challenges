public class StringMethod {
    public static void main(String[] args){
        String name="Bro Code";
        int length=name.length();
        int letter=name.charAt(1);
        int index=name.indexOf("o");
        int lastIndex=name.lastIndexOf("o");

        name=name.toUpperCase();

        name=name.toLowerCase();

        name=name.trim();

        name=name.replace("o","a");

        if (name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello"+name);
        }
    }
}