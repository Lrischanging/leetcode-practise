import java.util.Arrays;
import java.util.HashMap;
// 1. 两数之和
public class sum {
    // 暴力解法，时间复杂度O(N²)
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {
                            i, j
                    };
                }
            }
        }
        return new int[0];
    }

    // 哈希表查找 target - num[1]，降低时间复杂度为O(N)
    public static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{i, hashtable.get(target - nums[i])};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] nums1 = {3,2,4};
        int[] nums2 = {3,3};
        int target = 9;
        int target2 = 6;
        int[] result = twoSum(nums2, target2);
        System.out.println(Arrays.toString(result));
    }
}
