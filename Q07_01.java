package ch07;


public class Q07_01 {
     
	
	   static { System.out.println("�R�A�϶� A");}
	   
	   Q07_01 () { System.out.println("�غc�l"); }
	   
	   static {	  System.out.println("�R�A�϶� B");	   }
	   
	  public static void main(String[] args) {
		Q07_01 con = new Q07_01() ; 
		System.out.println("HaHaHa");
		  
	}

	  static {	    System.out.println("�R�A�϶� C");	   }
	

}
