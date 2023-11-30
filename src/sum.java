import java.util.Arrays;

public class sum {
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
