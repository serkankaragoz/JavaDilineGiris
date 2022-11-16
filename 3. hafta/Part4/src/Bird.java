public class Bird extends Animal{
    public Bird(String name){
        super(name); // Animal constructorunu cagirir.

    }

    @Override
    public void makeSound() {
        System.out.println("In Bird class");
        System.out.println("Cik cik");
    }
}
