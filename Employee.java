class Employee {
int empId;
double salary;
static String companyName = "ABC Technologies";
Employee(int id, double s) {
    empId = id;
    salary = s;
}

void display() {
    int employeeNumber = empId;
    double employeeSalary = salary;

    System.out.println("Company: " + companyName);
    System.out.println("Employee ID: " + employeeNumber);
    System.out.println("Salary: " + employeeSalary);
}

public static void main(String[] args) {
    Employee e = new Employee(101, 35000);
    e.display();
  }

}
