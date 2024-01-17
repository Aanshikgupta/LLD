package strategydesignpattern.withsdp;

import strategydesignpattern.withsdp.strategy.DriveStrategy;
import strategydesignpattern.withsdp.strategy.SpecialDriveCapability;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {super(new SpecialDriveCapability());}
}
