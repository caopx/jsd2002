package exam;
//1.请输入打印一个倒99乘法口诀
public class Test1 {
	public static void main(String[] args) {
		for(int i=9; i>0; i--) {
			for(int j=1; j<i+1; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}

	}

}
