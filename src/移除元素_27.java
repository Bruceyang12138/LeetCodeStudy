public class 移除元素_27 {

//可以先使用交换排序，让数组变为有序表
public static void main(String[] args) {
    int[] nums={1,9,3,7,6,6,6,4,3};
    System.out.println("最终长度为="+removeElement(nums,6));
}

    public  static int removeElement(int[] nums, int val){
        int i=0;
        int j=1;
        int len =nums.length;
        int temp;
        if(nums.length == 0 || ( nums.length==1 && nums[0]==val)){
            return 0;
        }

        for (i=0; i<nums.length; i++)
        {
            for ( j=nums.length-1; j>i; j--)
            {
                if (nums[j]<nums[j-1]){
                    temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }

            }
        }
        System.out.println("排序后的数组为");
        for(int s=0;s<nums.length;s++){
            System.out.println(nums[s]);
        }
        i=0;
        j=1;

        //双指针法
        while (j<nums.length){
            if(nums[i] == val){
                if(nums[j]==val){
                    j++;
                }else{
                    nums[i]=nums[j];

                }
            }else{
                i++;
                j++;
            }
        }
        System.out.println("现在的数组是");
        for(int s=0;s<i;s++){
            System.out.println(nums[s]);
        }
        len =i;
        return  len;
    }
}
