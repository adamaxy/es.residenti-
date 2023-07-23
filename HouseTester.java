import java.util.Scanner;

class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    // Getter e Setter per floorsNumber
    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    // Getter e Setter per address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter e Setter per residentsNames
    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }
}

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