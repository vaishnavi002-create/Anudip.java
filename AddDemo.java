class Addition {
    int num1, num2, sum;

    Addition(int a, int b) {
        num1 = a;
        num2 = b;
        sum = num1 + num2;
    }

   
    void display() {
        System.out.println("Sum: " + sum);
    }
}

public class AddDemo {
    public static void main(String[] args) {
        
        Addition add = new Addition(10, 20);

        
        add.display();
    }
}

