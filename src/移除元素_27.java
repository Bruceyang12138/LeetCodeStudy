public class 移除元素_27 {

//可以先使用交换排序，让数组变为有序表
public static void main(String[] args) {
    int[] nums={3,2,2,3};
    System.out.println("最终长度为="+removeElement(nums,3));
}

    public  static int removeElement(int[] nums, int val){
        int len=nums.length;//最终长度
        for(int i=0 ;i<len;i++){
            if(nums[i]==val ){
                len=len-1;
                System.out.println("数组长度已减一,现在为"+len);
                //为了保证全部数组元素都向前移动了，
                for(int j=i;j+1<nums.length;j++){
                    nums[j]=nums[j+1];
                }
                i--;

                //出现相同时.i当然要回退一位，方便去判断下一个是否相同
            }
        }
        System.out.println("现在的len为 "+len);
        if((nums[0] ==val && len==1) || len==0){
            return 0;
        }
        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return  len;
    }
}

