package design_pattern_practice.duck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		model.setFlyBehaviour(new FlyRocket());
		model.performFly();
		
		DuckCall call = new DuckCall();
		call.performQuack();
		call.setQuackB(new Squeak());
		call.performQuack();
	}

}
