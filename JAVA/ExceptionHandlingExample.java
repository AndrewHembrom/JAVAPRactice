public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Result: " + result);
        // } catch (ArithmeticException e) {
        //     System.out.println("ArithmeticException caught: " + e.getMessage());
        // } catch (RuntimeException e) {
        //     System.out.println("RuntimeException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divideByZero() {
        return 5 / 0; // This will throw an ArithmeticException
    }
}
