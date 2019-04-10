package enums;

public enum LiveAndContentEnum {

    Today("DZISIAJ 10 kwietnia"),
    CanalName("Live"),
    Content("Polityka na ostro (transmisja bezpłatna)"),
    HIGH("high");

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
