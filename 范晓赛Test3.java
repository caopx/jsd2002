package exam;
//3.��д�����ҳ��������������Ԫ�ص��±�λ�ü���Ԫ�ص�ֵ?
//int arr[]={10,9,1,20,19,30,5};
public class Test3 {
	public static void main(String[] args) {
		int[] arr = {10,9,1,20,19,30,5};
		int max = arr[0];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i;				
			}			
		}
		System.out.println("���Ԫ�ص��±�λ�ã�"+index);
		System.out.println("���ֵΪ��"+max);
		
		
		
		

	}

}
