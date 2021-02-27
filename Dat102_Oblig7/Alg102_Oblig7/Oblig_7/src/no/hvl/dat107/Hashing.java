package no.hvl.dat107;

public class Hashing {
	public static void main(String[] args) {
		
		String ab="ab";
		String abc="123";
		
		System.out.println(ab.hashCode());
		System.out.println(abc.hashCode());
		
		 Student a = new Student(10, "Ole");   
		 Student b = new Student(10, "Ole"); 
		 
		 
		 if(a.equals(b)) {
			 System.out.println(a.hashCode());   
		 } else {
		    System.out.println(a.hashCode());     
		    System.out.println(b.hashCode());
		 }
		 
	}
}
