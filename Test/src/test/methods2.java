package test;
public class methods2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  name();
  //class name variable=new class name;
  methods m=new methods();
  m.job();
 // int sum=add(5,3);
   methods m1=new methods();
   System.out.println(m1.add(5,8));
}
public static void name(){
		System.out.println("priyanka");
}
 public void job() {
	System.out.println("testing");
}
public int add(int a,int b){
	int c=a+b;
	return c;
}
}
