package java_test;

public class ArraySortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{18,62,68,82,65,9};
		
		int i,j,tmp;
		
		//ѡ������
/*		for(i=0; i<a.length-1; i++){
			for(j=i+1; j<a.length; j++){
				if(a[i]<a[j]){
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		} */
		
		
		//ð�ݷ�����
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
		
		//��ǿ��forѭ��
		//ע����ǿ��forѭ��ֻ������ȡֵ��ȴ���������޸��������ֵ
/*		for(int each : a){
			System.out.println(each);
		}*/
		
		//��������
/*		��һ�������ֵ�����Ƶ���һ��������
		System.arraycopy(src, srcPos, dest, destPos, length)
*/
		
		int b[] = new int[3]; //�����˳�����3�Ŀռ䣬����û�и�ֵ
        
        //ͨ�����鸳ֵ��a�����ǰ3λ��ֵ��b����
         
        //����һ�� forѭ������
		
        //������: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: Դ����
        //srcPos: ��Դ���鸴�����ݵ���ʼλ��
        //dest: Ŀ������
        //destPos: ���Ƶ�Ŀ���������ʼλ��
        //length: ���Ƶĳ���        
        System.arraycopy(a, 0, b, 0, 3);
         
        //�����ݴ�ӡ����
        for (i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
	}

}
