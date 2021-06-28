package test2;
import java.util.*;
public class stc {
public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stack <String> s=new Stack<String> ();
  s.push("ab");
  s.push("ac");
  s.push("ad");
  //System.out.println(s.peek());
  s.push("ae");
  //System.out.println(s.peek());
  s.pop();
  //System.out.ptintln(s.peek());
  Iterator i=s.iterator();
while(i.hasNext()){
	System.out.println(i.next());
	}
	}
  }
