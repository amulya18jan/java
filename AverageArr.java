package CarryQuestion1;

public class AverageArr {
public static void main(String[] args) {
	float [] marks= {97,48.0f,63,88,92};
	float sum = 0;
	for(int i=0; i<marks.length; i++) {
	sum += marks[i];
}
float avg =sum/marks.length;
System.out.println(avg);
}
}
