package CarryQuestion1;

public class MinArray {
	public static void main(String[] args) {
		int [] numb = {23,44,35,98,88};
		int min = numb[0];
		for(int i=1;i< numb.length;i++) {
		if(numb[i]<min) {
			min=numb[i];
		}
		
		}
		System.out.println("min value is"+ min);
	}
	}


