import java.util.Scanner;
class GetInputFromUser
{   
    public static void main(String args[])
    {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.nextLine();
            System.out.println("You entered string "+s);
            int a = in.nextInt();
            System.out.println("YOu entered integer "+a);
            float b = in.nextFloat();
            System.out.println("YOu entered float "+b);
        }
    }

    @Override
    public String toString() {
        return "GetInputFromUser []";
    }
}