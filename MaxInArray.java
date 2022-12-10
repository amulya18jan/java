package CarryQuestion1;

public class MaxInArray {
public static void main(String[] args) {
	int [] numb = {23,44,35,98,88};
	int max = numb[0];
	for(int i=1;i< numb.length;i++) {
	if(numb[i]>max) {
		max=numb[i];
	}
	
	}
	System.out.println("max value is"+ max);
}
}
