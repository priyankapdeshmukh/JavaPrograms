package test;
//child extends parent
//subclass extents superclass
public class child extends Parents{
	public static void main(String[]args){
	child cd=new child();
	cd.car();
	cd.house();
	cd.study();
	Parents p=new Parents();
	p.car();
	p.house();
	Parents p1=new child();
	p1.car();
	p1.house();
	}
	public void study(){
		System.out.println("study");
	}
     
	
}
