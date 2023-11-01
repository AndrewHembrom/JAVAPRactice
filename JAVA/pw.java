import java.io.Console;
public class pw {
    public static void main(String args[]){
        String str;
        Console con = System.console();
        str = con.readLine("Enter your name: ");
        con.printf("Your name is: %s\n", str);
        System.out.println("Enter the password: ");
        char[] ch = con.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("Your Password is: "+pass);
    }
}
