package jets;

import java.util.Scanner;

public class MainMenu {

	static JetsHangar jets = new JetsHangar();
	
	static PilotBarracks pilot = new PilotBarracks();

	public static void main(String[] args) {
		System.out.println("The Pilot Program!");
		System.out.println("Press any key to continue ");
		mainMenu();
	}

	public static void mainMenu() {
		jets.intializeJetsHangar();
		pilot.initializePilotBarracks();

		Scanner input = new Scanner(System.in);
	
		String enter = input.nextLine();
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.print("Pick an option: ");
			System.out.println("\n1. List Fleet " + "\n2. List Fastest Jet" + "\n3. View Jet With Longest Range"
					+ "\n4. Add A Jet To The Fleet" +"\n5. Add Pilot " + "\n6. Quit");
			char choice = input.next().charAt(0);

			switch (choice) {
			case '1':
				pilot.printBothPilotsAndJets();
				pilot.printPilots();
				keepGoing = false;
				break;
			case '2':
				jets.getFastestJet();
				keepGoing = false;
				break;
			case '3':
				jets.getLongestRange();
				keepGoing = false;
				break;
			case '4':
				jets.addJet();
				keepGoing = false;
			case '5':
				pilot.addPilot();
				break;
			case '6':
				keepGoing = false;
				break;
			default:
				System.out.println("Please Enter A Valid Choice ");

			}
		}

		input.close();

	}

}
