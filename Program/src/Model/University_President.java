package Model;

public class University_President {

    public static void main(String[] args) {
        ExecutiveManager executiveManager = new ExecutiveManager();

        AnnouncementNotifier hr_Chief = new HR_Chief(executiveManager);
        AnnouncementNotifier library_Manager = new Library_manager(executiveManager);
        AnnouncementNotifier cS_Dep_Dir = new CS_Dep_Director(executiveManager);
        AnnouncementNotifier bursar = new Bursar(executiveManager);

        Announcement anno = new Announcement();
        anno.setText("Update made!");
        anno.setTitle("New Notification");

        executiveManager.setAnno(anno);

    }
}
