package Animation;
import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public abstract class Effet{
    protected Color couleur;
    protected String font;
    protected int fontSize;
    protected String message;
    protected Bandeau bandeau;

    public Effet(Color couleur, String font, Bandeau bandeau, int fontSize, String message){
        this.couleur = couleur;
        this.bandeau = bandeau;
        this.font = font;
        this.fontSize = fontSize;
        this.message = message;
        this.bandeau.setMessage(this.message);
        this.bandeau.setFont(new Font(this.font, Font.BOLD, this.fontSize));
        this.bandeau.setForeground(this.couleur);
    }

    public abstract void animation();
}
