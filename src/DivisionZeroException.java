public class DivisionZeroException {

    public static void main(String[] args) throws Exception{
        try {
            int result = 10/0; // Intentional division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("An arithmetic error occurred: "+ e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }
    }
}
