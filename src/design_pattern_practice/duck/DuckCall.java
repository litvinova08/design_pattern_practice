package design_pattern_practice.duck;

public class DuckCall {

	QuackBehaviour quackBehaviour;
	
	public DuckCall() {
		quackBehaviour = new MuteQuack();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void setQuackB(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
}
