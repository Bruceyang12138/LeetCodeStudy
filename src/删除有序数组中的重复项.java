public class 删除有序数组中的重复项 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3,4,5};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums){
        int temp;
        int len=nums.length;//最终长度
        for(int i=0 ;i+1<len;i++){
            System.out.println("执行中");
            temp=nums[i];
            //有序表内两个相邻元素相等，删去后面那个
            if(temp==nums[i+1]){
                System.out.println("i的值为="+i+"   temp="+temp+"   nums[i+1]="+nums[i+1]);
                for(int j=i+2;j<len;j++){
                    nums[j-1]=nums[j];

                }

                len=len-1;
                i--;
                System.out.println("数组长度已减一,现在为"+len);
                //出现相同时.i当然要回退一位，方便去判断下一个是否相同
            }
        }
       for(int i =0;i<len-1;i++){
           System.out.println(nums[i]);
       }

        return  len;
    }
}
