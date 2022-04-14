

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Class to calculate the problem rate within the company.
 * It takes into account all the facilities belonging to the
 * company.
 */

public class ProblemRate implements Maintenance_details{
	
	
	
	private final HashMap<Facility, Boolean> isProb = new HashMap<>();

	ArrayList<Facility> facilityList;
	
	public ProblemRate(ArrayList<Facility> faciltyList) {
		this.facilityList = facilityList;
	}
	
	public float calculateProblemRate(ArrayList<Facility> facilityList) {
		return 0;
	}

	public boolean facilityHasProblem (String facility){ // FacilityProblem
		return isProb.get(facility);
	}
	
	public float getProblemRate() {
		return calculateProblemRate(facilityList);
	}		
	@Override
	public void Calculation(IMaintenance maintenance) {
		maintenance.Maintenance(this);	
	}

}
