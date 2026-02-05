class Address {
String street;
String city;


public Address(String street, String city) {
this.street = street;
this.city = city;
}
}


class StudentBai7 {
String id;
String name;
Address address;


public void display() {
System.out.println("ID: " + id + ", Name: " + name + ", Street: " + address.street + ", City: " + address.city);
}
}


class MainBai7 {
public static void main(String[] args) {
Address addr = new Address("123 St", "HCM");
StudentBai7 s = new StudentBai7();
s.id = "SV02";
s.name = "Tuan";
s.address = addr;


s.display();
}
}
