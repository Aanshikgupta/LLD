package strategydesignpattern.withsdp;

import strategydesignpattern.withsdp.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    //constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
