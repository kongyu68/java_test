package java_test;

import java.util.Scanner;

/*5
第一个整数：5
8
第二个整数：8
比较5>8:false
比较5>=8:false
比较5<8:true
比较5<=8:true
比较5==8:false
比较5!=8:true*/

public class Operator {
    public static void main (String[] args){
        Scanner s =new Scanner(System.in);
        int a =s.nextInt();
        System.out.println("第一个整数："+a);
        int b=s.nextInt();
        System.out.println("第二个整数："+b);
        System.out.println("比较"+a+">"+b+":"+ (a>b));
        System.out.println("比较"+a+">="+b+":"+ (a>=b));
        System.out.println("比较"+a+"<"+b+":"+ (a<b));
        System.out.println("比较"+a+"<="+b+":"+ (a<=b));
        System.out.println("比较"+a+"=="+b+":"+ (a==b));
        System.out.println("比较"+a+"!="+b+":" +(a!=b));
        
    }
}
