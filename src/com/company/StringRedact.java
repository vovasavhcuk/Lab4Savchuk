package com.company;

import Stringrebuilder.Compress;
import Stringrebuilder.Invert;

public class StringRedact {
    private Invert strI;
    private Compress strC;

    public StringRedact() {
    }

    public StringRedact(String str) {
        this.strI = new Invert(str);
        this.strC = new Compress(str);
    }

    @Override
    public String toString() {
        return "StringRedact" +
                "\nstrI=" + strI.toString() +
                "\nstrC=" + strC.toString();
    }
}
