package week4;

public class AirplaneModel {
    
     String name;
     double emptyWeight;
     int numberOfSeats;
     double fuelConsumption;

    public AirplaneModel() {}

    public AirplaneModel(String name, int numberOfSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }

    public AirplaneModel(String name, double emptyWeight, int numberOfSeats, double fuelConsumption) {
        this.name = name;
        this.emptyWeight = emptyWeight;
        this.numberOfSeats = numberOfSeats;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return this.name;
    }

    public double getEmptyWeight() {
        return this.emptyWeight;
    }

    public int getSeats() {
        return this.numberOfSeats;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void addSeats(int x) {
        this.numberOfSeats += x;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", Empty Weight: " + this.emptyWeight + ", Seats: " + this.numberOfSeats + ", Fuel Consumption: " + this.fuelConsumption);
    }

    public static void display(AirplaneModel a) {
        System.out.println("Name: " + a.getName() + ", Empty Weight: " + a.getEmptyWeight() + ", Seats: " + a.getSeats() + ", Fuel Consumption: " + a.getFuelConsumption());
    }

    public int compare(AirplaneModel a) {
        return this.numberOfSeats - a.getSeats();
    }

    public static int compare(AirplaneModel a, AirplaneModel b) {
        return a.getSeats() - b.getSeats();
    }

    public static void main(String[] args) {
        AirplaneModel airplane1 = new AirplaneModel("Boeing", 200);

        System.out.println("Airplane1 seats: " + airplane1.getSeats());

        airplane1.addSeats(50);

        System.out.println("Airplane1 seats after adding: " + airplane1.getSeats());

        airplane1.display();

        AirplaneModel airplane2 = new AirplaneModel("Airbus", 50000, 220, 2000);

        int comparison = AirplaneModel.compare(airplane1, airplane2);
        if (comparison > 0) {
            System.out.println("Airplane with larger seats: " + airplane1.getName());
        } else if (comparison < 0) {
            System.out.println("Airplane with larger seats: " + airplane2.getName());
        } else {
            System.out.println("Both airplanes have the same number of seats.");
        }

        comparison = airplane1.compare(airplane2);
        if (comparison > 0) {
            System.out.println("Airplane with larger seats: " + airplane1.getName());
        } else if (comparison < 0) {
            System.out.println("Airplane with larger seats: " + airplane2.getName());
        } else {
            System.out.println("Both airplanes have the same number of seats.");
        }
    }
}
