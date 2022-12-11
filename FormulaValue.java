package CarryQuestion1;
import java.util.Scanner;
public class FormulaValue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of v");
	float v = sc.nextFloat();
	System.out.println("enter the value of u");
	float u = sc.nextFloat();
	System.out.println("enter the value of a");
	float a = sc.nextFloat();
	System.out.println("enter the value of s");
	float s = sc.nextFloat();
	System.out.println("enter the value of motion is");
	float motion = (v*v - u*u) / 2 * a * s;
	System.out.println(motion);
}
}
