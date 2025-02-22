public class OverloadingExample {
        // Overloaded methods
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public String concatenate(String str1, String str2) {
            return str1 + str2;
        }

        public static void main(String[] args) {
            OverloadingExample example = new OverloadingExample();

            System.out.println(example.add(5, 10));           // Invokes the first add method
            System.out.println(example.add(3.5, 7.2));        // Invokes the second add method
            System.out.println(example.concatenate("Hello ","World")); // Invokes the concatenate method
        }
    }

