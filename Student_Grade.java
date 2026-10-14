class StudentGrade {
String name;
int marks;
static int passingMarks = 40;
StudentGrade(String n, int m) {
    name = n;
    marks = m;
}

void displayGrade() {
    String grade;

    if (marks < 0 || marks > 100) {
        grade = "Invalid Marks";
    } else if (marks < passingMarks) {
        grade = "F";
    } else if (marks >= 90) {
        grade = "A";
    } else if (marks >= 75) {
        grade = "B";
    } else if (marks >= 60) {
        grade = "C";
    } else {
        grade = "D";
    }

    System.out.println("Name: " + name);
    System.out.println("Marks: " + marks);
    System.out.println("Grade: " + grade);
}

public static void main(String[] args) {
    StudentGrade s = new StudentGrade("Aastha", 85);
    s.displayGrade();
  }

}
