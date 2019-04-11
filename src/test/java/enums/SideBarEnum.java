package enums;

public enum SideBarEnum {

    CanalName1("Zaloguj się"),
    CanalName2("Start"),
    CanalName3("Live"),
    CanalName4("Kanały TV"),
    CanalName5("Pakiety"),
    CanalName6("FILM"),
    CanalName7("SERIAL"),
    CanalName8("SPORT"),
    CanalName9("DZIECI"),
    CanalName10("ROZRYWKA"),
    CanalName11("NEWS"),
    CanalName12("WIEDZA");

    private String val;

    SideBarEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

}
