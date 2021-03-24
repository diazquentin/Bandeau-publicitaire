package Animation;

import bandeau.Bandeau;

import java.awt.*;

public class Multicolor extends Effet {

    private int time;
    private int steps;
    private int reps;
    private Color[] colors = {Color.YELLOW, Color.BLUE, Color.GREEN, Color.GREEN};

    public Multicolor(Color couleur, String font, Bandeau bandeau, int fontSize, String message, int time, int steps, int reps) {
        super(couleur, font, bandeau, fontSize, message);
        this.time = time;
        this.steps = steps;
        this.reps = reps;
    }

    public void animation() {
        for (int j = 0; j < reps; j++) {
            for (int i = 0; i < colors.length; i++) {
                this.bandeau.setForeground(colors[i]);
                this.bandeau.sleep((time / steps));
            }
        }
    }
}