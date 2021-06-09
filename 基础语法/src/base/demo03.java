package base;

public class demo03 {
    public static void main(String[] args) {
//        类型转换
        //低---高
        //byte,short,char--int--long---float---double
        int i = 128;
        byte b = (byte)i;//内存溢出
        //强制类型转换 （类型） 变量名   高到低
        //自动转换  低--高
        System.out.println(i);
        System.out.println(b);

        System.out.println((int)23.7);//23
        System.out.println((int)-45.89f);//-45

        char c = 'a';
        int d = c+1;
        System.out.println(d);
        System.out.println((char)d); //b

        //操作比较大的数的时候，注意溢出问题
        //jdk7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money * years;// -1474836480,计算的时候精度溢出了
        long total2 = money * years;// -1474836480，默认int，转换之前已经存在问题。

        long total3 = money*((long)years);//先转long
        System.out.println(total3);
    }
}
