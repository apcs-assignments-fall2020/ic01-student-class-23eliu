public class Student extends Person {
    private int classYear;

    public Student(String a, String b, int c) {
        super(a, b);
        this.classYear = c;
    }

    public Student() {
        super("Jerry", "Seinfeld");
        this.classYear = 2024;
    }

    public Student(int c) {
        super(); // if you don't call super(), it'll automatically call super() with no arguments
        this.classYear = c;
    }

    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + "," + this.classYear;
    }
}
/*
public class Student {
    private String firstName;
    private String lastName;
    private int classYear;

    public Student(String a, String b, int c) {
        this.firstName = a;
        this.lastName = b;
        this.classYear = c;
    }

    public Student() {
        this.firstName = "Jerry";
        this.lastName = "Seinfeld";
        this.classYear = 2024;
    }

    public void doSomething() {
        System.out.println("I'm doing my homework");
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getClassYear() {
        return this.classYear;
    }

    public void setFirstName(String firstName) {
        if (firstName.trim().length() != 0) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.trim().length() != 0) {
            this.lastName = lastName;
        }
    }
}
*/