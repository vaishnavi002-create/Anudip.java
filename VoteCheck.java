public class VoteCheck {

    
    public static void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        int personAge = 16;
        checkEligibility(personAge);  
    }
}
