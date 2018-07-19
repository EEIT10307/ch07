package ch07;


public class Q07_01 {
     
	
	   static { System.out.println("ÀRºA°Ï¶ô A");}
	   
	   Q07_01 () { System.out.println("«Øºc¤l"); }
	   
	   static {	  System.out.println("ÀRºA°Ï¶ô B");	   }
	   
	  public static void main(String[] args) {
		Q07_01 con = new Q07_01() ; 
		System.out.println("HaHaHa");
		  
	}

	  static {	    System.out.println("ÀRºA°Ï¶ô C");	   }
	

}
