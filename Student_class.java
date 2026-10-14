class Student {
String name;
int age;
static int count = 0;
Student(String n, int a) {
    name = n;
    age = a;
    count++;
}

void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

public static void main(String[] args) {
    String studentName = "Aastha";
    int studentAge = 19;

    Student s1 = new Student(studentName, studentAge);
    Student s2 = new Student("Rahul", 20);

    s1.display();
    s2.display();

    System.out.println("Total Students: " + count);
 }

}
