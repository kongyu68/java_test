package java_test;
import java.util.Scanner;

/*使用System.out.println("") 向控制台输出数据
 * 从控制台输入数据，需要用到Scanner类
 * */

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		//使用Scanner读取整数
        int a = s.nextInt();
        System.out.println("读取的整数值是："+a);
        
		//使用Scanner读取浮点数
        float f = s.nextFloat();
        System.out.println("读取的浮点数的值是："+f);
        
		//使用Scanner读取字符串
        String str = s.nextLine();
        System.out.println("读取的字符串是："+str);
        
		//读取了整数后，接着读取字符串
        /* 需要注意的是，如果在通过nextInt()读取了整数后，再接着读取字符串，
         * 读出来的是回车换行:"\r\n",因为nextInt仅仅读取数字信息，而不会读走回车换行"\r\n".
         * 所以，如果在业务上需要读取了整数后，接着读取字符串，那么就应该连续执行两次nextLine()，
         * 第一次是取走整数，第二次才是读取真正的字符串 */
        int i = s.nextInt();
        System.out.println("读取的整数是"+ i);
        String rn = s.nextLine();
        String str1 = s.nextLine();
        System.out.println("读取的字符串是："+str1);
	}

}

// 输入：1 2.11 dsafd\r\n1\r\naaaaa
