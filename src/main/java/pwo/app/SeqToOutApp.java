package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Klasa odpowiadająca za wyświetlanie
 * wyników obliczeń do StdOut
 * 
 * @author Rafał
 * @version 1.0.0
 */
public class SeqToOutApp extends SeqToFileApp {
    @Override
    /**
     * {@inheritDoc}
     */
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) {
            return true;
        }

        if (seqType != null && from >= 0 && to >= 0) {
            return true;
        }

        return false;
    }

    @Override
    /**
     * Metoda wyświetlająca sekwencję do StdOut
     */
    protected boolean writeSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(seqType.getGenerator(), from, to));
        return true;
    }

    @Override
    /**
     * {@inheritDoc}
     */
    public void run(String[] args) {
        System.out.println("Sequence to terminal CLI app");
        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }
        writeSeq();
    }
}
