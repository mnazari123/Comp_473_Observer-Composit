


/**
 * Class to get the maintenance cost of a given facility
 */

public class MaintenanceCost implements Maintenance_details{

	private final int costPerHour = 100;
	private Facility facility;
	
	public MaintenanceCost(Facility facility) {
		this.facility = facility;
	}

	public int calculateMaintenanceCost(Facility facility) {
		return 5;
	}
	public int getMaintenanceCost() {
		return calculateMaintenanceCost(facility);
	}
	@Override
	public void Calculation(IMaintenance maintenance) {
		maintenance.Maintenance(this);	
	}
}
