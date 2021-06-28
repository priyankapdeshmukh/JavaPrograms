package test2;

public class overload {

public static int add (int a,int b){
	int c=a+b;
	return c;
}
public static int add (int a,int b,int d){
	int c=a+b+d;
	return c;	
}
public static int add (int a,int b,int d,int e){
	int c=a+b+d+e;
	return c;	
}
public float add(float a,float b){
	float c=a+b;
	return c;
}
public static void main(String[]args){
	overload l=new overload();
	System.out.println(l.add(5,6));
	System.out.println(l.add(5,6,7));
	System.out.println(l.add(5,6,7,8));
	System.out.println(l.add(10,5));
}
}

	
	

