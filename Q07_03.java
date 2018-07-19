package ch07;

abstract class Human {

	int weight = 50;

	abstract void smile();
}

class OrdinaryPeople extends Human {

	void smile() {
		System.out.println("HA");
	}

}

class HappyMary extends OrdinaryPeople {

}

public class Q07_03 {

	public static void main(String[] args) {
		HappyMary hm = new HappyMary();
		hm.smile();

	}

}
