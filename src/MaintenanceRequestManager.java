

import java.util.ArrayList;

/**
 * Class to manager the maintenance requests. It keeps track of the
 * requests and creates requests.
 */

public class MaintenanceRequestManager implements Maintenance_details{
	Facility facility;
	public MaintenanceRequestManager(Facility facility) {
		this.facility = facility;
	}
	
	public ArrayList<Facility> listMaintRequests(ArrayList<Facility> facilityList){
        ArrayList<Facility> facilitiesWithMaintReq = new ArrayList<>();
        for(Facility f: facilityList){
            if(f.getIsScech()){
                facilitiesWithMaintReq.add(f);
            }
        }
        return facilitiesWithMaintReq;
    }
	
	public void makeFacilityMaintRequest(Facility facility){
        if(facility.getIsScech()) {
            System.out.println("The facility already has a maintenance scheduled");
            return;
        }
        
        //facility.getName().updateFacilityDetail(facility, "maintenanceIsScheduled", "true");
    }
	public void getFacilityMaintRequest() {
		makeFacilityMaintRequest(facility);
	}
	@Override
	public void Calculation(IMaintenance maintenance) {
		maintenance.Maintenance(this);
		
	}


}
