
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Balkendiagramm_Zufall.
 * Beschreibung: 
 *
 * @author Thomas Schaller, Simon Gebert 
 * @version 05.02.2020
 */
public class Balkendiagramm_Zufall extends PApplet
{ 
    int[] zahlen;    
    // Schriften
    PFont kleineSchrift;  
    PFont grosseSchrift;  

    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1000,700);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(0);
        kleineSchrift = loadFont("KleineSchrift.vlw");
        grosseSchrift = loadFont("GrosseSchrift.vlw");

        // Zufallszahlen erzeugen und anzeigen
        erzeugeZufallsarray(20);
        zeichneBalken();
    }

    public int getZufallszahl(int min, int max) {
        java.util.Random r = new java.util.Random();
        return r.nextInt(max-min+1)+min;
    }

    public void erzeugeZufallsarray(int laenge) {
        // ToDo: Neues Array der richtigen Länge erzeugen

        // ToDo: Jedes Element mit einer Zufallszahl belegen

    }

    public void zeichneBalken() {

        clear();

        // Überschrift
        fill(255,255,255);
        textFont(grosseSchrift);
        text("Balkendiagramm", 2, 20);
        textFont(kleineSchrift);  

        // ----------------------------------------------------------------------
        // To Do
        // ----------------------------------------------------------------------
        // Alle Einträge darstellen -> Aus vorheriger Aufgabe 'Balkendiagramm' kopieren
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Balkendiagramm_Zufall.class.getName() });
    }

}
