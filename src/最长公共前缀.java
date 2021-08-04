public class 最长公共前缀 {

    public static void main(String[] args) {
      //最长公共前缀 t1=  new 最长公共前缀();
      String str[]={"AC","AB","AA"};
      System.out.println(LongestCommonPrefix(str));
    }
    public static String LongestCommonPrefix(String[] strs) {
        int min = 201;
        String ans = "";
        int flag = 0;
        System.out.println("程序运行正常");
        for(int i=0;i< strs.length ;i++){
            min = strs[i].length();
        }
        for(int i = 0 ; i<min ; i++){
            for(int j= 0 ; j+1< strs.length;j++){
                if (strs[j].charAt(i) == strs[j+1].charAt(i)){
                    flag= 1;
                }else
                    flag =0;
            }
            if (flag == 1){
                ans = ans + strs[i].charAt(i);//即然是公共前缀，那在哪一个字符串里取都可以
            }
        }
        return ans;
    }
}
