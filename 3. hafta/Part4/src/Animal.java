public class Animal {
    private String name;

    public Animal(String name){
        this.setName(name);
    }
    public Animal(){

    }

    public void makeSound(){
        System.out.println("In Animal class");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
