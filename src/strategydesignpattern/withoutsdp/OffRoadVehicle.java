package strategydesignpattern.withoutsdp;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive(){
        //same as sports vehicle
        System.out.println("Special Capability");
    }
}
