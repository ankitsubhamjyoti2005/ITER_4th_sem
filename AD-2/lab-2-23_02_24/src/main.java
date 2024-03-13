import java.util.LinkedList;
import java.util.Queue;

//public class tree {
//    static class Node {
//        int value;
//        Node left, right;
//
//        Node(int value){
//            this.value = value;
//            left = null;
//            right = null;
//        }
//    }
//
//    public void insert(Node node, int value) {
//        if (value < node.value) {
//            if (node.left != null) {
//                insert(node.left, value);
//            } else {
//                //System.out.println(" Inserted " + value + " to left of " + node.value);
//                node.left = new Node(value);
//            }
//        } else if (value > node.value) {
//            if (node.right != null) {
//                insert(node.right, value);
//            } else {
//                //System.out.println("  Inserted " + value + " to right of "+ node.value);
//                node.right = new Node(value);
//            }
//        }
//    }
//    public void traverseInOrder(Node node) {
//        if (node != null) {
//            traverseInOrder(node.left);
//            System.out.print(" " + node.value);
//            traverseInOrder(node.right);
//        }
//    }
//
//
//    public static void main(String args[])
//    {
//        tree tree = new tree();
//        Node root = new Node(5);
//        System.out.println("Binary Tree Example");
//        System.out.println("Building tree with root value " + root.value);
//        tree.insert(root, 2);
//        tree.insert(root, 4);
//        tree.insert(root, 8);
//        tree.insert(root, 6);
//        tree.insert(root, 7);
//        tree.insert(root, 3);
//        tree.insert(root, 9);
//        System.out.println("Traversing tree in order");
//        tree.traverseInOrder(root);
//
//    }
//}

// encapsulatiuon
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
class democlass extends square implements demo{

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
    }
}

