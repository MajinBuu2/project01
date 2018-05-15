package gugudan;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		//1.사용자에게 숫자를 입력받고 number에 저장한다. 그 숫자와 곱해줄 숫자는 number2에 저장한다.
		//2.입력받은 숫자와 곱해줄 숫자를 곱셈 계산한 결과를 result에 저장한다.
		//3.result에 저장된 결과를 출력한다. 
		//4.계산이 끝나면 number2는 1이 더해져서 다시 number2에 저장된다. 
		//5.다시 2번부터 반복된다.
		//이 순서에서 겹치는 부분 : number2가 초기화 되는 부분, 곱셈 계산의 결과 result가 출력되는 부분.
		
		//구구단
		System.out.print("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number+"단을 출력합니다.");
		
		int number2 = 1;
		int result = number * number2;
		System.out.println(number+" * "+number2+" = "+result);
		
		number2 = 2;
		result = number *number2;
		System.out.println(number+" * "+number2+" = "+result);
		
		number2 = 3;
		result = number *number2;
		System.out.println(number+" * "+number2+" = "+result);
		
		number2 = 4;
		result = number *number2;
		System.out.println(number+" * "+number2+" = "+result);
		
		number2 = 5;
		result = number *number2;
		System.out.println(number+" * "+number2+" = "+result);
		
		number2 = 6;
		result = number *number2;
		System.out.println(number+" * "+number2+" = "+result);
		
		number2 = 7;
		result = number *number2;
		System.out.println(number+" * "+number2+" = "+result);
		
		number2 = 8;
		result = number *number2;
		System.out.println(number+" * "+number2+" = "+result);
		
		number2 = 9;
		result = number *number2;
		System.out.println(number+" * "+number2+" = "+result);
		
		scanner.close();
	}
}
