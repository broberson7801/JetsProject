package jets;

import java.util.Scanner;

public class JetsHangar implements MphToMachConversionInterface {

	private static JetsSubClass[] hangar = new JetsSubClass[50];

	public void intializeJetsHangar() {

		hangar[0] = new JetsSubClass("Rusted P.O.S", 2f, 0, 0);
		hangar[1] = new JetsSubClass("Roller Coaster Car With Wings Glued On", 5f, 1, 150);
		hangar[2] = new JetsSubClass("Go Kart With A Rocket Bolted To The Side", 120f, 10, 5000);
		hangar[3] = new JetsSubClass("MIG 21", 1351f, 400, 3_000_000);
		hangar[4] = new JetsSubClass("The Minute Man (\"ICBM\"- one way trip)", 15_000f, 6_000, 581_000_000);

	}

	public void printHangar() {
		Scanner input = new Scanner(System.in);
		String choice = "Y";
		while (choice.equalsIgnoreCase("Y")) {
			for (JetsSubClass jets : hangar) {
				if (jets != null) {
					System.out.println(jets);
				}
			}

			System.out.println();
			System.out.print("Return to Main Menu (Y) or Quit (any other key): ");
			choice = input.next();
			if (choice.equalsIgnoreCase("Y")) {
				System.out.println();
				MainMenu.mainMenu();
			} else {
				break;
			}
		}

		input.close();
	}

	public void addJet() {

		Scanner input = new Scanner(System.in);
		String choice = "Y";
		while (choice.equalsIgnoreCase("Y")) {
			System.out.print("Enter The Model: ");
			String model = input.next();

			System.out.print("Enter The Speed (mph): ");
			float speed = input.nextFloat();

			System.out.print("Enter The Range: ");
			double range = input.nextDouble();

			System.out.print("Enter The Price: ");
			double price = input.nextDouble();

			for (int i = 0; i < hangar.length; i++) {
				if (hangar[i] == null) {
					hangar[i] = new JetsSubClass(model, speed, range, price);
					System.out.println();
					System.out.print("Enter Another Jet? (Y/N) ");
					choice = input.next();

					if (!choice.equalsIgnoreCase("Y")) {
						System.out.println("You be returned to the main menu: ");
						System.out.println();
						MainMenu.mainMenu();
						break;
					} else if (choice.equalsIgnoreCase("Y")) {
						System.out.println();
						addJet();
					}
				}

			}
		}

		input.close();
	}

	public void initializeHangarArray() {
		for (int i = 0; i < hangar.length; i++) {
			hangar[i] = new JetsSubClass("-", 0, 0, 0);
		}
	}

	@Override
	public void milesPerHourToMachConversion(float speed) {
		float mach = speed * (float) 0.001303;
		System.out.println("Mach: " + mach);
		System.out.println();
	}

	public void getFastestJet() {

		Scanner input = new Scanner(System.in);
		String choice = "Y";
		while (choice.equalsIgnoreCase("Y")) {
			JetsSubClass fastestJet = hangar[0];
			JetsSubClass slowestJet = hangar[0];

			for (int i = 0; i < hangar.length; i++) {
				if (hangar[i] != null) {
					if (hangar[i].getSpeed() > fastestJet.getSpeed()) {
						fastestJet = hangar[i];
					} else if (hangar[i].getSpeed() < slowestJet.getSpeed()) {
						slowestJet = hangar[i];
					}
				}
			}

			System.out.println(fastestJet);
			milesPerHourToMachConversion(fastestJet.getSpeed());
			System.out.print("Return to Main Menu (Y) or Quit (any other key): ");
			choice = input.next();
			if (choice.equalsIgnoreCase("Y")) {
				System.out.println();
				MainMenu.mainMenu();
			} else {
				break;
			}

		}
		input.close();

	}

	public void getLongestRange() {
		Scanner input = new Scanner(System.in);
		String choice = "Y";
		while (choice.equalsIgnoreCase("Y")) {
			JetsSubClass longestRange = hangar[0];
			JetsSubClass shortestRange = hangar[0];

			for (int i = 0; i < hangar.length; i++) {
				if (hangar[i] != null) {
					if (hangar[i].getRange() > longestRange.getRange()) {
						longestRange = hangar[i];
					} else if (hangar[i].getRange() < shortestRange.getRange()) {
						shortestRange = hangar[i];
					}
				}
			}
			System.out.println(longestRange + "\n");
			System.out.print("Return to Main Menu (Y) or Quit (any other key): ");
			choice = input.next();
			if (choice.equalsIgnoreCase("Y")) {
				System.out.println();
				MainMenu.mainMenu();
			} else {
				break;
			}

		}
		input.close();

	}

	public static JetsSubClass[] getHangar() {
		return hangar;
	}

	public  void setHangar(JetsSubClass[] hangar) {
		this.hangar = hangar;
	}
}
