package enums;

public enum ChannelsTvAndContentEnum {
    CanalName("Kanały TV"),
    ContentName("Polsat Sport Premium 1");

    private String val;

    ChannelsTvAndContentEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
