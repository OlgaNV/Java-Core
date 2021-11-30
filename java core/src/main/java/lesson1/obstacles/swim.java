package lesson1.obstacles;

import lesson1.Player.Player;

public class Water extends Let {
    private int length;

    public Water(int length) {
        this.length = length;
    }
    @Override
    public <Swimable> boolean doIt(Player animal) throws InterruptedException {
        if (animal instanceof Swimable)
            return ((Swimable) Player).wait(length);
        else
            return false;
    }
    public int getLength(){
        return length;
    }
}