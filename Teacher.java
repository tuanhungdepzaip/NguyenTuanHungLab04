class Teacher {
private String name;
private String specialization;


public Teacher(String name, String specialization) {
this.name = name;
this.specialization = specialization;
}


public String getName() { return name; }
public void setName(String name) { this.name = name; }


public String getSpecialization() { return specialization; }
public void setSpecialization(String specialization) { this.specialization = specialization; }
}


class ClassRoom {
private String className;
private Teacher teacher;


public ClassRoom(String className) { this.className = className; }


public ClassRoom(String className, Teacher teacher) {
this.className = className;
this.teacher = teacher;
}


public void display() {
System.out.println("Class: " + className + ", Teacher: " + (teacher != null ? teacher.getName() : "None"));
}
}


class MainBai10 {
public static void main(String[] args) {
Teacher t = new Teacher("Mr. A", "Java");
ClassRoom c = new ClassRoom("12A", t);
c.display();
}
}
