
public class perfecrtnumber {
public static void main(String[] args) {
	int number = 4;
	int sum = 0;
	for(int i = 1; i<=number/2;i++) {
		if(number % i == 0) {
			sum =sum + i;
		}
	
	}
	System.out.println(sum);
	if(sum == number ) {
		System.out.println("number is perfect");
	}
	else {
		System.out.println("number is not perfect");
	}
}
}
