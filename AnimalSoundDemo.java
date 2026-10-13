abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Bark! Bark!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

public class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Dog(),
            new Cat(),
            new Dog(),
            new Cat()
        };

        for (Animal animal : animals) {
            animal.makeSound(); // Runtime polymorphism
        }
    }
}
