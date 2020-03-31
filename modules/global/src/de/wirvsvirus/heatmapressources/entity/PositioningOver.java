package de.wirvsvirus.heatmapressources.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PositioningOver implements EnumClass<String> {

    D_GNSS("DGNSS"),
    RTK("RTK"),
    GNSS("GNSS"),
    NONE("No Tracking allowed"),
    NR("NR"),
    UWB("UWB"),
    RED_FIR("REDFIR"),
    LTE("LTE"),
    NFC("NFC"),
    RFID("RFID"),
    BLUETOOTH("BLUETOOTH"),
    G5("5G"),
    G4("4G"),
    G3("3G"),
    G2("2G"),
    WIFI("WiFi"),
    SERVICE("Service"),
    CAMERA("Camera"),
    MOBILEPHONE("MobilePhone"),
    CHIP_IMPLANT("ImplantChip");

    private String id;


    PositioningOver(String value) {
        this.id = value;
    }


    public String getId() {
        return id;
    }


    @Nullable
    public static PositioningOver fromId(String id) {
        for (PositioningOver at : PositioningOver.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
