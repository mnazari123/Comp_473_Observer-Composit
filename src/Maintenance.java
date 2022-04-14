import java.util.ArrayList;

/**
 * Class to handle all the maintenance-related class. This is the class
 * that Facility will call to do any time of maintenance, which means
 * that the Facility class won't interact directly with the other
 * maintenance classes.
 */

public class Maintenance implements IMaintenance{
	
	@Override
	public int Maintenance(DownTime downtime) {
		return downtime.getDowntime();
	}

	@Override
	public int Maintenance(MaintenanceCost maintenance_cost) {
		return maintenance_cost.getMaintenanceCost();	
	}

	@Override
	public float Maintenance(ProblemRate problem_rate) {
		return problem_rate.getProblemRate();	
	}

	@Override
	public void Maintenance(MaintenanceRequestManager MaintenanceRequestManager) {
		MaintenanceRequestManager.getFacilityMaintRequest();
		
	}
	

}
