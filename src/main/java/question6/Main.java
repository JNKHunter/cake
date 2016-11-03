package question6;

/**
 * Created by John on 11/1/16.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(-5,-5,5,5);
        Rectangle rect2 = new Rectangle(-7,-8,9,5);

        System.out.println(getIntersection(rect1, rect2));
    }

    private static Rectangle getIntersection(Rectangle rect1, Rectangle rect2){
        int rect1LeftEdge = rect1.leftX;
        int rect1RightEdge = rect1.leftX + rect1.width;
        int rect1TopEdge = rect1.bottomY + rect1.height;
        int rect1BottomEdge = rect1.bottomY;

        int rect2LeftEdge = rect2.leftX;
        int rect2RightEdge = rect2.leftX + rect2.width;
        int rect2TopEdge = rect2.bottomY + rect2.height;
        int rect2BottomEdge = rect2.bottomY;

        int rectOriginX = 0;
        int rectOriginY = 0;
        int rectWidth = 0;
        int rectHeight = 0;

        if((rect1RightEdge >= rect2LeftEdge && rect2RightEdge >= rect1LeftEdge) &&
                (rect1BottomEdge <= rect2TopEdge && rect1TopEdge >= rect2BottomEdge)){

            rectOriginX = Integer.max(rect1LeftEdge, rect2LeftEdge);
            rectOriginY = Integer.max(rect1BottomEdge, rect2BottomEdge);

            int rectXIntersect = Integer.min(rect1RightEdge, rect2RightEdge);
            int rectYIntersect = Integer.min(rect1TopEdge, rect2TopEdge);

            rectWidth = (Math.abs(rectOriginX - rectXIntersect));
            rectHeight = (Math.abs(rectOriginY - rectYIntersect));
        }
        return new Rectangle(rectOriginX,rectOriginY,rectWidth,rectHeight);
    }
}
