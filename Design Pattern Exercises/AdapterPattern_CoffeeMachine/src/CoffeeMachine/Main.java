package CoffeeMachine;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		CoffeeTouchscreenAdapter newMachine = new CoffeeTouchscreenAdapter();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---- Coffee Machine -----");
		System.out.println("select A");
		System.out.println("select B\n");
		
		while (true) {
			System.out.print("Option: ");
			String option = scan.nextLine();
			
			switch (option) {
			
			case "A" :
				newMachine.chooseFirstSelection();
				break;
			
			case "B" : 
				newMachine.chooseSecondSelection();
				break;
			}
			
		}

	}

}
