package enums;

public enum SportAndPlayerContentEnum {


    CanalName("SPORT"),
    ContentName("Faux Paux"),
    ContentSecondName("Faux Paux - Odcinek 4"),
    WatchLater("OBEJRZYJ PÓŹNIEJ");

    private String val;

    SportAndPlayerContentEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
