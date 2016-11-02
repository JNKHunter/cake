package question6;

/**
 * Created by John on 11/1/16.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10,10,10,10);
        Rectangle rect2 = new Rectangle(15,15,10,10);

        getIntersection(rect1, rect2);
    }

    private static void getIntersection(Rectangle rect1, Rectangle rect2){
        int rect1LeftEdge = rect1.leftX;
        int rect1RightEdge = rect1.leftX + rect1.width;
        int rect1TopEdge = rect1.bottomY + rect1.height;
        int rect1BottomEdge = rect1.bottomY;

        int rect2LeftEdge = rect2.leftX;
        int rect2RightEdge = rect2.leftX + rect2.width;
        int rect2TopEdge = rect2.bottomY + rect2.height;
        int rect2BottomEdge = rect2.bottomY;

        if((rect1RightEdge >= rect2LeftEdge && rect2RightEdge >= rect1LeftEdge) &&
                (rect1BottomEdge <= rect2TopEdge && rect1TopEdge >= rect2BottomEdge)){

            System.out.println("intersection!!");


        }
    }
}
