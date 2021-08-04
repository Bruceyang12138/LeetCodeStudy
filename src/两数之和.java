public class 两数之和 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 4};

        twoSum(a, 6);


    }


    public static int[] twoSum(int[] nums, int target) {

        int[] twoSum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.println(nums.length);
                System.out.println("现在的第一个数字为"+nums[i]+"   第二个数字为"+nums[j]);
                if (nums[i] + nums[j] == target && i!=j) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                    return twoSum;
                }
            }
        }
        return twoSum;
    }

}
