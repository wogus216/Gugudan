import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		//8단,9단 선생님 버전
	System.out.println("사용자가 입력한 값");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if(number <2) {
		System.out.println("값을 잘못 입력하셨습니다.");
	}else if (number >9) {
		System.out.println("값을 제대로 입력해주세요");
	}else {
		for(int i=1; i<10; i++) {
			System.out.println("구구단 결과 값 :"+number*i);
		}
	}
		//내버전 for를 if문 위에 쓴게 실수 !!
	//		System.out.println("구구단 숫자를 입력해주세요");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		for(int i= 1; i< 10; i++) {
//			if(number < 2) {
//				System.out.println("2이상입력부탁드립니다.");
//			} else if(number > 9) {
//				System.out.println("9이하 입력부탁드립니다.");
//			} else {
//				System.out.println("number결과 :"+ number * i);
//			}
//				
//		} 
			
		
		
//		//6단
//		System.out.println("숫자를 입력해주세요");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		int i =1;
//		while(i < 10) {
//			System.out.println(number * i);
//			i++;
//		}
//	System.out.println("------------------");
//		//7단 
//	System.out.println("숫자를 입력해주세요");
//	int number1 = sc.nextInt();
//	for(int j = 1; j < 10; j++) {
//			System.out.println(number1 * j);
//		}
		
//		//2단
//		System.out.println("2단");
//		System.out.println(2 * 1);
//		Systemout.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		System.out.println("---------------");
//		//3단
//		System.out.println("3단");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);	
//		System.out.println(3 * 5);	
//		System.out.println(3 * 6);	
//		System.out.println(3 * 7);	
//		System.out.println(3 * 8);	
//		System.out.println(3 * 9);	
		
		//4단
		
//	System.out.println("4단 출력을 위해 4를 입력해주세요");
//	Scanner sc = new Scanner(System.in);
//	int number= sc.nextInt();
//	System.out.println(number * 1);
//	System.out.println(number * 2);
//	System.out.println(number * 3);
//	System.out.println(number * 4);
//	System.out.println(number * 5);
//	System.out.println(number * 6);
//	System.out.println(number * 7);
//	System.out.println(number * 8);
//	System.out.println(number * 9);

	
	
	
	}
}