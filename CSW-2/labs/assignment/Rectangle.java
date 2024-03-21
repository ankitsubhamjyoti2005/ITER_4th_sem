// package assignment;

// class Rectangle {
//     private double length,width;
//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     public double getLength() {
//         return length;
//     }

//     public void setLength(double length) {
//         this.length = length;
//     }

//     public double getWidth() {
//         return width;
//     }

//     public void setWidth(double width) {
//         this.width = width;
//     }

//     public double calculateArea() {
//         return length * width;
//     }

//     public double calculatePerimeter() {
//         return 2 * (length + width);
//     }

//     public static void main(String[] args) {
//         Rectangle rectangle = new Rectangle(5.0, 3.0);

//         System.out.println("Rectangle Area: " + rectangle.calculateArea());
//         System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
//     }
// }


class Laptop {
    private String model;
    private double price;

    // Constructor
    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Setter methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Laptop Model: " + model + ", Price: $" + price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Laptop
        Laptop myLaptop = new Laptop("Dell XPS 15", 1299.99);

        // Set the model using the setter method
        myLaptop.setModel("HP Spectre x360");

        // Print the laptop object using toString()
        System.out.println(myLaptop);
    }
}


class College {
    private String collegeName;
    private String collegeLoc;

    public College(String name, String location) {
        this.collegeName = name;
        this.collegeLoc = location;
    }

    // Getters for collegeName and collegeLoc (optional)
    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}
class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int id, String name, College college) {
        this.studentId = id;
        this.studentName = name;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled in College: " + college.getCollegeName() + " (" + college.getCollegeLoc() + ")");
    }
}
public class Main {
    public static void main(String[] args) {
        // Create two College objects
        College college1 = new College("ABC College", "City A");
        College college2 = new College("XYZ College", "City B");

        // Create two Student objects and enroll them in colleges
        Student student1 = new Student(101, "Alice", college1);
        Student student2 = new Student(102, "Bob", college2);

        // Display student information
        System.out.println("Student 1:");
        student1.displayStudentInfo();
        System.out.println();

        System.out.println("Student 2:");
        student2.displayStudentInfo();
    }
}

//6
abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters and setters for title and author (optional)
        
    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();
}
class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + pageCount);
    }
}
class Magazine extends LibraryResource {
    private String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + issueDate);
    }
}
class DVD extends LibraryResource {
    private int duration; // in minutes

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + duration + " minutes");
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        // Example usage:
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 256);
        Magazine magazine = new Magazine("National Geographic", "Various Authors", "March 2024");
        DVD dvd = new DVD("Inception", "Christopher Nolan", 148);

        // Display details
        book.displayDetails();
        System.out.println();
        magazine.displayDetails();
        System.out.println();
        dvd.displayDetails();
    }
}


//7
// Account.java
abstract class Account {
    private String accNo;
    private double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdrawal(double amount);

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: $" + balance);
    }
}

// SavingsAccount.java
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        // Calculate interest and add to balance
        double interest = amount * (interestRate / 100);
        super.deposit(amount + interest);
    }

    @Override
    public void withdrawal(double amount) {
        if (super.balance >= amount) {
            super.withdrawal(amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

// CurrentAccount.java
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accNo, double balance, double overdraftLimit) {
        super(accNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdrawal(double amount) {
        if (super.balance - amount >= -overdraftLimit) {
            super.withdrawal(amount);
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }
}

// BankingApplication.java (Main class)
public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 2000, 1000);

        // Deposit and withdrawal operations
        savingsAccount.deposit(500);
        savingsAccount.withdrawal(200);
        currentAccount.withdrawal(2500);

        // Display account details
        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountDetails();

        System.out.println("\nCurrent Account Details:");
        currentAccount.displayAccountDetails();
    }
}


//9

// Interface class for loose coupling
interface EnrollmentSystem {
    void enrollStudent(student student, Course course);

    void dropStudent(student student, Course course);

    void displayEnrollmentDetails();
}

// Student class with high cohesion
class student {
    private String studentId;
    private String studentName;

    public student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

// Course class with high cohesion
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Enrollment class with high cohesion
class Enrollment implements EnrollmentSystem {
    private List<student> enrolledStudents;
    private List<Course> enrolledCourses;

    public Enrollment() {
        this.enrolledStudents = new ArrayList<student>();
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public void enrollStudent(student student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println("Enrolled student " + student.getStudentName() +
                " in course " + course.getCourseName());
    }

    @Override
    public void dropStudent(student student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println("Dropped student " + student.getStudentName() +
                    " from course " + course.getCourseName());
        } else {
            System.out.println("Student not enrolled in the specified course.");
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println("Student: " + enrolledStudents.get(i).getStudentName() +
                    ", Course: " + enrolledCourses.get(i).getCourseName());
        }
    }
}

public class School {
    public static void main(String[] args) {
        // Demonstrate loose coupling and high cohesion
        EnrollmentSystem enrollmentSystem = new Enrollment();
        student student1 = new student("S001", "John Doe");
        student student2 = new student("S002", "Jane Smith");
        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Database Management");

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course2);
        enrollmentSystem.displayEnrollmentDetails();
    }
}

//1
package assignment;

class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

// CarTester class
public class CarTester {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Camry");
        Car myCar2 = new Car(null, null);

        System.out.println("Initial make and model of myCar1: " + myCar1.getMake() + " " + myCar1.getModel());
        System.out.println("Initial make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());

        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        System.out.println("Updated make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());
    }
}



