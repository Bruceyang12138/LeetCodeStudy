public class 搜索插入位置_35 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(searchInsert(nums,0));
    }

    //有序表，要求时间复杂的为O（log n），想到用栈递归二分查找
    public static int searchInsert(int[] nums, int target) {
        int ans = 0;
        ans = binarySearch(nums, 0, nums.length - 1, target);
        return ans;
    }

    public static int binarySearch(int[] nums, int low, int high, int target) {
        int ans = 0;
        int mid = (high - low) / 2 + low;

        if (target == nums[mid]) {
            return mid;
        }
        if (low >= high) {
            if(high<0){high=0;}
            if(low>nums.length-1){low=nums.length;};
            if (target > nums[low]) {
                return low+1;
            }else if(target<nums[high]){
                return high;
            }else{
                return low;
            }

        } else if (target > nums[mid]) {
            return binarySearch(nums, mid + 1, high, target);
        } else if (target < nums[mid]) {
            return binarySearch(nums, low, mid - 1, target);
        }
        return 0;
    }

}
