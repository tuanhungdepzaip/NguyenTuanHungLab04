class Employee {
private String id;
private String name;
private double salary;


public Employee(String name) { this.name = name; this.salary = 0; }


public Employee(String id, String name, double salary) {
this.id = id;
this.name = name;
this.salary = salary < 0 ? 0 : salary;
}


public void display() {
System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
}
}


class MainBai4 {
public static void main(String[] args) {
Employee e1 = new Employee("Tuan");
Employee e2 = new Employee("E02", "Nam", 8000);


e1.display();
e2.display();
}
}
