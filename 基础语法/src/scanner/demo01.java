package scanner;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {

        //创建一个扫描对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        //next不能得到带有空格的字符串
        //nextLine()可以获得空白
        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if(scanner.hasNext()) {
            //使用next方式接收
            String str = scanner.next();
            System.out.println("输出内容为："+str);
        }

        //关闭
        scanner.close();
    }
}
