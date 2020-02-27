package exam;
//2.编写程序求1到10的和并输出该结果?
public class Test2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("sum="+sum);
	}

}
