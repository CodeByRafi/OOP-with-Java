class Animal 
{
    String name;
    public Animal(String name) 
    {
        this.name = name;
    }
    public void speak() {
        System.out.println("An animal makes a sound.");
    }
}

// Dog class (child class of Animal)
class Dog extends Animal {

    // Constructor to initialize the name of the dog
    public Dog(String name) {
        super(name);  // Call the constructor of the parent class (Animal)
    }

    // speak method for Dog class
    @Override
    public void speak() {
        System.out.println(this.name + " barks.");
    }
}

// Cat class (child class of Animal)
class Cat extends Animal {

    // Constructor to initialize the name of the cat
    public Cat(String name) {
        super(name);  // Call the constructor of the parent class (Animal)
    }

    // speak method for Cat class
    @Override
    public void speak() {
        System.out.println(this.name + " meows.");
    }
}

// Main class to run the program
public class AnimalInheritance {
    public static void main(String[] args) {
        // Create objects of Animal, Dog, and Cat classes
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Call the speak method for each object
        animal.speak();
        dog.speak();
        cat.speak();
    }
}
