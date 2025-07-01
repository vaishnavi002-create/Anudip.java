
interface Printable {
    void print();
}


interface Showable {
    void show();

}   




class Multipleinterface implements Printable, Showable {
    public void print() {
        System.out.println("Printing document..!");
    }

    public void show() {
        System.out.println("Showing document..!");
    }
    public static void main(String[] args) {
        Multipleinterface doc = new Multipleinterface();
        doc.print();
        doc.show();
    }
}

    

