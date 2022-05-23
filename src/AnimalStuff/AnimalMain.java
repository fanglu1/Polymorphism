package AnimalStuff;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        NoiseCapable Dog = new Dog();
        Dog.makeNoise();

        NoiseCapable Cat = new Cat("Garfield");
        Cat.makeNoise();
        Cat c = (Cat) Cat;
        c.purr();
    }
}
