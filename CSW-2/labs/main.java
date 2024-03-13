// encapsulatiuon

import java.util.ArrayList;
import java.util.List;

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
 

//inheritance
class person2 extends Person{
   public void company(){
       System.out.println("extensds objecxt");
   }
}

//polimoism
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}


class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

//interface
interface demo
{
    final int id = 10;
    void fun1();
    void fun2();
    void fun3();
    void draw();
}
class democlass extends Square implements demo{

    @Override
    public void fun1() {
        System.out.println("it is fun-1");
        System.out.println(id);
    }

    @Override
    public void fun2() {
        System.out.println("it is fun-2");
    }

    @Override
    public void fun3() {
        System.out.println("it is fun-3");
    }

    @Override
    public void draw() {
        System.out.println("it is draw");
    }
    
}

class complex {
    double r, i;

    complex(double r, double i) {
        this.r = r;
        this.i = i;
    }
}

public class main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());


        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw(); // Output: "Drawing a circle"
        s2.draw(); // Output: "Drawing a square"

        //interface
        democlass a = new democlass();
        a.fun1();
        a.fun3();

        //generics
        List<Integer> list=new ArrayList<Integer>(10);
        list.add(21);
        // list.add("43"); //it will give an error

        List l = new ArrayList();
        l.add("hello");
        String s =(String) l.get(0);
        System.out.println(s);


        complex c1 = new complex(10, 15);
        System.out.println(c1);


    }
}