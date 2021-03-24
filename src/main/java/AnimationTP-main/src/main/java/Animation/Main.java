package Animation;

import bandeau.Bandeau;

import java.awt.*;

public class Main {
    public static void main(String args[]){
        Bandeau bd = new Bandeau();

        Scenario scenario = new Scenario();
        scenario.addEffet(new Zoom(Color.DARK_GRAY, "Roboto", bd, 10, "Testeur", 20, 3000, 10, 3));
        scenario.addEffet(new Multicolor(Color.DARK_GRAY, "Roboto", bd, 10, "Testeur", 3000, 10, 3));
        scenario.addEffet(new Tourne(Color.DARK_GRAY, "Roboto", bd, 10, "Testeur", 3000, 10, 3));
        scenario.play();
    }
}
