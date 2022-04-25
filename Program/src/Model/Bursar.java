package Model;

public class Bursar extends AnnouncementNotifier {

    public Bursar(ExecutiveManager exe) {
        this.gd = exe;
        this.gd.add2NotifierList(this);
    }

    @Override
    public void subscription(){
        System.out.println("Update made to Bursar: " + gd.getAnno().toString());
    }
}
