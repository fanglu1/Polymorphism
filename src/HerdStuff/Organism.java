package HerdStuff;

import HerdStuff.Moveable;

public class Organism implements Moveable {
    private int x;
    private int y;

    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public String toString(){
        return "X: " + x + "; " + "Y: " + y;
    }
}
