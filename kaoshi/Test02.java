package Testkao;
/*
 * 2.编写程序求1到10的和并输出该结果?（5分）
 */
public class Test02 {

	public static void main(String[] args) {
		int num = 0;//存和
		for(int i=1;i<=10;i++) {
			num += i;
		}
		System.out.println("和为：" + num);

	}

}
