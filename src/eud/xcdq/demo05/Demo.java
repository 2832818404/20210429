package eud.xcdq.demo05;

import java.util.Scanner;

/**
 * @author hongxiaozheng
 * @date 2021/4/29 19:37
 */
//封装
public class Demo {
    public static void main(String[] args) {
        System.out.println("请输入你的年龄");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        Jay jay = new Jay();
        jay.setAge(age);
        System.out.println(jay.getAge());
    }
}
