package Animation;

import bandeau.Bandeau;

import java.awt.*;

public class Tourne extends Effet {
    private final int endFontSize = 30;
    private int time;
    private int steps;
    private int reps;

    public Tourne(Color couleur, String font, Bandeau bandeau, int fontSize, String message, int time, int steps, int reps) {
        super(couleur, font, bandeau, fontSize, message);
        this.time = time;
        this.steps = steps;
        this.reps = reps;
    }

    public void animation() {
        int sizePlus = (this.endFontSize - this.fontSize) / steps;
        for (int j = 0; j < reps; j++) {
            for (int i = 0; i < steps; i++) {
                this.bandeau.setFont(new Font(this.font, Font.BOLD, this.fontSize + (sizePlus * i)));
                this.bandeau.setRotation(2*Math.PI*i / 100);
                this.bandeau.sleep((time / steps));
            }
        }
    }
}