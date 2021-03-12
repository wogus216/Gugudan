import java.util.Scanner;

public class Gugudan2main {
	public static void main(String[] args) {
		System.out.println("숫자 두개를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);

		for(int i=2; i<=first; i++) {
			for(int j=0; j<second; j++) {
				int result= i*(j+1);
				System.out.printf("%d*%d=%d%n",i,j+1,result);
			}
		}	
	}
}