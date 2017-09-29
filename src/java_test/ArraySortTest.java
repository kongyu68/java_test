package java_test;

public class ArraySortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{18,62,68,82,65,9};
		
		int i,j,tmp;
		
		//选择法排序
/*		for(i=0; i<a.length-1; i++){
			for(j=i+1; j<a.length; j++){
				if(a[i]<a[j]){
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		} */
		
		
		//冒泡法排序
/*		for(i=0; i<a.length-1; i++){
			for(j=0; j<a.length-1-i; j++){
				if(a[j]>a[j+1]){
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		
		for(i=0; i<a.length; i++){
			System.out.println(a[i]);
		}*/
		
		//增强型for循环
		//注：增强型for循环只能用来取值，却不能用来修改数组里的值
/*		for(int each : a){
			System.out.println(each);
		}*/
		
		//复制数组
/*		把一个数组的值，复制到另一个数组中
		System.arraycopy(src, srcPos, dest, destPos, length)
*/
		
		int b[] = new int[3]; //分配了长度是3的空间，但是没有赋值
        
        //通过数组赋值把a数组的前3位赋值到b数组
         
        //方法一： for循环，略
		
        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的启始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度        
        System.arraycopy(a, 0, b, 0, 3);
         
        //把内容打印出来
        for (i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
	}

}
