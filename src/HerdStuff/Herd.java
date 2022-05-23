package HerdStuff;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Moveable {
    private int x;
    private int y;
    private List<Moveable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public  void addToHerd(Moveable moveable){
        this.herd.add(moveable);
    }
    public String toString(){
        StringBuilder organisms = new StringBuilder();
        for(Moveable organism : herd){
            organisms.append(organism.toString()).append("\n");
        }
        return organisms.toString();
    }
}
