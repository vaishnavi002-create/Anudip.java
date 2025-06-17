public class Builtinfunction {
     public static void main(String[] args) {
        String str = "Hello, World!";

        // Length of string
        System.out.println("Length: " + str.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Substring
        System.out.println("Substring (0,5): " + str.substring(0, 5));

        // Replace
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // Check if contains
        System.out.println("Contains 'Hello': " + str.contains("Hello"));

        // Character at index
        System.out.println("Char at 1: " + str.charAt(1));

        // Index of substring
        System.out.println("Index of ',': " + str.indexOf(','));

         double number = 16.0;

        // Square root
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + sqrt);

        // Power
        double power = Math.pow(number, 2);
        System.out.println(number + " raised to the power 2 is " + power);

        // Sine
        double radians = Math.toRadians(30);
        double sine = Math.sin(radians);
        System.out.println("Sine of 30 degrees is " + sine);

        // Absolute value
        double negative = -25.5;
        double absValue = Math.abs(negative);
        System.out.println("Absolute value of " + negative + " is " + absValue);

        // Maximum
        double max = Math.max(10, 20);
        System.out.println("Maximum of 10 and 20 is " + max);

    }
}

    

