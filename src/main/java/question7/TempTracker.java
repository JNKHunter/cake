package question7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by John on 11/3/16.
 */
public class TempTracker {
    int min = 0;
    int max = 0;
    int total = 0;
    double mean = 0;
    int curModeKey = 0;
    int curModeVal = 0;
    int numTemps = 0;
    Map<Integer, Integer> temps = new HashMap<>();

    public void insert(int temp){
        //Keep a running count and total of temperatures. This is for caching purposes
        numTemps += 1;
        total += temp;

        if(min > temp){
            min = temp;
        }

        if(max < temp){
            max = temp;
        }

        //Put the temp into hash set. If it exists, just increment count
        if(temps.containsKey(temp)){
            int val = temps.get(temp);
            val += 1;
            temps.put(temp, val);
        }else{
            temps.put(temp, 1);
        }

        //Set the mode value and key. If the current temperature's frequency is higher than the current mode, promote to new mode.
        if(temps.get(temp) > curModeVal){
            curModeVal = temps.get(temp);
            curModeKey = temp;
        }


        mean = total/numTemps;

    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getMean() {
        return mean;
    }

    public int getMode() {
        return curModeKey;
    }
}
