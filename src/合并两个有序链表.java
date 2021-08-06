import java.util.List;

import static sun.misc.Version.print;

class ListNode{
    int val;//数据域
    ListNode next;//指针域
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class 合并两个有序链表 {

    public static void main(String[] args) {
        //手动建链
        ListNode l1 =new ListNode(1);
        ListNode l2 =new ListNode(2);
        ListNode l3 =new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        System.out.println(l1);
        ListNode l =l1;
        //for循环建链
        int[] set2 ={3,4};
        ListNode  r= new ListNode(1);    //创建首节点，节点的val是1
        ListNode p;                     //声明一个变量用来在移动过程中指向当前节点
        p=r;                      //指向首节点

        for(int i=0 ;i<set2.length;i++){
            ListNode node = new ListNode(set2[i]);  //生成新的节点
            p.next=node;               //把新节点连起来 ,注意p相当于临时操作指针，则第一次的p.next实际等价于r.next
            p=p.next;           //当前节点往后移动
        }
        System.out.println(r);


        System.out.println( mergeTwoLists(l,r));

    }

    public static   ListNode mergeTwoLists(ListNode l,ListNode r){
        //思路，计划用两个工作指针i,j，同时向next走，把较小的值直接插到新的链表之中即可，走到两个指针都为null时结束
        ListNode ans=new ListNode(0,null);
        ListNode ansNext=ans; //ans的工作指针
        ansNext.next=new ListNode(999);//随意在尾巴初始化一个值
        ListNode i=l;
        ListNode j=r;
        while (i!=null && j!=null){
            if(i.val<=j.val){
            ListNode newNode =new ListNode(i.val);
            if(newNode!=null){
            ansNext.next=newNode;
            ansNext=ansNext.next;
            i=i.next;  //工作指针i向后走一步
             }
            }else if(i.val>j.val){
                ListNode newNode =new ListNode(j.val);
                ansNext.next = newNode;
                ansNext=ansNext.next;
                j=j.next;
            }
        }
        if(i!=null){
            System.out.println("链表1内还有值");
            ansNext.next=i;
        }else if(j!=null){
            System.out.println("链表2内还有值");
            ansNext.next=j;
        }
        //ans 后面直接拼接上工作指针还没走完的链表
          if(l==null && r==null){

              return l;
          }
        return ans.next;//初始化头结点的值不需要git
    }

    //定义链表节点,如果写在这里，class ListNode是一个非静态的内部类，只能被该类的非静态方法访问
  /*  class ListNode{
        int val;//数据域
        ListNode next;//指针域
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }*/
}
