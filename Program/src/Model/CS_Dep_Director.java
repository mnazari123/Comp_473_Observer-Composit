package Model;

import java.util.ArrayList;

public class CS_Dep_Director extends AnnouncementNotifier{

    public CS_Dep_Director(ExecutiveManager exe) {
        this.gd = exe;
        this.gd.add2NotifierList(this);
    }

    @Override
    public void subscription(){
        System.out.println("Update made to CS_Dep_Director: " + gd.getAnno().toString());
    }
}
