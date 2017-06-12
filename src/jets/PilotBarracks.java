package jets;

import java.util.Scanner;

public class PilotBarracks {

	private Pilot pilots[] = new Pilot[50];

	public void initializePilotBarracks() {

		pilots[0] = new Pilot("Some Stumbling Drunk", 65, 40);
		pilots[1] = new Pilot("The \"Tweak\"", 25, 3);
		pilots[2] = new Pilot("Coke Sniffer", 30, 0);
		pilots[3] = new Pilot("Robo Tripper (not old enough to drink)", 18, 0);

		/*
		 * In the commented code below, I attempted to add a snarky comment to
		 * be printed for when the ICBM was showed, the pilot wouldn't exist. I
		 * could not get it to work and ran out of time attempting to get the
		 * code below implemented.
		 */

		// for (int i = 0; i > JetsHangar.getHangar().length; i++) {
		// if (JetsHangar.getHangar().equals("The Minute Man")) {
		// System.out.println("The ICBM does not have a pilot for obvious
		// reasons.");
		// }
		// }

	}

	public void initializePilotArray() {
		for (int i = 0; i < pilots.length; i++) {
			pilots[i] = new Pilot("-", 0, 0);
		}
	}

	public void printPilots() {
		for (Pilot pilot : pilots) {
			if (pilot != null) {
				System.out.println(pilot);
			} else {
				System.out.println("No Pilot for the jet.");
			}
		}

	}

	public void addPilot() {
		Scanner input = new Scanner(System.in);
		String choice = "Y";

		while (choice.equalsIgnoreCase("Y")) {
			System.out.print("Enter the pilot name: ");
			String name = input.next();

			System.out.print("Enter the pilot age: ");
			int age = input.nextInt();

			System.out.print("Enter the pilot's experience in years: ");
			int experience = input.nextInt();
			for (int i = 0; i < pilots.length; i++) {

				if (pilots[i] == null) {
					pilots[i] = new Pilot(name, age, experience);
					System.out.println();
					System.out.println("Enter another pilot (Y/N) ");
					choice = input.next();

					if (!choice.equalsIgnoreCase("Y")) {
						System.out.println("You be returned to the main menu: ");
						System.out.println();
						MainMenu.mainMenu();
						break;
					} else if (choice.equalsIgnoreCase("Y")) {
						System.out.println();
						addPilot();
					}

				}
			}
		}
		input.close();
	}

	public void printBothPilotsAndJets() {
		for (int i = 0; i < JetsHangar.getHangar().length; i++) {
			if (pilots[i] != null && JetsHangar.getHangar()[i] != null) {
				System.out.println(pilots[i] + "\n" + JetsHangar.getHangar()[i] + "\n");
			} else if (pilots[i] == null && (JetsHangar.getHangar()[i] != null)) {
				System.out.println("There is no pilot" + "\n" + JetsHangar.getHangar()[i]);
			}
		}
		System.out.println("Press Any Key to return to Main Menu");
		MainMenu.mainMenu();
	}
}
