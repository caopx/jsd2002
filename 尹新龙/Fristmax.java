package ��ϰ5;

public class Fristmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,9,1,20,19,30,5};
		int index = 0;
		int max = a[0];
		for(int i = 0;i < a.length;i++) {
			if(max < a[i]) {
				max = a[i];
				index = i;
			}
		}
		System.out.println("���ֵΪ:" + max);
		System.out.println("�±�Ϊ:" + index);
		
	}

}
