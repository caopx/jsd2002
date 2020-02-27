package Testkao;
/*
 * 请输入打印一个倒99乘法口诀（15分）
 */
public class Test01 {

	public static void main(String[] args) {
		for(int i=9;i>=1;i--) {//行
			for(int j=1;j<=i;j++) {//列
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}

	}

}
