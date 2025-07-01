
 class Book {
    
    private String title;
    private String author;
    private double price;

  
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } 
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Book b = new Book();   

       
        b.setTitle("Wings of Fire");
        b.setAuthor("A.P.J. Abdul Kalam");
        b.setPrice(299.99);

       
        System.out.println("Book Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: " + b.getPrice());
    }
}

