
import  java.lang.*;
class Employee {
private int ID;
private String name;
private int age;
private static int nextId = 1;

public Employee(String name, int age) {
    this.name = name;
    this.age = age;
    this.ID = nextId++;
}

public void show() {
    System.out.println("Id=" + ID + "\tName=" + name + "\tAge=" + age);
}

public void showNextId() {
    System.out.println("Next employee ID will be=" + nextId);
 }
}
class Gargabe_Collection{
    public static void main(String[] args) {


        Employee E = new Employee("Ram", 50);
        E.show();
        E.showNextId();
        Employee F = new Employee("Raghu", 25);
        F.show();
        F.showNextId();
        Employee G = new Employee("Sita", 25);
        G.show();
        G.showNextId();

        {
            // it is sub block to keep
            // all those interns
            Employee X = new Employee("Geeta", 30);
            X.show();
            Employee Y = new Employee("Hari", 40);
            Y.show();
            X.showNextId();
            Y.showNextId();
        }

        E.showNextId();
    }
}