class Person {
String name;
int age;
static String country = "India";
Person(String n, int a) {
    name = n;
    age = a;
}

void checkEligibility() {
    boolean eligible = age >= 18;

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Country: " + country);

    if (eligible) {
        System.out.println("Eligible to vote");
    } else {
        System.out.println("Not eligible to vote");
    }
}

public static void main(String[] args) {
    Person p = new Person("Aastha", 19);
    p.checkEligibility();
  }

}
