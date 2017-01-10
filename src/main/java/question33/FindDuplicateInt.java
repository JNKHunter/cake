package question33;

/**
 * Created by jhunter on 1/9/17.
 */
public class FindDuplicateInt {

    private int[] values;

    public FindDuplicateInt(int[] values){
        this.values = values;
    }

    public int sumAllValues(int length){
        return ((length * length) + length)/2;
    }

    public int findDuplicate(){
        return sumAllValues(values.length) - sumAllValues(values.length - 1);
    }
}
