public class 最大子序和_53 {
    public static void main(String[] args) {
    int[] nums={-10000};
    System.out.println(maxSubArray(nums));
    }
    //没啥思路，尝试用暴力破解吧,暴力好像要O(n^3)
    public static int maxSubArray(int[] nums){
        int i=0;
        int len=0;//定义子序列长度
        int sum=0;
        int ans=nums[0];
        for(len=1;len<=nums.length;len++){
            //起始计算用的for循环
            for (int j = 0; j <=nums.length-len; j++) {
                //特定长度内计算用for循环
                sum=0;
                for(i = j;i<len+j;i++){
                    sum=nums[i]+sum;
                }
                System.out.println("目前的sum="+sum);
                if(sum>ans){
                    ans= sum;
                }
            }
        }

        return ans;
    }

}
