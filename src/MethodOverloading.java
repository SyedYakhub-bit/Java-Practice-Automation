public class MethodOverloading {
    public int addNumbers(int a,int b){
        return a+b;
    }

    public double addNumbers(double a,double b,double c){
        return a+b+c;
    }
    public String addNumbers(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading result=new MethodOverloading();
        System.out.println("Sum of integer numbers is: "+result.addNumbers(20,38));
        System.out.println("Sum of decimal numbers is: "+result.addNumbers(26.373,362.2,37.9));
        System.out.println("Sum of integers is: "+result.addNumbers("Syed","Yakhub"));

    }
}