package strategydesignpattern.withsdp;


import strategydesignpattern.withsdp.strategy.DriveStrategy;
import strategydesignpattern.withsdp.strategy.NormalDriveCapability;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveCapability());
    }
}
