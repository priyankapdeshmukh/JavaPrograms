package test2;

public class ochild extends oparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ochild p=new ochild();
   p.parent();
   ochild c=new ochild();
   c.parent();
	   
   
	}
  public void parent(){
	  System.out.println("Child");
  }
 
}
