import java.util.Scanner;

/*Comprobar que el area del dwelling es menor que el area completa*/

public class Main {

	private static Scanner read = new Scanner(System.in);
	private static PlotContainer plotContainer = new PlotContainer();
	
	private static Plot getPlot() {
		String name, address;
		double area;
		Plot plot;
		
		System.out.println("\nPlot information: ");
		System.out.print("Name: ");
		name = read.nextLine();
		System.out.print("Address: ");
		address = read.nextLine();
		System.out.print("Area: ");
		area = read.nextDouble();
		read.nextLine();
		plot = new Plot(name, address,area, getBuilding());
		return plot;
	}
	
	private static Building getBuilding() {
		String type,residentName;
		int dwellingsNumber,rooms;
		double dwellingsArea;
		Building building = null;
		
		System.out.println("Building information: ");
		System.out.print("Type (Terraced houses, detached houses or block of flats): ");
		type = read.nextLine();
		System.out.print("Dwellings number: ");
		dwellingsNumber = read.nextInt();
		System.out.print("Rooms: ");
		rooms = read.nextInt();
		System.out.print("Dwellings area: ");
		dwellingsArea = read.nextDouble();
		read.nextLine();
		System.out.print("Resident name: ");
		residentName = read.nextLine();
		while (building == null) {
			building = getTypeBuilding(type, dwellingsNumber, rooms, dwellingsArea, residentName);
			if (building == null) {
				System.out.print("Type (Terraced houses, detached houses or block of flats): ");
				type = read.nextLine();
			}
		}
		return building;
	}
	
	private static Building getTypeBuilding(String input, int dwellingsNumber, int rooms, double dwellingsArea, String resident) {
		Building building = null;
		
		if (input.equalsIgnoreCase("Block of flats")) { 
			building = new BlockOfFlats(dwellingsNumber, rooms, dwellingsArea, resident);
		}else if (input.equalsIgnoreCase("Detached houses")) {
			building = new DetachedHouses(dwellingsNumber, rooms, dwellingsArea, resident);
		}else if (input.equalsIgnoreCase("Terraced houses")) {
			building = new TerracedHouses(dwellingsNumber, rooms, dwellingsArea, resident);
		}
		else {
			System.out.println("The value introduces does not belong to any building.");
		}
		return building;
	}
	
	public static void menu() {
		int option;
		
		while (true) {
			System.out.println("Please choose an option: ");
			System.out.println("1. Store plot information");
			System.out.println("2. Print all the content");
			System.out.println("0. To exit");
			System.out.print("Type your option: ");
			option = read.nextInt();
			read.nextLine();
			switch(option) {
			case 0:
				System.out.println("Goodbye. Have a good day!");
				return;
			case 1:
				storePlot();
				break;
			case 2:
				printPlots();
				break;
			default:
				System.out.println("This option is not available. Try again!");
				break;
			}
			System.out.println();
		}
	}
	
	public static void storePlot() {
		String input = "-1";
		
		while(!input.equals("0")) {
			plotContainer.addPlot(getPlot());
			System.out.print("Do you want to add more? (Type 0 to exit otherwise press enter): ");
			input = read.nextLine();
		}
	}
	
	public static void printPlots() {
		if (plotContainer.getSize() == 0) {
			System.out.print("There is not content.\n");
		}else {
			plotContainer.printPlots();
		}
	}
	
	public static void main(String[] args) {
		menu();
	}
}
