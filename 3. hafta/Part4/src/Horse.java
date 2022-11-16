public class Horse extends Animal{
    public Horse(String at) {
        super(at); // Animal constructorunu cagirir.
    }

    @Override
    public void makeSound() {
        System.out.println("In horse class");
    }
}
