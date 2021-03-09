import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = new int[9];
		for(int j=2; j<10; j++) {
			for(int i=0; i<result.length; i++){
				result[i] = j*(i+1);
			}
			for(int i=0; i<result.length; i++) {
				System.out.println(result[i]);
			}
		}
		
		
//		내 버전!!		
//		System.out.println("값을 입력해주세요");
//		Scanner sc = new Scanner(System.in);
//		int[] result = new int[9];
//	
//		for(int i=2; i<10; i++) {
//			if(i ==2) {
//				System.out.println("2단은 안됩니다.");
//			} else if(i==9) {
//				System.out.println("9단은 안됩니다.");
//			}else {
//				for(int j=0; j<result.length; j++)
//					System.out.println(i*j);
//			}
//		}
	}
}