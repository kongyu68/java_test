package java_test;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;   		  //声明一个引用，但不会创建数组
		a = new int[5];   //创建数组，并且使用引用a指向该数组
		a[0] = 1;
		
		int[] b = new int[5]; //声明的同时，指向一个数组
		
		System.out.println(a.length); //打印数组的长度
		
		
		//写法一： 分配空间同时赋值
        int[] c = new int[]{100,102,444,836,3236};
        
        //写法二： 省略了new int[],效果一样
        int[] d = {100,102,444,836,3236};
        
        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
        //int[] e = new int[3]{100,102,444,836,3236};
        
        
        
        //二维数组
        //初始化二维数组
        int[][] aa = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
        aa[1][2] = 5;  //可以直接访问一维数组，因为已经分配了空间
           
        //只分配了二维数组
        int[][] bb = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
        bb[0]  =new int[3]; //必须事先分配长度，才可以访问
        bb[0][2] = 5;
         
        //指定内容的同时，分配空间
        int[][] cc = new int[][]{
                {1,2,4},
                {4,5},
                {6,7,8,9}
        };
        
        
	}

}
