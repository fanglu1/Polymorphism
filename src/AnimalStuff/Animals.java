package AnimalStuff;

public abstract class Animals {
    private String name;

    public Animals(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name + " eats");
    }
    public void sleep(){
        System.out.println(name + " sleeps");
    }

    public String getName() {
        return name;
    }
}
