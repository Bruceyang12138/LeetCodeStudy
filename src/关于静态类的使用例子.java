public class 关于静态类的使用例子 {

    public static void main(String[] args) {
           // QUN q1 =new QUN(4);//这里会报错的
        System.out.println("Welcome to qunqunstyle's Blog!");
    }
    public class QUN {
        int val;
        public QUN(int val){
            this.val =val;
        }
    }  //非静态内部类，只能被此类的非静态方法访问，如下

    public class t2{
        QUN q1 =new QUN(4);//此处可以实现，而主函数处不可实现，原因是主函数的声明了static
    }



}

//因为每个编译单元都只能有一个公共接口，用public类来表现。
//该接口可以按照要求包含众多的支持包访问权限的类。
//如果有一个以上的public 类，编译器就会报错。
//public class QUN1{}          //错误
class  QUN2{}
