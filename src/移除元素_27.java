public class 移除元素_27 {

//可以先使用交换排序，让数组变为有序表
public static void main(String[] args) {
    int[] nums={6,6};
    System.out.println("最终长度为="+removeElement(nums,6));
}

    public  static int removeElement(int[] nums, int val){
        int temp;
        int len=nums.length;//最终长度
        for(int i=0 ;i+1<len;i++){
            //有序表内两个相邻元素相等，删去后面那个

            if(nums[i]==val ){
                for(int j=i;j+1<len;j++){
                    nums[j]=nums[j+1];
                }

                len=len-1;
                i--;
                System.out.println("数组长度已减一,现在为"+len);
                //出现相同时.i当然要回退一位，方便去判断下一个是否相同
            }else{
                return 0;
            }
        }
        System.out.println("现在的len为 "+len);
        if((nums[0] ==val && len==1) || len==0){
            return 0;
        }
        for(int i =0;i<len-1;i++){
            System.out.println(nums[i]);
        }

        return  len;
    }
}
