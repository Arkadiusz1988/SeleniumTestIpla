package enums;

public enum SportAndPlayerContent {


    CanalName("SPORT"),
    ContentName("Faux Paux"),
    ContentSecondName("Faux Paux - Odcinek 4"),
    WatchLater("OBEJRZYJ PÓŹNIEJ");

    private String val;

    SportAndPlayerContent(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
