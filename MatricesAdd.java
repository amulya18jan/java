package CarryQuestion1;

public class MatricesAdd {
public static void main(String[] args) {
	int [][]a= {{3,4,5},{5,6,8}};
	int [][]b= {{1,2,3},{4,5,6}};
	
	int [][]add= {{0,0,0},{0,0,0}};
	
	for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++){
	
		
		add[i][j]=a[i][j] + b[i][j];
		System.out.print(add[i][j] +" ");
	}
	System.out.println(" ");
	}
}
}
 