package enums;

public enum MovieAndScrollEnum {

    CanalName("FILM"),
    ContentName("Akcja"),
    MovieName("G.I. Joe: Czas Kobry");

    private String val;

    MovieAndScrollEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

}
