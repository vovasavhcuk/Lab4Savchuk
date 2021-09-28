package Stringrebuilder;

public class Compress {
    private String str;

    public Compress(String str) {
        this.str = output(str);
    }

    public String output(String str){
        String trim = str.trim();
        return trim;
    }

    @Override
    public String toString() {
        return "Compress" +
                " str=" + str;
    }
}

