import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Dog kelly = new Dog("Kelly");
        kelly.bark();
    }

}
import java.util.ArrayList;
import java.util.List;

public abstract class Creature {
    List<Creature> creatures = new ArrayList<>();
    String name = null;
    boolean isAlive = false;
    abstract void breathe();
    abstract void die();
    public void shoutName(){
        if(name != null)
            System.out.println("\n"+name);
        else
            System.out.println("\nError, name is null");
    }
    protected void makeSound(){
        System.out.println("\nNo creature to make a sound");
    };
    public void addCreature(Creature creature){
        creatures.add(creature);
        System.out.println("Creature "+ creature.name + " added");
    }
    public void printCreatures(){
        creatures.forEach(System.out::println);
    }
}

public class Human extends Creature{
    public Human(String name){
        this.name = name;
    }
    @Override
    public void breathe() {
        this.isAlive = true;
        System.out.println("Human breathes");
    }

    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("Human dies :(");
    }

    @Override
    public void makeSound() {
        //super.makeSound(); - yet again, this calls the default func
        System.out.println("\nHuman makes sound");
    }
}

public class Dog extends Creature{
    public Dog(String name){
        this.name = name;
    }
    @Override
    public void breathe() {
        this.isAlive = true;
        System.out.println("Dog breathes");
    }

    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("Dog dies :(");
    }
    public void bark() {
        //super.makeSound(); - yet again, this calls the default func
        System.out.println("\nWoof!");
    }
}

public class Alien extends Creature{
    public Alien(String name){
        this.name = name;
    }
    @Override
    public void breathe() {
        this.isAlive = true;
        System.out.println("Alien breathes");
    }

    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("Alien dies :(");
    }
    @Override
    public  void makeSound() {
        //super.makeSound(); - yet again, this calls the default func
        System.out.println("\nbeep boop?");
    }
}
