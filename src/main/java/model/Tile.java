package model;
import util.Types;
public class Tile {
    /** My Attributes */
    private int x=0;
    private int y=0;
    private char type;

    /**
     * It's our constructor for the x and y coordinates and our type
     * Its on Tile of our Board
     * @param x
     * @param y
     * @param type
     */
    public Tile(int x, int y, char type) {
        //var Point
        this.x = x;
        this.y = y;

        this.type = validateSrc(type);
    }

    public char getType() {
        return type;
    }

    public void setWall() {
        this.type = Types.WALL;
    }
    public void setPlayer() {
        this.type = Types.PLAYER;
    }
    public void setBox() {
        this.type = Types.BOX;
    }
    public void setVoid() {
        this.type = Types.VOID;
    }
    public void setGaol() {
        this.type = Types.GOAL_SQUARE;
    }

    public char validateSrc(char type) throws IllegalArgumentException{
        String checkSrc = String.valueOf(type);
        if (checkSrc.matches("[#@.$*+ ]")) {
            return type;
        } else {
            throw new IllegalArgumentException("Entity does not match our pattern of types");
        }
    }
}
