public class LogicalExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("Allowed to vote");
        }

        if (age < 18 || !hasID) {
            System.out.println("Not allowed");
        }
    }
}

