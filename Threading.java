public class Threading {
    public static void main(String[] args) {
        
        Thread averagethThread = new Thread(() -> {
            int sum = 0;
            for (int i = 1; i <= 50; i++) {
                sum += i;
            }
            double average = sum / 50.0;
            System.out.println("Average of the first 10 numbers is: " + average);
        });

        Thread squareThread = new Thread(() -> {
            int num = 10;
            int square = num * num;
            System.out.println("Square of the number " + num + " is: " + square);
        });

        try {
            averagethThread.start();
            averagethThread.join();  
            squareThread.start();
            squareThread.join();     

        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}


