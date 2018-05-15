package gugudan;
import java.util.Scanner;

public class Gugudan2 {
	//변수가 무엇인지, 데이터 타입이 무엇인지 나만의 방법으로 정리하기 
	public static void main(String[] args) {
		int number;
		int number2;
		int result;
		
		System.out.print("출력하고 싶은 구구단의 단을 입력해주세요. : ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		System.out.println(number+"단을 출력합니다.");
		
		number2 = 1;
		result = number * number2;
		System.out.println(number +" x "+ number2 +" = "+result);
		
		number2 = 2;
		result = number * number2;
		System.out.println(number +" x "+ number2 +" = "+result);
		
		number2 = 3;
		result = number * number2;
		System.out.println(number +" x "+ number2 +" = "+result);
		
		number2 = 4;
		result = number * number2;
		System.out.println(number +" x "+ number2 +" = "+result);
		
		number2 = 5;
		result = number * number2;
		System.out.println(number +" x "+ number2 +" = "+result);
		
		number2 = 6;
		result = number * number2;
		System.out.println(number +" x "+ number2 +" = "+result);
		
		number2 = 7;
		result = number * number2;
		System.out.println(number +" x "+ number2 +" = "+result);
		
		number2 = 8;
		result = number * number2;
		System.out.println(number +" x "+ number2 +" = "+result);
		
		number2 = 9;
		result = number * number2;
		System.out.println(number +" x "+ number2 +" = "+result);
		
		scanner.close();
	}

}
