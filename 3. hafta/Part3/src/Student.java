// Student nesnesi Person nesnesinden miras alir.
// Person sinifinin saip oldugu degiskenler ve metodlara erisim saglar
public class Student extends Person{
    private long studentID;

    public Student(String name, int age, long studentID){
        super(name, age);
        this.studentID = studentID;

    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    // eger miras aldigimiz siniftaki bir fonksiyou oldugu gibi kulanmak istemezsek
    // o metodu Override (ezmek) edebiliriz.
    // Eger Student tipinden bir nesne kendiniTanit metodunu cagirirsa
    // asagidaki metod calisacaktir.
    @Override
    public void kendiniTanit() {
        super.kendiniTanit(); // Person sinifindaki kendiniTanit() metodunu cagir
        System.out.println("Ogrenci numaram: " + this.studentID);
    }

    @Override
    public String toString() {
       return "Ogrenci ismi: " + getName() + " ogrenci numarasi: " + getStudentID();
    }
}
