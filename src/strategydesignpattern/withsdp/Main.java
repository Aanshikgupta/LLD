package strategydesignpattern.withsdp;

public class Main {
    public static void main(String[] args) {
        Vehicle passengerVehicle=new PassengerVehicle();
        passengerVehicle.drive();

        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
