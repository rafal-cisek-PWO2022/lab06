package pwo.app;

import pwo.seq.SeqType;
import pwo.utils.SequenceTools;

/**
 * Klasa zapisująca wyniki obliczeń do pliku tekstowego
 */
public class SeqToFileApp {
    protected SeqType seqType;
    protected Integer from, to;
    protected String filename;

    /**
     * Metoda pobierająca argumenty
     * @param args - argumenty z linii poleceń
     * @return false - błędy w parsowaniu, true - brak błędów
     */
    protected boolean getArgs(String[] args) {
        try {
            seqType = SeqType.fromString(args[0]);
            from = Integer.parseInt(args[1]);
            to = Integer.parseInt(args[2]);
            filename = args[3];
        } catch (Exception e) {
            return false;
        }

        if (seqType != null && from >=0 && to >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Metoda zapisująca sekwencję do pliku
     * @return true - bez błędów, false - błędy
     */
    protected boolean writeSeq() {
        return SequenceTools.writeToFile(seqType.getGenerator(), from, to, filename);
    }

    /**
     * Metoda uruchamiająca część główną programu
     * @param args - argumenty z linii poleceń
     */
    public void run(String[] args) {
        System.out.println("Sequence to file CLI app");
        if (!getArgs(args)) {
            System.out.println("Illegal arguments\n Legal usage: seqName from to fileName");
            return;
        }

        if (!writeSeq()) {
            System.out.println("Write to the file: " + filename + " FAILED!");
            return;
        }

        System.out.println("Results has been written to " + filename);
    }
}
