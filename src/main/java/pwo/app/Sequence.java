package pwo.app;

/**
 * Klasa domyślna projektu
 * 
 * @author Rafał
 * @version 1.0.0
 */
public class Sequence {
    /**
     * Metoda główna programu
     * @param args argumenty przekazywane z linii poleceń
     */
    public static void main (String[] args) {
        switch(args.length) {
            case 3: new SeqToOutApp().run(args); break;
            case 4: new SeqToFileApp().run(args); break;
            default: System.out.println("Illegal arguments \nLegal usage: seqName from to [fileName]");
        }
    }
}
