package Animation;

import java.util.ArrayList;

public class Scenario {
    private ArrayList<Effet> effets;

    public Scenario(){
        this.effets = new ArrayList<Effet>();
    }

    public void addEffet(Effet e){
        this.effets.add(e);
    }

    public void play(){
        for(Effet e : effets){
            e.animation();
        }
    }
}
