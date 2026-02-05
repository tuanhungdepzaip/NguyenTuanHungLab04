class Book {
private String id;
private String title;
private double price;


public Book() { this.price = 0; }


public Book(String id, String title, double price) {
this.id = id;
this.title = title;
this.price = price;
}


public void display() {
System.out.println("ID: " + id + ", Title: " + title + ", Price: " + price);
}
}


class MainBai3 {
public static void main(String[] args) {
Book b1 = new Book();
Book b2 = new Book("B01", "Java", 50);


b1.display();
b2.display();
}
}
