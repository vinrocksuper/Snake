package Snake;

public class Grid {
    Object[][] board;

    public Grid(){
        board = new Object[Constants.HEIGHT][Constants.WIDTH];
        board[Constants.HEIGHT/2][Constants.WIDTH/2] = new Snake(Constants.RIGHT);
    }

    public void update(){

    }
}
