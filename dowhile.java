
//This program repeatedly asks the user for a password using a do-while loop until the correct password is entered.


public class dowhile{
    public static void main(String[] args) {
        int attempts = 0;
        boolean bikeStarted = false;

        do {
            attempts++;
            System.out.println("Trying to start the bike... Attempt " + attempts);
            if (attempts == 3) {  // Let's assume bike starts on 3rd attempt
                bikeStarted = true;
            }
        } while (!bikeStarted);

        System.out.println("Bike started successfully!");
    }
}

