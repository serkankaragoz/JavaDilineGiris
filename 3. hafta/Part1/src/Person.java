public class Person {
   private int age; // public: tüm dosyalardan görülebilir ve degistirilebilir
                    // private: sadece ait oldugu sinifta gorulebilir ve degistirilebilir.
    private String name;

    private double height;
    private double weight;

    // Constructor: nesne ilk olusturuldugunda cagrilan metod:
    public Person(){
        System.out.println("Insan olusturuldu.");
    }

    public Person(int age, String name, double height, double weight){
        this.setAge(age);
        this.setName(name);
        this.setHeight(height);
        this.setWeight(weight);
    }

    public Person(int age, String name){
        this(age, name, 0.0, 0.0); // girilen degisken tip
        // ve sayisina uygun bir constructor varsa onu cagirir.
    }

    // getter
    public int getAge(){
        return this.age;
    }

    // setter
    // Classimizi yazarken ozelliklerimizi private tanimlama
    // ve getter setter kullanma sebebimiz yetkisiz degistirmelerin
    // onune gecmek. Orneegin bir insanin yasi veya bir urunun fiyati 0'dan kucuk olamaz.
    // Eger yas degiskenimizi public yapsaydik herhangi birisi bu degerleri girebilecekti.
    // Ancak yas degerimizi ve diger ozellikleri private yaparak ve metodlarimiza gerekli kosullari
    // yazarak bu durumun onune gecebiliyoruz.
    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }
        else{
            System.out.println("Insanin yasi en az 0 olmalidir ancak " + age + "degerini girdiniz");
        }
    }

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
