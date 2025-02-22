public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] array = {12, 23, 34, 45, 56, 78, 67, 89};
            System.out.println(array[10]); // Throws IndexOutOfBoundsException
            int result = 10 / 0; // Throws ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic error: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Array index error: " + e.getMessage());
        } finally {
            System.out.println("End of program.");
        }
    }
}
