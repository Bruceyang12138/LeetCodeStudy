import  java.util.*;
public class 最长公共前缀 {

    public static void main(String[] args) {
      //最长公共前缀 t1=  new 最长公共前缀();
      String str[]={"flower"};
      System.out.println(LongestCommonPrefix(str));
    }
    public static String LongestCommonPrefix(String[] strs) {
        int min = 201;
        String ans = "";
        int flag = 0;
        System.out.println("程序运行正常"+strs.length);
        for(int i=0;i< strs.length ;i++){
           if(strs[i].length() <= min)
           {min = strs[i].length();}
        }
        if(strs.length>1) {
            for (int i = 0; i < min; i++) {
                System.out.println("i=" + i);
                for (int j = 0; j + 1 < strs.length; j++) {
                    System.out.println("j=" + j);
                    if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                        flag = 1;
                    } else {
                        flag = 0;
                        return ans;
                    }
                }
                System.out.println("现在的flag是" + flag);
                if (flag == 1) {
                    ans = ans + strs[0].charAt(i);//即然是公共前缀，那在哪一个字符串里取都可以,但是及其有可能导致数组越界
                }
            }
        }else{
            return  strs[0];
        }
        return ans;
    }
}
