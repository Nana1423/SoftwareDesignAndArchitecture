package CoffeeMachine;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	OldCoffeeMachine newMachine = new OldCoffeeMachine();

	public void chooseFirstSelection() {
		newMachine.selectA();
	};
	public void chooseSecondSelection() {
		newMachine.selectB();
	};
}
