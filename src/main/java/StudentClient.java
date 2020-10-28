public class StudentClient {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", "Dylan", 2021);
        System.out.println(s1);

        Student s2 = new Student();
        System.out.println(s2);

        s1.doSomething();

        Student s3 = new Student(2024);
        System.out.println(s3);
    }
}