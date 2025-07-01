class Multilevelinheritance {

    void dance() {
        System.out.println("My friends are dancing");
    }

    public static void main(String[] args) {
       
        Lion l = new Lion();
        l.roar();  
        l.meow();  
        l.dance();
        l.speak();

    }
}


class SingleInheritance extends Multilevelinheritance {
    void speak(){
        System.out.println("I am speaking");
    }
}


class Cat extends SingleInheritance {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Third Level: Inheriting Cat
class Lion extends Cat {
    void roar() {
        System.out.println("Lion is roaring");
    }
}
