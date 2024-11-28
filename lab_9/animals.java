public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("white", 40.0, 15.0);
        cat.makeSound();
        cat.printInfo();
    }
}
public class Animal {
    protected String name = "default";
    protected double height;
    protected double weight;
    protected String color;
    String sound;

    public void eat(){
        System.out.println(name + " ate!");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    String getName(){
        return this.name;
    }
    public void printInfo(){
        System.out.println("Animal: " + this.name + " Height: " +  Double.toString(this.height) + " Weight: " + Double.toString(this.weight));
    }

    void makeSound(){
        System.out.println("this makes no sound");
    }
}

public class Dog extends Animal{
    public Dog(String color, double height, double weight){
        this.name = "Dog";
        this.color = color;
        this.height = height;
        this.weight = weight;
    }
    @Override void makeSound()
    {
        //super.makeSound();  << this makes the original function trigger
        System.out.println("Woof!");
    }
    //extra method
    public void runAfterTail(){
        System.out.println("The dog starts running after tail. Why do they do that??");
    }
}

public class Cat extends Animal{
    public Cat(String color, double height, double weight){
        this.name = "Cat";
        this.color = color;
        this.height = height;
        this.weight = weight;
    }
    @Override void makeSound()
    {
        //super.makeSound();  << this makes the original function trigger
        System.out.println("Meow!");
    }
    //extra method
    public void drinkMilk(){
        System.out.println("Drinking milk is really a cat thing to do");
    }
}

public class Cow extends Animal{
    public Cow(String color, double height, double weight){
        this.name = "Cow";
        this.color = color;
        this.height = height;
        this.weight = weight;
    }
    @Override void makeSound()
    {
        //super.makeSound();  << this makes the original function trigger
        System.out.println("Moo!");
    }
    //extra method
    public void goToField(){
        System.out.println("The cow went to field");
    }
}
