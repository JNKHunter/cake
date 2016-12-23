package question38;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by jhunter on 12/22/16.
 */
public class Main {


    public static void main(String[] args) {
        Map<Integer, Integer> counts = new HashMap<>();

        for(int i = 0; i < 10000; i++){
            Integer current = rand7();
            if (counts.containsKey(current)) {
                counts.put(current, counts.get(current) + 1);

            }else{
                counts.put(current, 1);
            }
        }

        for(Integer key : counts.keySet()){
            System.out.println("Value for key: " + key + " is: " + counts.get(key));
        }

    }

    public static int rand5(){
        int min = 1;
        int max = 5;
        Random rn = new Random();
        return rn.nextInt(max - min + 1) + min;
    }

    public static int rand7() {

        while (true) {

            // do our die rolls
            int roll1 = rand5();
            int roll2 = rand5();

            int outcomeNumber = (roll1-1) * 5 + (roll2-1) + 1;

            // if we hit an extraneous
            // outcome we just re-roll
            if (outcomeNumber > 21) continue;

            // our outcome was fine. return it!
            return outcomeNumber % 7 + 1;
        }
    }

}

