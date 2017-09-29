package java_test;
import java.util.Arrays;

public class ArrayFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        
        //数组复制
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 1, 3);
 
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        
        //把数组转换为字符串
        String content = Arrays.toString(a);
        System.out.println(content);
        
        //排序
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));
        
        
        //查询元素出现的位置                
        //使用binarySearch之前，必须先使用sort进行排序
        //如果数组中有多个相同的元素，查找结果是不确定的
        System.out.println("数字 62出现的位置:"+ Arrays.binarySearch(a, 62));
        
        //比较两个数组的内容是否一样
        int c[] = new int[] { 18, 62, 68, 82, 65, 8 };        
        System.out.println(Arrays.equals(a, c));
        
        //使用同一个值，填充整个数组
        int d[] = new int[6];        
        Arrays.fill(d, 5);  
        System.out.println(Arrays.toString(d));
	}

}


