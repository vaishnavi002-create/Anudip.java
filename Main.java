class Person {
    void displayInfo() {
        System.out.println("This is a person.");
    }
}


class Student extends Person {
    void showDetails() {
        System.out.println("This person is a student.");
    }
}


public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();  
        s.showDetails();  
    }
}
