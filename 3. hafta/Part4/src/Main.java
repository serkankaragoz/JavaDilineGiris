public class Main {
    public static void main(String[] args) {

        // Polymorphism: Bir nesnenin, miras aldigi siniftaki esneler gbi kullanilabilmesini saglar.

        Animal animal = new Animal("Hayvan");
        animal.makeSound();

        Animal horse = new Horse("At");
        horse.makeSound();

        Animal dog = new Dog("Karabaş");
        dog.makeSound();



        Animal[] animals = new Animal[]{
                new Bird("Cicikuş"),
                new Dog("Karabaş"),
                new Animal("Ikınci hayvan")
        };
        // Animal arrayi icine koydugumuz nesneler farkli tipe olmalarina ragmen
        // tum nesneler Animal sinifindan miras aldigi icin
        // Animal arrayi icine koyabiliyor ve
        // sahip olduklari metodu cagirabiliyoruz.

        for(int i = 0; i < animals.length; i++){
            animals[i].makeSound();
        }


    }
}