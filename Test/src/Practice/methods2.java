package Practice;
public class methods2 {
    public static int add(int a,int b){
	int c=a+b;
	return c;
    }
	public static int sub (int a,int b){
    int c=a-b;
	return c;
	}	
	int mul(int a,int b){
	int c=a*b;	
	return c=a*b;	
	}
	int div(int a,int b){
	int c=a/b;	
	return c=a/b;	
	}
	public static void main (String args[]) {
    System.out.println(add(5,3));
    System.out.println(sub(10,5));
    methods2 c=new methods2();
    System.out.println(c.mul(12,12));
    System.out.println(c.div(18,6));
	}
	
}


