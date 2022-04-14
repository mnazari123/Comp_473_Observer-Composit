import java.util.ArrayList;
import java.util.List;



public class FacilityUse {

    private ArrayList<String> facilitiesInUse;
    private ArrayList<String> itemsToInspect;

    public FacilityUse(){
        facilitiesInUse = new ArrayList<>();
        itemsToInspect = new ArrayList<>();
    }

    public void assignFacilityToUse(String String){
        //String.assignFacilityToUse();
        if(!facilitiesInUse.contains(String)) {
            facilitiesInUse.add(String);
            itemsToInspect.add(String);
        }
        else System.out.println("String was already in use. ");
    }

    public void vacateString(String String){
        if(facilitiesInUse.contains(String) && itemsToInspect.contains(String)) {
            facilitiesInUse.remove(String);
            itemsToInspect.remove(String);

        }
        else System.out.println("String was not in use. ");
    }

    public List<String> listInspections(){
        return itemsToInspect;
    }

    public ArrayList<String> listActualUsage(){
        return facilitiesInUse;
    }

    public int calcUsageRate(String String){
        return 0;
    }


    public void setFacilityInUse(ArrayList<String> String_in_use) {
        facilitiesInUse = String_in_use;
    }

    public void setItemToInspect(ArrayList<String> item_to_inspect) {
        itemsToInspect = item_to_inspect;
    }
}
