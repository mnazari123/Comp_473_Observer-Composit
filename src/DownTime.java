



/**
 * Class to calculate downtime of a given facility
 */

public class DownTime implements Maintenance_details{
	Facility facility;
	
	public DownTime (Facility facility) {
		this.facility = facility;
	}
	
	public int calculateDowntime(Facility facility) {
		return 10;
		}
	
	
	public int getDowntime() {
		return calculateDowntime(facility);
	}
	
	@Override
	public void Calculation(IMaintenance maintenance) {
		maintenance.Maintenance(this);
	}


	
	
	

	

}
