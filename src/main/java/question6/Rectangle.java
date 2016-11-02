package question6;

/**
 * Created by John on 11/1/16.
 */
public class Rectangle {


    // coordinates of bottom left corner
    Integer leftX;
    Integer bottomY;

    // dimensions
    Integer width;
    Integer height;

    public Rectangle(Integer leftX, Integer bottomY, Integer width, Integer height) {
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public String toString() {
        return String.format("(%d, %d, %d, %d)", leftX, bottomY, width, height);
    }


}
