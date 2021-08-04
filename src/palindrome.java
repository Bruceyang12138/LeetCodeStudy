public class palindrome {
    public static void main(String[] args) {

        System.out.println("开始测试代码");
        isPalindrome(-121);
        if(isPalindrome(-121)==true )
            {
                System.out.println("输出了true!");
            }else {
            System.out.println("输出了false");
        }

    }


    public static boolean isPalindrome(int x) {
        int start=x;
        int res=0;
        while(x!=0){
            res =res*10 + x%10;
            x=x/10;
        }
        System.out.println(res);
        return res == start  ? true :false;
    };


}
