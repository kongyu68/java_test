package java_test;

public class Exercise {

	public static void main(String[] args) {
		
		
/*		//»Æ½ð·Ö¸îµã
		int i;
		int j;
		int i1=1, j1=20;
		double tmpd1, tmpd2;
		
		tmpd1 = 0.618 - (double)i1/j1;
		for(i=1; i<20; i++){
			for(j=1; j<20; j++){
				if(i%2==0 && j%2==0)
					continue;
				
				if((double)i/j-0.618 < 0)
					tmpd2 = 0.618 - (double)i/j;
				else
					tmpd2 = (double)i/j - 0.618;
				
				if(tmpd2 < tmpd1){
					i1 = i;
					j1 = j;	
					tmpd1 = tmpd2;
				}
			}
		}
		System.out.println(i1 + "," + j1);
		System.out.println((double)i1/j1);*/
		
		
		int i,j,a,b;
		for(i=0; i<21; i++){
			for(j=0; j<21; j++){
				for(a=0; a<21; a++){
					for(b=0; b<21; b++){
						if(i+j == 8 && a-b ==6 && i+a==14 && j+b==10)
							System.out.println("i="+i+",j="+j+",a="+a+",b="+b);						
					}
				}
			}
		}
	}

}
