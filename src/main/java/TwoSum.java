import java.util.HashMap;
import java.util.Map;

/**
 * Created by John on 6/27/17.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(values.containsKey(complement)){
                return new int[]{i, values.get(complement)};
            } else {
                values.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two values equal target");
    }

    public static void main(String[] args) {
        int[] array = {1,5,6,7,13,15,20,29};
        int[] result = twoSum(array, 419);
        
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
