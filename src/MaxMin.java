public class MaxMin {
    public static void main(String[] args) {


        int[] array = {12, 33, -28, 293, -272, 820, -182};

        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println("The maximum of array is " + max);
        System.out.print("The minimum of array is " + min);
    }
}
