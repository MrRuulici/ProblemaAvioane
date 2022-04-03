public class MigPlanes extends FightingPlane {

	public MigPlanes(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}

	public void highSpeedGeometry() {
		System.out.println("PlaneID " + getPlaneID() + " - High speed geometry selected");
	}

	public void normalGeometry() {
		System.out.println("PlaneID " + getPlaneID() + " - Normal geometry selected");
	}
}
