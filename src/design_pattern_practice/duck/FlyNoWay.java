package design_pattern_practice.duck;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
