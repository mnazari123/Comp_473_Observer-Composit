package Model;

import java.util.ArrayList;

public class ExecutiveManager {

    private Announcement anno;
    private final ArrayList <AnnouncementNotifier> announcement;

    public ExecutiveManager() {
        this.anno = null;
        this.announcement = new ArrayList<>();
    }

    public ExecutiveManager(Announcement anno, ArrayList<AnnouncementNotifier> announcement) {
        this.anno = anno;
        this.announcement = announcement;
    }

    public Announcement getAnno() {
        return anno;
    }

    public void setAnno(Announcement anno) {
        this.anno = anno;
        notifyBoardMember();
    }

    public void add2NotifierList(AnnouncementNotifier ann){
        announcement.add(ann);
    }

    public void notifyBoardMember(){
        for (AnnouncementNotifier ann: announcement){
            ann.subscription();
        }
    }
}
