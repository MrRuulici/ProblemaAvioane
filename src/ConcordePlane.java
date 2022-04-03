public class ConcordePlane extends PassengersPlane {

	public ConcordePlane(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower, maxPassengers);
	}

	public void goSuperSonic() {
		System.out.println("PlaneID " + getPlaneID() + " - Supersonic mode activated");
	}

	public void goSubSonic() {
		System.out.println("PlaneID " + getPlaneID() + " - Supersonic mode deactivated");
	}
}
