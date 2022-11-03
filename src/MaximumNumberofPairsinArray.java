import java.util.ArrayList;
import java.util.List;

public class MaximumNumberofPairsinArray {
    /*
    2341. Maximum Number of Pairs in Array
    to see question => https://leetcode.com/problems/maximum-number-of-pairs-in-array/
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(2);

        System.out.println(nums);
        int pairFlag = 0;
        while (nums.subList(1, nums.size()).contains(nums.get(0))) {
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(0).equals(nums.get(i))) {
                    pairFlag+=1;
                    nums.remove(0);
                    nums.remove(i - 1);
                }
            }
            if (nums.isEmpty()){
                break;
            }
        }
        result.add(pairFlag);
        result.add(nums.size());
        System.out.println(result);
    }
}