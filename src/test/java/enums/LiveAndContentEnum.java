package enums;

public enum LiveAndContentEnum {

    Today("DZISIAJ 15 kwietnia"),
    CanalName("Live"),
    Content("Polityka na ostro (transmisja bezpłatna)");

    private String val;

    LiveAndContentEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
