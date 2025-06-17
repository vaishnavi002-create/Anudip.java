public class Factorial {

   
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; 
        int fact = factorial(number); 
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
