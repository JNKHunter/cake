package question39;

/**
 * Created by jhunter on 12/23/16.
 */
public class Main {

    public static void main(String[] args) {
        findFloor(100, 13);
    }

    public static int findFloor(int numFloors, int targetFloor){
        int numberOfTries = 0;

        for(int i = 0; i < numFloors; i += 2){
            numberOfTries += 1;

            if(i > targetFloor){
                System.out.println("number of tries is: " + numberOfTries);
                return i - (i - targetFloor);
            }
        }
        return 99;
    }

}
