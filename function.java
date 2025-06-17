public class function {
    public static float add(float a, float b, float c ) {
        return a + b + c;
    }

    public static void main(String[] args) {
        float sum= add(45.9f, 34.88f,34.33f);  // Just pass values in order
        System.out.println("The addition is " + sum);
    }
}
