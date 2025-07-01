interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

interface Cat extends Animal {
    void meow();
}

class Puppy implements Dog {
    public void eat() {
        System.out.println("Eating...");
    }

    public void bark() {
        System.out.println("Barking...");
    }
}

class Kitten implements Cat {
    public void eat() {
        System.out.println("Eating...");
    }

    public void meow() {
        System.out.println("Meowing...");
    }
}

public class Hierarchicalinterface {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();

        Kitten k = new Kitten();
        k.eat();
        k.meow();
    }
}
