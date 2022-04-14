
public class FacilityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facility facility = new Facility();
		
		IMaintenance main = new Maintenance();
		int r = main.Maintenance(new DownTime(facility));
		
		System.out.println(r);
	}

}
