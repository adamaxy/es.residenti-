import java.util.Scanner;

public class HouseTester {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di piani: ");
        int floors = scanner.nextInt();
        house.setFloorsNumber(floors);

        scanner.nextLine();

        System.out.print("Inserisci l'indirizzo: ");
        String address = scanner.nextLine();
        house.setAddress(address);

        System.out.print("Inserisci i nomi dei residenti separati da virgola (es. John,Lucy,Peter): ");
        String namesInput = scanner.nextLine();
        String[] names = namesInput.split(",");
        house.setResidentsNames(names);

        scanner.close();


        System.out.println("\nDettagli della casa:");
        System.out.println("Indirizzo: " + house.getAddress());
        System.out.println("Numero di piani: " + house.getFloorsNumber());
        System.out.print("Residenti: ");
        for (String name : house.getResidentsNames()) {
            System.out.print(name + ", ");
        }
        System.out.println();
    }
}
