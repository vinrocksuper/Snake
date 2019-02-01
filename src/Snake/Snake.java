package Snake;


import java.util.ArrayList;

public class Snake {
    public ArrayList<Integer> snake;
    public int direction;

    public Snake(int direction){
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }
    public void setDirection(int direction) {
        this.direction = direction;
    }
}
