package strategydesignpattern.withsdp;


import strategydesignpattern.withsdp.strategy.SpecialDriveCapability;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SpecialDriveCapability());
    }
}
