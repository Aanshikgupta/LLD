package strategydesignpattern.withsdp.strategy;

public class NormalDriveCapability implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
