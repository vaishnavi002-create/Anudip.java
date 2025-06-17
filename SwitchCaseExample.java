
//This program lets the user choose a snack from a menu using a switch statement and displays their choice.


public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a snack:");
        System.out.println("1. Chips");
        System.out.println("2. Chocolate");
        System.out.println("3. Fruit");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose Chips!");
                break;
            case 2:
                System.out.println("You chose Chocolate!");
                break;
            case 3:
                System.out.println("You chose Fruit!");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
