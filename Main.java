class Person{
    //parent class
    String name;
    int age;
    //constructor-give varaibles to a class
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    //method to display personal details
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
//child class to inherit the parent class
class Student extends Person{
    //create class variables
    String school;
    String country;
    //constructor
    Student(String name, int age,String school,String country){
        super(name, age);
        this.school=school;
        this.country=country;
    }
    //method to display student details
    void displaystudent(){
        System.out.println("School: "+school);
        System.out.println("Country: "+country);
    }
}
//main class
public class Main {
    //main method to run the entire code
    public static void main(String[] args) {
        //object to run the student class
        Student s1=new Student("Kingsley", 13, "Ahtoo Montessori", "Canada");
        //run the display method
        s1.display();
        s1.displaystudent();
    }
}