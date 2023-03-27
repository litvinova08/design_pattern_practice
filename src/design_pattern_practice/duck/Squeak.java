package design_pattern_practice.duck;

public class Squeak implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("Squeak Squeak");
	}

}
