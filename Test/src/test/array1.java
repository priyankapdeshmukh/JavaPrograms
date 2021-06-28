package test;
public class array1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
//0...n-1
//similar data collection
//contigious
//size fixed	
	// int a[];
	// int []b;
	//data type variable[]={value1,vaiue2}
	//data type variable[]=new data type[size]
	int a[]={10,20,30,40,50};
	int b[]=new int[5];
	b[0]=10;
	b[1]=20;
	b[2]=30;
	b[3]=40;
	b[4]=50;
	int size1=a.length;
	int size2=b.length;
	for(int i=0;i<size1;i++){
		System.out.println(a[i]);
	}
    for (int j=0;j<size2;j++){
    	System.out.println(a[j]);
    }   
		
}

}
