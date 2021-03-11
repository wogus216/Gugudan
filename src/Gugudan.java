import java.util.Scanner;

public class Gugudan {
public static int[] calculate(int times) {
	int[] result= new int[times];
	for(int i=0; i<result.length; i++) {
		result[i]= times*(i+1);
	}
	return result;
}
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
		
	
		//	int number=sc.nextInt();
	
//	for(int j=2; j<10; j++){
//	for(int i=0; i<number; i++) {
//		System.out.println(number*(i+1));
//	}
//	}
	}

