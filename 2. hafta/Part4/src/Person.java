public class Person {
    public int dogumYili; // Nesnelerin ozellikleri.
    // Static anahtar kelimesini kullanmadan tanimladigimizda
    // tum nesneleri icin ayri ayri olusturulur.
    // Ancak static anahtar kelimesini kullanarak olusturursak
    // bu sinifta sadece bir kez olusturulmus olur.
    public int boy;
    public int kilo;

    // Constructor: Nesne ilk olustugunda calisir.
    public Person(int dogumYili, int boy, int kilo){
        this.dogumYili = dogumYili;
        this.boy = boy;
        this.kilo = kilo;
    }

    public void showInfos(){
        System.out.println("Dogum yili: " + this.dogumYili);
        System.out.println("Boy: " + this.boy);
        System.out.println("Kilo: " +this.kilo);
    }

    public Person(){

    }



}
