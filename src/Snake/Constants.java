package Snake;

import javafx.stage.Stage;

public class Constants {
    public Stage stage;
    public Constants(Stage stage){
        this.stage = stage;
    }
    public void update(){
        HEIGHT2 = stage.getY();
        WIDTH2 = stage.getX();
        SCALEX = WIDTH2/WIDTH;
        SCALEY = HEIGHT2/HEIGHT;
    }
    /** These constants can be changed freely */
    // dimensions of the board
    public static final int HEIGHT = 5;
    public static final int WIDTH = 5; //WIDTH MUST BE AT LEAST 6
    //dimensions of the popup screen
    public static double HEIGHT2 = 1000;
    public static double WIDTH2 = 1000;

    /** Don't change these constants */
    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;

    public static double SCALEX = WIDTH2/WIDTH;
    public static double SCALEY = HEIGHT2/HEIGHT;


}
