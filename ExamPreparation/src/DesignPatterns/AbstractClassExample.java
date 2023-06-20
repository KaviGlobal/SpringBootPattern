package DesignPatterns;

abstract class Bike {
	abstract void run();
}

public class AbstractClassExample extends Bike {

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

	public static void main(String args[]) {

		Bike b = new AbstractClassExample();
		b.run();
	}
}
