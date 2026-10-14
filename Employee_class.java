class Employee {
String name;
double salary;
static String organization = "ABC Technologies";
Employee(String n, double s) {
    name = n;
    salary = s;
}

void compareSalary(Employee e) {
    double salary1 = this.salary;
    double salary2 = e.salary;

    System.out.println("Organization: " + organization);
    System.out.println("Employee 1: " + this.name);
    System.out.println("Salary: " + salary1);
    System.out.println("Employee 2: " + e.name);
    System.out.println("Salary: " + salary2);

    if (salary1 > salary2) {
        System.out.println(this.name + " has a higher salary.");
    } else if (salary2 > salary1) {
        System.out.println(e.name + " has a higher salary.");
    } else {
        System.out.println("Both employees have equal salaries.");
    }
}

public static void main(String[] args) {
    Employee e1 = new Employee("Rahul", 50000);
    Employee e2 = new Employee("Amit", 40000);

    e1.compareSalary(e2);
 }
}
