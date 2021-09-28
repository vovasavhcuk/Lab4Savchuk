package Stringrebuilder;

public class Invert {
    private String str;

    public Invert(String str) {
        this.str = output(str);
    }

    public String output(String str){
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public String toString() {
        return "Invert "+ "str=" + str;
    }
}
