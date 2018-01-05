package dev;

import java.util.ResourceBundle;
import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	String asciiArt = FigletFont.convertOneLine("App");
    	String asciiArts = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);
        System.out.println(asciiArts);
        System.out.println( "Hello World!");
        // affichage de l'environnement
        String environnement = ResourceBundle.getBundle("application").getString("environnement");
        System.out.println("Environnement : " + environnement);
    }
}
