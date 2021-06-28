package Practice;

public class methods3 {
public static void main(String[]args){
	srev("manual testing");
	System.out.println("");
	srev("Priyanka Deshmukh");
}
	
public static void srev(String s){
	char c[]=s.toCharArray();
	int size=c.length;
	for(int i=size-1;i>=0;i--){
		System.out.print(c[i]);
	}
}
}
