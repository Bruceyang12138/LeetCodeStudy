public class 实现strStr_28 {
    public static void main(String[] args) {
        String haystack="hello";
        String needle="ll";
        System.out.println(strStr(haystack,needle));
    }


    public static int strStr(String haystack,String needle){
        int ans=-1;
        int i=0;//主串用指针
        int j=0;//子串用指针
        //首先联想到KMP算法，还有一种扫描法
        //特殊情况先处理一下
        int point=0;//回退时用的指针
        if("".equals(needle)){
            return 0;
        }
       for(i = 0;i<=haystack.length()-needle.length();i++){
           System.out.println("程序在执行");
             point= i;//记录断点
             while (j<needle.length() && i<haystack.length()){
                 if(haystack.charAt(i)==needle.charAt(j)){
                     i++;
                     j++;
                 }else{
                     j=0;
                     i= point;//恢复断点
                     break;
                 }
             }
             if (j==needle.length()){
                 return point;
             }
         }
       return -1;
    }
}
