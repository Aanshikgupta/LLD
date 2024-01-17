package strategydesignpattern.withoutsdp;

public class SportsVehicle extends Vehicle{
    @Override
    public void drive(){
        //same as off-road vehicle
        System.out.println("Special Capability");
    }
}
