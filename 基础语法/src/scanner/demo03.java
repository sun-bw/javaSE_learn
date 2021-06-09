package scanner;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int num = 0;
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            num++;
            sum += x;
        }
        System.out.println(num);
        System.out.println(sum);
        scanner.close();
    }
}
