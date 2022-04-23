import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        int index = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                index++;
                if(i+1==nums.length-1){
                    temp.add(index);
                }
            }else {
            temp.add(index);
            index=1;}
        }
        return Collections.max(temp);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        FindMaxConsecutiveOnes f = new FindMaxConsecutiveOnes();
        System.out.println(f.findMaxConsecutiveOnes(nums));
    }
}
