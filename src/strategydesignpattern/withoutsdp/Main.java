package strategydesignpattern.withoutsdp;

public class Main {
    public static void main(String[] args) {
        PassengerVehicle passengerVehicle=new PassengerVehicle();
        passengerVehicle.drive();

        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
