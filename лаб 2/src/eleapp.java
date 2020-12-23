import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class eleapp {
    String name;
    ArrayList<app> homeapps;
    Arraylist<homeapps> app;

    public static void main(String[] args) {
        eleapp elapp = new eleapp();
        elapp.app = new ArrayList<homeapps();
        homeapps homeapp_temp = new homeapps("Teapot", 500, 1500, 450);
        elapp.app.add(homeapp_temp);
        homeapp_temp = new homeapps("iron", 600, 2000, 650);
        elapp.app.add(homeapp_temp);
        homeapp_temp = new homeapps("Multicooker", 900, 7000, 1100)
        elapp.app.add(homeapp_temp);

        elapp.Critery();
    }
}

    public int ElePower(){return app.size(); }

    public void SortRange() {
    Collections.sort(app, new Comparator<eleapp>()){
        @Override
            public int compare(eleapp o1, eleapp o2) {return o1.selfpower - o2.selfpower; }
    });
    for (int i = 0; i<app.size(); i++) {
        System.out.println(app.get(i).name);
        }
    }
    public void Critery(int selfpower_min, int selfpower_max) {
        for (int i = 0; i < app.size(); i++) {
            if (app.get(i).realtimepower >= selfpower_min && app.get(i).realtimepower <= selfpower_max) {
                System.out.println(app.get(i).name);
            }
        }
    }
}
