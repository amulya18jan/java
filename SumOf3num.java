package CarryQuestion1;
import java.util.Scanner;
public class SumOf3num {
 public static void main(String[] args) {
	System.out.println("Sum of three number");
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter First Num");
	float a = sc.nextFloat();
	System.out.println("Enter Second num");
	float b = sc.nextFloat();
	System.out.println("Enter third num");
	float c = sc.nextFloat();
	System.out.println("your Sum is ");
	float Sum = a+b+c;
	System.out.println(Sum);
}
}
