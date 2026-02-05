class Rectangle {
private double width;
private double height;


public Rectangle() { this(1, 1); }
public Rectangle(double side) { this(side, side); }
public Rectangle(double width, double height) {
this.width = width;
this.height = height;
}


public double getArea() { return width * height; }
}


class MainBai6 {
public static void main(String[] args) {
Rectangle r1 = new Rectangle();
Rectangle r2 = new Rectangle(5);
Rectangle r3 = new Rectangle(4, 6);


System.out.println(r1.getArea());
System.out.println(r2.getArea());
System.out.println(r3.getArea());
}
}
