class EmployeeBai8 {
String id;
String name;


public EmployeeBai8(String id, String name) {
this.id = id;
this.name = name;
}
}


class Department {
String deptName;
EmployeeBai8 employee;


public Department(String deptName, EmployeeBai8 employee) {
this.deptName = deptName;
this.employee = employee;
}


public void display() {
System.out.println("Dept: " + deptName + ", Employee: " + employee.name);
}
}


class MainBai8 {
public static void main(String[] args) {
EmployeeBai8 e = new EmployeeBai8("E01", "Tuan");
Department d = new Department("IT", e);
d.display();
}
}
