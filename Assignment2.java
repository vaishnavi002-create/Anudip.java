class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void carFeature() {
        System.out.println("Car has 4 wheels");
    }
}

class Bike extends Vehicle {
    void bikeFeature() {
        System.out.println("Bike has 2 wheels");
    }
}


public class Assignment2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
        car.carFeature();

        Bike bike = new Bike();
        bike.display();
        bike.bikeFeature();
    }
}


