interface A {
    void showA();
}


interface B extends A {
    void showB();
}

interface C extends A {
    void showC();
}


class Hybridinheritance implements B, C {
    public void showA() {
        System.out.println("This is A");
    }

    public void showB() {
        System.out.println("This is B");
    }

    public void showC() {
        System.out.println("This is C");
    }

    public static void main(String[] args) {
        Hybridinheritance obj = new Hybridinheritance();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}



