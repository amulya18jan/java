
public class Factorial {
public static void main(String[] args) {
	int number = 123;
	int digit = 0;
	int factorial = 1;
	int sum = 0;
	int temp = number;
	while(number >  0) {
		digit = number % 10;
		for(int i = 1; i<=digit; i++) {
		factorial = factorial * i;
		}
		sum = sum + factorial;
		factorial = 1;
		number = number / 10;
	}
	if(sum == temp) {
		System.out.println("number is strong");
	}
	else {
		System.out.println("number is not strong number");
	}
}
}
