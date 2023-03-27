package design_pattern_practice.duck;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack Quack");
	}
	
}
