package Model;

public class Library_manager extends AnnouncementNotifier {

    public Library_manager(ExecutiveManager exe) {
        this.gd = exe;
        this.gd.add2NotifierList(this);
    }

    @Override
    public void subscription(){
        System.out.println("Update made to Library_manager: " + gd.getAnno().toString());
    }

}
