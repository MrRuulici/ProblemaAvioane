public class TomCatPlanes extends FightingPlane {

    public TomCatPlanes(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void refuel(){
        System.out.println("PlaneID "+getPlaneID()+" - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
    }
}
