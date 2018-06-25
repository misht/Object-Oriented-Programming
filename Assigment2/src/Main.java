import java.util.Scanner;

public class Main {

	static Scanner read = new Scanner(System.in);
	
	public static Plot createPlot() {
		String name, latitude, longitude; 
		double area;
		Plot plot;
		Building building;
		
		System.out.println("Please enter the next information: \nPlot: ");
		System.out.print("Name: ");
		name = read.nextLine();
		System.out.print("Latitude: ");
		latitude = read.nextLine();
		System.out.print("Longitude: ");
		longitude = read.nextLine();
		System.out.print("Area: ");
		area = read.nextDouble();
		building = createBuilding();
		
		plot = new Plot(name, latitude, longitude, area, building);
		return plot;
	}
	
	public static Building createBuilding() {
		double area;
		int numberRooms, houseOccupants;
		Resident resident;
		Building building;
		
		System.out.println("Building: ");
		System.out.print("Area: ");
		area = read.nextDouble();
		System.out.print("Number Rooms: ");
		numberRooms = read.nextInt();
		System.out.print("House Occupants: ");
		houseOccupants = read.nextInt();
		resident = createResident();
		
		building = new Building(area, numberRooms, houseOccupants, resident);
		return building;
	}
	
	public static Resident createResident() {
		Resident resident;
		String name, birthDate;
		
		System.out.println("Resident: ");
		read.nextLine();
		System.out.print("Name: ");
		name = read.nextLine();
		System.out.print("Birthdate: ");
		birthDate = read.nextLine();
		
		resident = new Resident(name, birthDate);
		return resident;
	}
	
	public static void displayInformation(Plot p) {
		System.out.println("\nPlot location: \n" + p.toString() + "\nBuilding details: \n"+ p.getBuilding().toString() + "\nResident data: \n" + p.getBuilding().getResident().toString());
	}
	
	public static void main(String[] args) {
		Plot p = createPlot();
		displayInformation(p);
	}

}
