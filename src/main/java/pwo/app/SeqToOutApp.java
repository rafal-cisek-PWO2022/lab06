package pwo.app;

import pwo.utils.SequenceTools;

public class SeqToOutApp extends SeqToFileApp {
    @Override
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
    protected boolean writeSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(seqType.getGenerator(), from, to));
        return true;
    }

    @Override
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
