import java.util.Scanner;

public class Gugudanmain {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է����ּ���");
		Scanner sc= new Scanner(System.in);
			int j=sc.nextInt();
			for(int times=2; times<j+1; times++) {
			int[] result= Gugudan.calculate(times);
			Gugudan.print(result);
			}
	}
}