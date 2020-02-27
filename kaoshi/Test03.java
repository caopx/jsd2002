package Testkao;
/*
 * 3.编写程序找出以下数组中最大元素的下标位置及该元素的值?（共20分）
 * 				int arr[]={10,9,1,20,19,30,5};
 */
public class Test03 {

	public static void main(String[] args) {
		int arr[]={10,9,1,20,19,30,5};
		//1.数组中最大值
		int max = Max(arr);
		System.out.println("最大值为：" + max);
		//2.最大值的下标
		int down = Down(arr, max);
		System.out.println("下标为：" + down);
	

	}
	//最大值
	public static int Max(int[] arr) {
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[0]<arr[i]) {
				 max = arr[i];
			}
		}
		return max;
	}
	//下标
	public static int Down(int[] arr,int max) {
		
		for(int i=0;i<arr.length;i++) {
			if(max == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
