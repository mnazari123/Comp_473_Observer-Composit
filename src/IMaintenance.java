
public interface IMaintenance {
	
	public int Maintenance(DownTime downtime);
	public int Maintenance(MaintenanceCost maintenance_cost);
	public float Maintenance(ProblemRate problem_rate);
	public void Maintenance(MaintenanceRequestManager MaintenanceRequestManager);
}
