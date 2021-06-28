package test2;
public class buff {
public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="java";
s=s.concat("is better");
System.out.println(s);
StringBuffer sb=new StringBuffer("java");
sb.append("is better");
System.out.println("sb");
System.out.println(sb.capacity());
System.out.println(sb.charAt(3));
sb.insert(2," tezt");
System.out.println(sb);
StringBuilder sb1=new StringBuilder("world");
sb1.append("is better");
System.out.println(sb1);
System.out.println(sb1.capacity());
System.out.println(sb1.charAt(3));
System.out.println(sb1.charAt(3));
sb.insert(2,"tezt");
System.out.println(sb1);
}

}
