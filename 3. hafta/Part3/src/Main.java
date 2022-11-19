public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person = new Person("Murat", 25);
        person.kendiniTanit();

        System.out.println("\n");

        Student student = new Student("Serkan", 15, 22004);
        student.kendiniTanit();

        System.out.println(student); // stdent sinifindaki toString metodunu dondur.
        // Eger toString metodu tanimlanmamissa varsayilan toString metodu dondurulur.


    }
}