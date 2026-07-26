public class SubString {
    public static void main(String[] args){
        String email="Bro123@gmailc.com";
        String usename=email.substring(0,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@"));
        System.out.println(domain);
    }
}