public class Factorialrecurssion {
   
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        int number = 7;  
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

    

