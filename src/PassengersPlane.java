public class PassengersPlane extends AllPlanes {
    private int maxPassengers;
    public PassengersPlane(String planeID, int totalEnginePower, int maxPassengers){
        super(planeID, totalEnginePower);
        this.maxPassengers=maxPassengers;

    }
    public int getMaxPassengers() {
        return maxPassengers;
    }
}
