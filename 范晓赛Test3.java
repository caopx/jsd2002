package exam;
//3.编写程序找出以下数组中最大元素的下标位置及该元素的值?
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
		System.out.println("最大元素的下标位置："+index);
		System.out.println("最大值为："+max);
		
		
		
		

	}

}
