package Model;

public class HR_Chief extends AnnouncementNotifier{

    public HR_Chief(ExecutiveManager exe) {
        this.gd = exe;
        this.gd.add2NotifierList(this);
    }

    @Override
    public void subscription(){
        System.out.println("Update made to HR_Chief: " + gd.getAnno().toString());
    }

}
