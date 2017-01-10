package question33;

/**
 * Created by jhunter on 1/9/17.
 */
public class FindDuplicateInt {

    private int[] values;
    int highest;

    public FindDuplicateInt(int[] values, int highest){
        this.values = values;
        this.highest = highest;
    }

    public int sumAllValues(int value){
        return ((value * value) + value)/2;
    }

    public int findDuplicate(){
        int sum = sumAllValues(highest);
        int arraySum = 0;

        for(int i : values){
            arraySum += i;
        }

        return arraySum - sum;
    }
}
