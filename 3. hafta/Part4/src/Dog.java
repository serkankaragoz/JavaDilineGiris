public class Dog extends Animal{
    public Dog(String name){
        super(name); // Animal constructorunu cagirir.
    }

    @Override
    public void makeSound() {
        System.out.println("In Dog class");
        System.out.println("Hav hav");
    }
}
