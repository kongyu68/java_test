package java_test;

import java.util.Scanner;

/*5
��һ��������5
8
�ڶ���������8
�Ƚ�5>8:false
�Ƚ�5>=8:false
�Ƚ�5<8:true
�Ƚ�5<=8:true
�Ƚ�5==8:false
�Ƚ�5!=8:true*/

public class Operator {
    public static void main (String[] args){
        Scanner s =new Scanner(System.in);
        int a =s.nextInt();
        System.out.println("��һ��������"+a);
        int b=s.nextInt();
        System.out.println("�ڶ���������"+b);
        System.out.println("�Ƚ�"+a+">"+b+":"+ (a>b));
        System.out.println("�Ƚ�"+a+">="+b+":"+ (a>=b));
        System.out.println("�Ƚ�"+a+"<"+b+":"+ (a<b));
        System.out.println("�Ƚ�"+a+"<="+b+":"+ (a<=b));
        System.out.println("�Ƚ�"+a+"=="+b+":"+ (a==b));
        System.out.println("�Ƚ�"+a+"!="+b+":" +(a!=b));
        
    }
}
