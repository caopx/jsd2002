package Testkao;
/*
 * 3.��д�����ҳ��������������Ԫ�ص��±�λ�ü���Ԫ�ص�ֵ?����20�֣�
 * 				int arr[]={10,9,1,20,19,30,5};
 */
public class Test03 {

	public static void main(String[] args) {
		int arr[]={10,9,1,20,19,30,5};
		//1.���������ֵ
		int max = Max(arr);
		System.out.println("���ֵΪ��" + max);
		//2.���ֵ���±�
		int down = Down(arr, max);
		System.out.println("�±�Ϊ��" + down);
	

	}
	//���ֵ
	public static int Max(int[] arr) {
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[0]<arr[i]) {
				 max = arr[i];
			}
		}
		return max;
	}
	//�±�
	public static int Down(int[] arr,int max) {
		
		for(int i=0;i<arr.length;i++) {
			if(max == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
