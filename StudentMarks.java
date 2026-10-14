class StudentMarks {
int marks1, marks2, marks3;
static String universityName = "COER University";
StudentMarks(int m1, int m2, int m3) {
    marks1 = m1;
    marks2 = m2;
    marks3 = m3;
}

void display() {
    double average = (marks1 + marks2 + marks3) / 3.0;

    System.out.println("University: " + universityName);
    System.out.println("Marks 1: " + marks1);
    System.out.println("Marks 2: " + marks2);
    System.out.println("Marks 3: " + marks3);
    System.out.println("Average: " + average);
}

public static void main(String[] args) {
    StudentMarks s = new StudentMarks(85, 90, 80);
    s.display();
}

}
