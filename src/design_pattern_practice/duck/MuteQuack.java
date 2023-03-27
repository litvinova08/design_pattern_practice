package design_pattern_practice.duck;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<< silence >>");
	}

}
