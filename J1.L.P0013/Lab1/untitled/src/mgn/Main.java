package mgn;

import tools.Inputter;

public class Main {
    public static void main(String[] args) {
        VehicleList manager = new VehicleList();
        int choice;

        do {
            System.out.println("\n========= VEHICLE MANAGEMENT =========");
            System.out.println("1. Add new vehicle");
            System.out.println("2. Delete vehicle by ID");
            System.out.println("3. Show all vehicles");
            System.out.println("4. Show all (Descending by price)");
            System.out.println("Others. Quit");

            choice = Inputter.inputInt("Select your option: ", 1, 10);

            switch (choice) {
                case 1: manager.addVehicle(); break;
                case 2: manager.deleteVehicle(); break;
                case 3: manager.showAll(); break;
                case 4: manager.showDescendingByPrice(); break;
                default:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        } while (true);
    }
}