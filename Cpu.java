class CPU {
String brand;
double speed;


public CPU(String brand, double speed) {
this.brand = brand;
this.speed = speed;
}
}


class Computer {
String model;
CPU cpu;


public Computer(String model, CPU cpu) {
this.model = model;
this.cpu = cpu;
}


public void displayInfo() {
System.out.println("Model: " + model + ", CPU: " + cpu.brand + ", Speed: " + cpu.speed);
}
}


class MainBai9 {
public static void main(String[] args) {
CPU cpu = new CPU("Intel", 3.5);
Computer pc = new Computer("Dell", cpu);
pc.displayInfo();
}
}
