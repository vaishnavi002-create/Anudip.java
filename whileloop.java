
//This program shows a person waiting for a bus using a while loop that counts time until 3 minutes pass

public class whileloop {
    public static void main(String[] args) {
        int minutes = 0;
        System.out.println("Waiting for bus...");

        while (minutes < 3) {
            System.out.println("Waiting... " + minutes + " minute(s)");
            minutes++;
        }

        System.out.println("Bus arrived!");
    }
}

