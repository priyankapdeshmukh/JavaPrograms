package test;
public class marray {
public static void main(String[] args) {
		// TODO Auto-generated method stub
   // int a[]
	int b[][]={{2,3},
			   {4,5}};
	int c[][]=new int[2][2];
	c[0][0]=10;
	c[0][1]=12;
	c[1][0]=14;
	c[1][1]=15;
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
			}
	    for(int i=0;i<2;i++) {
	    	for(int j=0;j<2;j++){
	    	System.out.print(c[i][j]+" ");	
	    	}
	    	System.out.println(" ");
	    }
	}
}
