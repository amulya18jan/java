package CarryQuestion1;
import java.util.Scanner;
public class PercentageCal {
 public static void main(String[] args) {
	System.out.println("enter the marks of 5 subjects");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the marks of first subject");
	float a = sc.nextFloat();
	System.out.println("enter the marks of second subject");
	float b = sc.nextFloat();
	System.out.println("enter the marks of Third subject");
	float c = sc.nextFloat();
	System.out.println("enter the marks of fourth subject");
	float d = sc.nextFloat();
	System.out.println("enter the marks of fiffth subject");
	float e = sc.nextFloat();
System.out.println("your percentage is");
float ttl =(a+b+c+d+e);
float per =(ttl/500)*100;
System.out.println(per);
 }
}
